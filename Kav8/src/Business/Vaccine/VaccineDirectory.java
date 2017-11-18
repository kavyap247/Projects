/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.ArrayList;

/**
 *
 * @author kavyaprakash
 */
public class VaccineDirectory {

    
    private ArrayList<Vaccine> vaccineList;

    
    public VaccineDirectory() {
        vaccineList = new ArrayList<Vaccine>();
    }
    
      
         public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }
}
