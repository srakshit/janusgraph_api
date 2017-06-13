package com.dxc.ess.mss.model;

/**
 * Created by Subham Rakshit on 5/30/17.
 */
public class Event {
    public String id = null;
    public String ruleDesc = null;
    public String priority = null;
    public String priorityText = null;
    public String eventDate = null;

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc){
        this.ruleDesc = ruleDesc;
    }

    public String getPriority() {
        return priority;
    }

    public void setDestination(String priority){
        this.priority = priority;
    }

    public String getPriorityText() {
        return priorityText;
    }

    public void setPriorityText(String priorityText){
        this.priorityText = priorityText;
    }

    public String getEventDate() {
        return priorityText;
    }

    public void setEventDate(String eventDate){
        this.eventDate = eventDate;
    }
}
