package com.bryceblankinship.eventful.dto;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * EventDTO
 */

public class EventDTO {

    private UUID eventID;
    private String eventName, eventDesc;
    private Timestamp startDate, endDate;

    public EventDTO(UUID eventID, String eventName, String eventDesc){
        this.eventName = eventName;
        this.eventDesc = eventDesc;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }
}
