/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Time;

/**
 *
 * @author DELL
 */
public class ShiftTimeModel {
    private int shiftID;
    private Time timeStart;
    private Time timeEnd;
    private float coeOT;
    private float coeShift;
    private float wage;
    private int status;
    private String note;

    public ShiftTimeModel() {
    }

    public ShiftTimeModel(int shiftID, Time timeStart, Time timeEnd, float coeOT, float coeShift, float wage, int status, String note) {
        this.shiftID = shiftID;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.coeOT = coeOT;
        this.coeShift = coeShift;
        this.wage = wage;
        this.status = status;
        this.note = note;
    }



    public int getShiftID() {
        return shiftID;
    }

    public void setShiftID(int shiftID) {
        this.shiftID = shiftID;
    }

    public Time getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(Time timeStart) {
        this.timeStart = timeStart;
    }

    public Time getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Time timeEnd) {
        this.timeEnd = timeEnd;
    }

    public float getCoeOT() {
        return coeOT;
    }

    public void setCoeOT(float coeOT) {
        this.coeOT = coeOT;
    }

    public float getCoeShift() {
        return coeShift;
    }

    public void setCoeShift(float coeShift) {
        this.coeShift = coeShift;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
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
