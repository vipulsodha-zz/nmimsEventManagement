package com.android.mad.eventmanagementapp.model;

import java.io.Serializable;

/**
 * Created by Nitin on 3/30/2015.
 */
public class RegStatus implements Serializable {

    private int userId;
    private int eventId;
    private int regStatus;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(int regStatus) {
        this.regStatus = regStatus;
    }

    public RegStatus() {
        super();

    }

    public RegStatus(int userId, int eventId, int regStatus) {

        this.userId = userId;
        this.eventId = eventId;
        this.regStatus = regStatus;
    }
}
