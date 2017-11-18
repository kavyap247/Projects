/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

/**
 *
 * @author kavyaprakash
 */
public class Vaccine {
    
    int vaccineNum;
    String vaccineName;
    int quantity;
    int count=0;
    
    
    
    public Vaccine(String name,int quantity,int count) {
        this.vaccineName = name;
        this.quantity = quantity;
         this.count = count; 
         this.vaccineNum = count;
    }
    
    
    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public int getVaccineNum() {
        return vaccineNum;
    }

    public void setVaccineNum(int vaccineNum) {
        this.vaccineNum = vaccineNum;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override 
    public String toString() {
        return vaccineName;
    }
}
