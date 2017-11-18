package Business;

import Business.Employee.Employee;
import Business.Enterprise.SupplierEnterprise;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.Vaccine.VaccineDirectory;
 

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    VaccineDirectory vaccineDirectory;
    int quantity;
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        
        return system;
    }
   
    
        
    }
    

