package com.dxc.ess.mss.gremlin_model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by Subham Rakshit on 5/31/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class VertexPropertyValue {
    private String id;
    private String value;

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getValue(){
        return this.value;
    }

    public void setValue(String value){
        this.value = value;
    }
}
