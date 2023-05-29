/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class AttendanceModel {
    private int attendID;
    private int userID;
    private Date date;
    private Time checkIn;
    private Time checkOut;
    private int lateTime;
    private int overTime;
    private int status;
    private String note;

    public AttendanceModel() {
    }

    public AttendanceModel(int attendID, int userID, Date date, Time checkIn, Time checkOut, int lateTime, int overTime, int status, String note) {
        this.attendID = attendID;
        this.userID = userID;
        this.date = date;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.lateTime = lateTime;
        this.overTime = overTime;
        this.status = status;
        this.note = note;
    }

    public int getAttendID() {
        return attendID;
    }

    public void setAttendID(int attendID) {
        this.attendID = attendID;
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

    public Time getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Time checkIn) {
        this.checkIn = checkIn;
    }

    public Time getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Time checkOut) {
        this.checkOut = checkOut;
    }

    public int getLateTime() {
        return lateTime;
    }

    public void setLateTime(int lateTime) {
        this.lateTime = lateTime;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
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
    
    
    
    
}
