package com.dxc.ess.mss.gremlin_model;

/**
 * Created by Subham Rakshit on 6/5/17.
 */

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EdgeProperty {
    @JsonProperty("src_port")
    private String srcPort;

    @JsonProperty("dest_port")
    private String destPort;

    @JsonProperty("edge_timestamp")
    private String timeStamp;

    public String getSrcPort(){
        return this.srcPort;
    }

    public void setSrcPort(String srcPort){
        this.srcPort = srcPort;
    }

    public String getDestPort(){
        return this.destPort;
    }

    public void setValue(String destPort){
        this.destPort = destPort;
    }

    public String getTimeStamp(){
        return this.timeStamp;
    }

    public void setTimeStamp(String timeStamp){
        this.timeStamp = timeStamp;
    }
}
