package com.dxc.ess.mss.controller;

import com.dxc.ess.mss.gremlin_model.*;
import com.dxc.ess.mss.model.GraphEdge;
import com.dxc.ess.mss.model.GraphResponse;
import com.dxc.ess.mss.model.GraphVertex;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.*;

/**
 * Created by Subham Rakshit on 5/30/17.
 */

@Component
@RestController
public class LogsController {

    @Value("${ip}")
    private String ip;

    @Value("${port}")
    private String port;

//    private String uri;
    private HttpHeaders headers;
    private RestTemplate restTemplate;

    public LogsController() {
        headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        restTemplate = new RestTemplate();
    }

//    public LogsController(String uri){
//        this();
//        this.uri = uri;
//    }

    public String getUri() {
        return "http://"+ip+":"+port+"/";
    }

    @RequestMapping("/logs/graph")
    public GraphResponse getLogs(@RequestParam(value = "companyId") String companyId) {
        String gremlinQuery = "{\"gremlin\" : \"g.V().has('company_id', '" + companyId + "').as('vertex').bothE().as('edge').select('vertex', 'edge')\"}";

        HttpEntity<String> entity = new HttpEntity<>(gremlinQuery, headers);

        Response response = restTemplate.postForObject(getUri(), entity, Response.class);

        Set<GraphVertex> graphVertices = new HashSet<>();
        Set<GraphEdge> graphEdges = new HashSet<>();

        Iterator<GraphComponent> records = response.getResponseBody().getRecords().iterator();

        while (records.hasNext()) {
            GraphComponent graphComponent = records.next();

            Vertex vertex = graphComponent.getVertex();
            GraphVertex graphVertex = new GraphVertex();
            graphVertex.setId(vertex.getId());
            graphVertex.setIp(vertex.getProperty().getIp().get(0).getValue());
            graphVertex.setCompany(vertex.getProperty().getCompany().get(0).getValue());
            graphVertex.setHostname(vertex.getProperty().getHostname().get(0).getValue());

            graphVertices.add(graphVertex);

            Edge edge = graphComponent.getEdge();
            GraphEdge graphEdge = new GraphEdge();
            graphEdge.setId(edge.getId());
            graphEdge.setInVertex(edge.getInVertex());
            graphEdge.setOutVertex(edge.getOutVertex());
            graphEdge.setSrcPort(edge.getProperty().getSrcPort());
            graphEdge.setDestPort(edge.getProperty().getDestPort());
            graphEdge.setTimeStamp(edge.getProperty().getTimeStamp());

            graphEdges.add(graphEdge);
        }

        GraphResponse graphResponse = new GraphResponse();
        graphResponse.setVertices(graphVertices);
        graphResponse.setEdges(graphEdges);
        return graphResponse;
    }
}