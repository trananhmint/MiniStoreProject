/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDateTime;

/**
 *
 * @author DELL
 */
public class CheckInModel {
    private int checkInID;
    private LocalDateTime checInTime;
    private int userID;

    public CheckInModel(int checkInID, LocalDateTime checInTime, int userID) {
        this.checkInID = checkInID;
        this.checInTime = checInTime;
        this.userID = userID;
    }

    public int getCheckInID() {
        return checkInID;
    }

    public void setCheckInID(int checkInID) {
        this.checkInID = checkInID;
    }

    public LocalDateTime getChecInTime() {
        return checInTime;
    }

    public void setChecInTime(LocalDateTime checInTime) {
        this.checInTime = checInTime;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
}
