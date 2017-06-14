import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

/**
 * Created by Subham Rakshit on 09/06/17.
 */

public class DummyGremlinHandler extends AbstractHandler{
    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("application/json");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);

        String gremlinQuery = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));

        String data;

        switch (gremlinQuery) {
            case "{\"gremlin\" : \"g.V().has('company_id', 'ACME').as('vertex').bothE().as('edge').select('vertex', 'edge')\"}": data = Utils.getJson("logs_graph");
                               break;
            default: data = "";
                     break;
        }

        PrintWriter out = response.getWriter();
        out.println(data);
    }
}