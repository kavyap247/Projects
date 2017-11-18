/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class StateDeptEnterprise extends Enterprise{

    public StateDeptEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.StateDept);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    
    
}
