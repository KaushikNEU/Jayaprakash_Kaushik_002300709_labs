/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import javax.swing.JOptionPane;
import model.VitalSignsHistory;
import model.VitalSigns;


/**
 *
 * @author kaushikj
 */
public class CreateJPanel extends javax.swing.JPanel {
    
    VitalSignsHistory vitalSignsHistory;

    /**
     * Creates new form CreateJPanel
     */
    public CreateJPanel(VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.vitalSignsHistory = vitalSignsHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblTemperature = new javax.swing.JLabel();
        lblBLoodPressure = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        lblTitle.setText("Create Vital Signs");

        lblTemperature.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTemperature.setText("    Temperature:");

        lblBLoodPressure.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBLoodPressure.setText("Blood Pressure:");

        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPulse.setText("              Pulse:");

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDate.setText("               Date:");

        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTemperature)
                        .addGap(18, 18, 18)
                        .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBLoodPressure)
                        .addGap(18, 18, 18)
                        .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBloodPressure, txtDate, txtPulse, txtTemperature});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperature))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBLoodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnSave)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBloodPressure, txtDate, txtPulse, txtTemperature});

    }// </editor-fold>//GEN-END:initComponents

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        Double  temperature = Double.parseDouble(txtTemperature.getText());
        Double bloodPressure = Double.parseDouble(txtBloodPressure.getText());
        int pulse = Integer.parseInt(txtPulse.getText());
        String date = txtDate.getText();
        
        
        VitalSigns newVs = vitalSignsHistory.addNewVitals();
        
        newVs.setTemperature(temperature);
        newVs.setBloodPressure(bloodPressure);
        newVs.setPulse(pulse);
        newVs.setDate(date);
        
        //Show the user the confirmation Dialogue
        JOptionPane.showMessageDialog(this,"New Vital signs Created", "Success", JOptionPane.INFORMATION_MESSAGE );
        
        
        //Cleanup the form
        
        txtTemperature.setText("");
        txtBloodPressure.setText("");
        txtPulse.setText("");
        txtDate.setText("");
        
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblBLoodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
