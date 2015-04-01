package com.android.mad.eventmanagementapp.model;

import java.io.Serializable;

/**
 * Created by Nitin on 3/29/2015.
 */
public class RoleBasedActions implements Serializable {

    private int userId;
    private int roleId;
    private int[] actions;

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

    public int[] getActions() {
        return actions;
    }

    public void setActions(int[] actions) {
        this.actions = actions;
    }

    public RoleBasedActions() {
        super();

    }

    public RoleBasedActions(int userId, int roleId, int[] actions) {

        this.userId = userId;
        this.roleId = roleId;
        this.actions = actions;
    }
}
