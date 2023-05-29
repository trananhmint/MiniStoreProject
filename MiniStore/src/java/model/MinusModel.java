/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class MinusModel {
    private int minusID;
    private int lateTime;
    private String description;
    private float reduction;
    private int status;
    private float fine;
    private String note;

    public MinusModel() {
    }

    public MinusModel(int minusID, int lateTime, String description, float reduction, int status, float fine, String note) {
        this.minusID = minusID;
        this.lateTime = lateTime;
        this.description = description;
        this.reduction = reduction;
        this.status = status;
        this.fine = fine;
        this.note = note;
    }

    public int getMinusID() {
        return minusID;
    }

    public void setMinusID(int minusID) {
        this.minusID = minusID;
    }

    public int getLateTime() {
        return lateTime;
    }

    public void setLateTime(int lateTime) {
        this.lateTime = lateTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getReduction() {
        return reduction;
    }

    public void setReduction(float reduction) {
        this.reduction = reduction;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getFine() {
        return fine;
    }

    public void setFine(float fine) {
        this.fine = fine;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
