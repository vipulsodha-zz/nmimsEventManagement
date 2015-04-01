package com.android.mad.eventmanagementapp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Nitin on 3/30/2015.
 */
public class Event implements Serializable {

    private int eventId;
    private String eventName;
    private String eventDesc;
    private String eventDate;
    private String eventTime;

    public Event(int eventId, String eventName, String eventDesc, String eventDate, String eventTime) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDesc = eventDesc;
        this.eventDate = eventDate;
        this.eventTime = eventTime;

    }

    public Event() {
        super();
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }
}


