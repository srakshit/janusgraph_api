package com.dxc.ess.mss.gremlin_model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Subham Rakshit on 5/31/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Vertex{
    private String id;

    @JsonProperty("label")
    private String text;

    @JsonProperty("properties")
    private VertexProperty property;

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

    public VertexProperty getProperty() {
        return this.property;
    }

    public void setProperty(VertexProperty property) {
        this.property = property;
    }
}
