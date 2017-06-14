package com.dxc.ess.mss.gremlin_model;

/**
 * Created by Subham Rakshit on 6/5/17.
 */

public class GraphComponent {
    private Vertex vertex;
    private Edge edge;

    public Vertex getVertex() {
        return vertex;
    }

    public void setVertex(Vertex vertex) {
        this.vertex = vertex;
    }

    public Edge getEdge() {
        return edge;
    }

    public void setEdge(Edge edge) {
        this.edge = edge;
    }
}