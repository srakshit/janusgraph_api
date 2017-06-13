package com.dxc.ess.mss.model;

import java.util.Set;

/**
 * Created by Subham Rakshit on 5/31/17.
 */
public class GraphResponse {
    private Set<GraphVertex> vertices;
    private Set<GraphEdge> edges;

    public Set<GraphVertex> getVertices(){
        return vertices;
    }

    public void setVertices(Set<GraphVertex> vertices){
        this.vertices = vertices;
    }

    public Set<GraphEdge> getEdges(){
        return edges;
    }

    public void setEdges(Set<GraphEdge> edges){
        this.edges = edges;
    }
}
