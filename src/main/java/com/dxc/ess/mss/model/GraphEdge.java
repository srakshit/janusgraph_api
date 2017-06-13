package com.dxc.ess.mss.model;

/**
 * Created by Subham Rakshit on 6/5/17.
 */
public class GraphEdge {
    private String id;
    private String inVertex;
    private String outVertex;
    private String srcPort;
    private String destPort;
    private String timeStamp;

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getInVertex(){
        return this.inVertex;
    }

    public void setInVertex(String inVertex){
        this.inVertex = inVertex;
    }

    public String getOutVertex(){
        return this.outVertex;
    }

    public void setOutVertex(String outVertex){
        this.outVertex = outVertex;
    }

    public String getSrcPort(){
        return this.srcPort;
    }

    public void setSrcPort(String srcPort){
        this.srcPort = srcPort;
    }

    public String getDestPort(){
        return this.destPort;
    }

    public void setDestPort(String destPort){
        this.destPort = destPort;
    }

    public String getTimeStamp(){
        return this.timeStamp;
    }

    public void setTimeStamp(String timeStamp){
        this.timeStamp = timeStamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GraphEdge other = (GraphEdge) obj;
        if (id.equals(other.id) && inVertex.equals(other.inVertex) && outVertex.equals(other.outVertex) && srcPort.equals(other.srcPort) && destPort.equals(other.destPort) && timeStamp.equals(other.timeStamp))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
