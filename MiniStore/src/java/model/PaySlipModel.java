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
public class PaySlipModel {
    private int paySlipID;
    private int userID;
    private float salary;
    private int bonusID;
    private int minusID;
    private int status;
    private String note;

    public PaySlipModel(int paySlipID, int userID, float salary, int bonusID, int minusID, int status, String note) {
        this.paySlipID = paySlipID;
        this.userID = userID;
        this.salary = salary;
        this.bonusID = bonusID;
        this.minusID = minusID;
        this.status = status;
        this.note = note;
    }

    public int getPaySlipID() {
        return paySlipID;
    }

    public void setPaySlipID(int paySlipID) {
        this.paySlipID = paySlipID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonusID() {
        return bonusID;
    }

    public void setBonusID(int bonusID) {
        this.bonusID = bonusID;
    }

    public int getMinusID() {
        return minusID;
    }

    public void setMinusID(int minusID) {
        this.minusID = minusID;
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
