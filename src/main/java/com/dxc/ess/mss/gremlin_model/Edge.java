package com.dxc.ess.mss.gremlin_model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Subham Rakshit on 6/5/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Edge {
    private String id;

    @JsonProperty("label")
    private String text;

    @JsonProperty("inV")
    private String inVertex;

    @JsonProperty("outV")
    private String outVertex;

    @JsonProperty("properties")
    private EdgeProperty property;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getInVertex() {
        return this.inVertex;
    }

    public void setInVertex(String inVertex) {
        this.inVertex = inVertex;
    }

    public String getOutVertex() {
        return this.outVertex;
    }

    public void setOutVertex(String outVertex) {
        this.outVertex = outVertex;
    }

    public EdgeProperty getProperty() {
        return this.property;
    }

    public void setProperty(EdgeProperty property) {
        this.property = property;
    }
}
