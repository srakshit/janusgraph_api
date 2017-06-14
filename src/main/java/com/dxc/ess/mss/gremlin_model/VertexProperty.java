package com.dxc.ess.mss.gremlin_model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Subham Rakshit on 5/31/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class VertexProperty {
    private List<VertexPropertyValue> hostname;

    @JsonProperty("company_id")
    private List<VertexPropertyValue> company;

    @JsonProperty("vertex_name")
    private List<VertexPropertyValue> ip;

    public List<VertexPropertyValue> getHostname(){
        return this.hostname;
    }

    public void setHostname(List<VertexPropertyValue> hostname){
        this.hostname = hostname;
    }

    public List<VertexPropertyValue> getCompany(){
        return this.company;
    }

    public void setCompany(List<VertexPropertyValue> company){
        this.company = company;
    }

    public List<VertexPropertyValue> getIp(){
        return this.ip;
    }

    public void setIp(List<VertexPropertyValue> ip){
        this.ip = ip;
    }
}