package com.dxc.ess.mss.gremlin_model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Subham Rakshit on 5/31/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private String requestId;

    @JsonProperty("result")
    private ResponseBody responseBody;

    public String getRequestId(){
        return this.requestId;
    }

    public void setRequestId(String requestId){
        this.requestId = requestId;
    }

    public ResponseBody getResponseBody(){
        return this.responseBody;
    }

    public void setResponseBody(ResponseBody responseBody){
        this.responseBody = responseBody;
    }
}