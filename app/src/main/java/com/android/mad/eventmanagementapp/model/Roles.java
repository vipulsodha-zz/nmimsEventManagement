package com.android.mad.eventmanagementapp.model;

import java.io.Serializable;

/**
 * Created by Nitin on 3/30/2015.
 */
public class Roles implements Serializable {

    private int userId;
    private int roleId;

    public Roles() {
        super();
    }

    public Roles(int userId, int roleId) {

        this.userId = userId;
        this.roleId = roleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
