/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.EcoSystem;
import Business.Enterprise.SupplierEnterprise;
import Business.Organization.InventoryOrganization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.Vaccine.VaccineDirectory;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kavyaprakash
 */
public class SupplierWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SupplierWorkArea
     */
    
    private JPanel userProcessContainer;
    private InventoryOrganization organization;
    private SupplierEnterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    VaccineDirectory vaccineDirectory;
    
    public SupplierWorkArea(JPanel userProcessContainer, UserAccount account, InventoryOrganization organization, Business.Enterprise.Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = (SupplierEnterprise)enterprise;
        this.userAccount = account;
        this.system = system;
        populateTable(); 
        populateRequestsTable();
    }

    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) VaccineTable.getModel();
        model.setRowCount(0);
        for(Vaccine v: enterprise.getVaccineDirectory().getVaccineList()){
            Object row[] = new Object[3];
            row[0] = v.getVaccineNum();
            row[1] = v;
            row[2] = v.getQuantity();
            model.addRow(row);
            
        }
        
    }
    
    public void populateRequestsTable(){
        DefaultTableModel model1 = (DefaultTableModel) supplierApproveJTable1.getModel();
        model1.setRowCount(0);
        for(WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()){
          
              Object row[] = new Object[5];
              row[0] = request;
              row[1] = request.getReceiver();
            row[2] = request.getStatus();
            row[3] = "Pending your approval";
            row[4] = request.getSender();
            
            model1.addRow(row);
                      
                      
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        supplierApproveJTable1 = new javax.swing.JTable();
        approveTestsupplierJButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VaccineTable = new javax.swing.JTable();
        btnChangeQuantity = new javax.swing.JButton();

        supplierApproveJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Receiver", "Status", "Result", "FromOrganization"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(supplierApproveJTable1);

        approveTestsupplierJButton1.setText("Approve");
        approveTestsupplierJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveTestsupplierJButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Supplier Work Area");

        VaccineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Number", "Vaccine Name", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VaccineTable);
        if (VaccineTable.getColumnModel().getColumnCount() > 0) {
            VaccineTable.getColumnModel().getColumn(0).setResizable(false);
            VaccineTable.getColumnModel().getColumn(1).setResizable(false);
            VaccineTable.getColumnModel().getColumn(2).setResizable(false);
        }

        btnChangeQuantity.setText("Change Quantity");
        btnChangeQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeQuantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(approveTestsupplierJButton1)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 28, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(265, 265, 265))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnChangeQuantity)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChangeQuantity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(approveTestsupplierJButton1)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void approveTestsupplierJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveTestsupplierJButton1ActionPerformed
      
        int selectedRow = supplierApproveJTable1.getSelectedRow();

       if (selectedRow < 0){
          JOptionPane.showMessageDialog(null,"Please select row");
       }

        LabTestWorkRequest request = (LabTestWorkRequest)supplierApproveJTable1.getValueAt(selectedRow, 0);
        DefaultTableModel model2 = (DefaultTableModel) supplierApproveJTable1.getModel();
        model2.setRowCount(0);
        
        request.setStatus("Completed");
        request.setTestResult("Approved");
        for(WorkRequest r : userAccount.getWorkQueue().getWorkRequestList()){
          
              Object row[] = new Object[5];
              row[0] = request;
              row[1] = request.getReceiver();
            row[2] = request.getStatus();
            row[3] = request.getTestResult();
            row[4] = request.getSender();
            
            model2.addRow(row);
                      
                      
    }
        

    }//GEN-LAST:event_approveTestsupplierJButton1ActionPerformed

    private void btnChangeQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeQuantityActionPerformed
        // TODO add your handling code here:
        int selectedRow = VaccineTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        else{
            
        int newQuantity = Integer.parseInt(JOptionPane.showInputDialog("Please enter the new quantity"));
        Vaccine vc = (Vaccine) VaccineTable.getValueAt(selectedRow,1);
        vc.setQuantity(newQuantity);
        JOptionPane.showMessageDialog(null,"Quantity changed successfully");
        }
    }//GEN-LAST:event_btnChangeQuantityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VaccineTable;
    private javax.swing.JButton approveTestsupplierJButton1;
    private javax.swing.JButton btnChangeQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable supplierApproveJTable1;
    // End of variables declaration//GEN-END:variables
}
