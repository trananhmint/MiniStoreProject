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
public class BonusModel {
    private int bonusID;
    private float bonus;
    private String description;
    private int status;
    private String note;

    public BonusModel() {
    }

    public BonusModel(int bonusID, float bonus, String description, int status, String note) {
        this.bonusID = bonusID;
        this.bonus = bonus;
        this.description = description;
        this.status = status;
        this.note = note;
    }

    public int getBonusID() {
        return bonusID;
    }

    public void setBonusID(int bonusID) {
        this.bonusID = bonusID;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
