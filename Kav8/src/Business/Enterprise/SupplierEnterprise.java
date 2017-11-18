/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class SupplierEnterprise extends Enterprise{
VaccineDirectory vaccineDirectory ;

    
    public SupplierEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Supplier);
        vaccineDirectory = new VaccineDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(VaccineDirectory vaccineDirectory) {
        this.vaccineDirectory = vaccineDirectory;
    }

    
    
    
}
