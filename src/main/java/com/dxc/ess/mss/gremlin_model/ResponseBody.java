package com.dxc.ess.mss.gremlin_model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Subham Rakshit on 5/31/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseBody {

    @JsonProperty("data")
    private List<GraphComponent> records;

    public List<GraphComponent> getRecords() {
        return this.records;
    }

    public void setRecords(List<GraphComponent> records){
        this.records = records;
    }
}
