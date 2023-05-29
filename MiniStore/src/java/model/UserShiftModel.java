/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class UserShiftModel {
    private int shiftID;
    private int userID;
    private Date date;
    private int status;
    private String note;
    private boolean isOT;

    public UserShiftModel() {
    }

    public UserShiftModel(int shiftID, int userID, Date date, int status, String note, boolean isOT) {
        this.shiftID = shiftID;
        this.userID = userID;
        this.date = date;
        this.status = status;
        this.note = note;
        this.isOT = isOT;
    }

    public int getShiftID() {
        return shiftID;
    }

    public void setShiftID(int shiftID) {
        this.shiftID = shiftID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isIsOT() {
        return isOT;
    }

    public void setIsOT(boolean isOT) {
        this.isOT = isOT;
    }
    
    
}
