package com.dxc.ess.mss.model;

/**
 * Created by Subham Rakshit on 5/30/17.
 */

public class GraphVertex {
    private String id;
    private String company;
    private String hostname;
    private String ip;

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname){
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip){
        this.ip = ip;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GraphVertex other = (GraphVertex) obj;
        if (id.equals(other.id) && company.equals(other.company) && hostname.equals(other.hostname) && ip.equals(other.ip))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }
}
