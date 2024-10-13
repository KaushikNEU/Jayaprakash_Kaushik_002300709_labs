/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.admin;
import model.Supplier;
import model.SupplierDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author kaushikj
 */
public class AddSupplier extends javax.swing.JPanel {
    private JPanel workArea;
    private SupplierDirectory supplierDirectory;
    private static final Logger logger = Logger.getLogger(AddSupplier.class.getName());
    
    private final JFileChooser fileChooser = new JFileChooser();
    ImageIcon logoImage;

    /**
     * Creates new form Add1Supplier
     */
    public AddSupplier(JPanel workArea, SupplierDirectory supplierDirectory) {
        initComponents();
        initComponents();
        this.workArea = workArea;
        this.supplierDirectory = supplierDirectory;
        
        FileFilter jpegFilter = new FileNameExtensionFilter("JPEG file", "jpg", "jpeg");
        FileFilter pngFilter = new FileNameExtensionFilter("PNG file", "png", "png");
        
        fileChooser.addChoosableFileFilter(jpegFilter);
        fileChooser.addChoosableFileFilter(pngFilter);
        fileChooser.setFileFilter(pngFilter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgLogo = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnAddSupplier = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        lblDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblLogo = new javax.swing.JLabel();
        btnAttach = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();

        imgLogo.setForeground(new java.awt.Color(230, 57, 70));
        imgLogo.setText("<No Image>");
        imgLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        imgLogo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblTitle.setForeground(new java.awt.Color(230, 57, 70));
        lblTitle.setText("New Supplier Information:");

        btnAddSupplier.setForeground(new java.awt.Color(230, 57, 70));
        btnAddSupplier.setText("Add");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });

        backButton.setForeground(new java.awt.Color(230, 57, 70));
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        lblDescription.setForeground(new java.awt.Color(230, 57, 70));
        lblDescription.setText("Description:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblLogo.setForeground(new java.awt.Color(230, 57, 70));
        lblLogo.setText("Logo:");

        btnAttach.setForeground(new java.awt.Color(230, 57, 70));
        btnAttach.setText("Attach");
        btnAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttachActionPerformed(evt);
            }
        });

        lblName.setForeground(new java.awt.Color(230, 57, 70));
        lblName.setText("Name:");

        btnRemove.setForeground(new java.awt.Color(230, 57, 70));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backButton)
                            .addGap(38, 38, 38)
                            .addComponent(lblTitle))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(lblName)
                            .addGap(22, 22, 22)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(lblDescription)
                            .addGap(22, 22, 22)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(lblLogo)
                            .addGap(22, 22, 22)
                            .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAttach, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRemove)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(btnAddSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backButton)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(lblTitle)))
                    .addGap(41, 41, 41)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(lblName))
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDescription)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLogo)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAttach)
                            .addGap(6, 6, 6)
                            .addComponent(btnRemove)))
                    .addGap(62, 62, 62)
                    .addComponent(btnAddSupplier)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed
        // TODO add your handling code here:
        String newSupplierName = txtName.getText().trim();

        if (newSupplierName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Supplier name cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isDuplicateSupplierName(newSupplierName)) {
            JOptionPane.showMessageDialog(this, "Supplier name already exists.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Supplier supplier = supplierDirectory.addSupplier();
        supplier.setSupplyName(txtName.getText());
        supplier.setLogoImage(logoImage);

        JOptionPane.showMessageDialog(this, "Supplier successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);
        backAction();
    }//GEN-LAST:event_btnAddSupplierActionPerformed
    private boolean isDuplicateSupplierName(String name) {
    for (Supplier supplier : supplierDirectory.getSupplierList()) {
        if (supplier.getSupplyName().equalsIgnoreCase(name)) {
            return true;
        }
    }
    return false;
    }
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backButtonActionPerformed

    private void btnAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttachActionPerformed
        // TODO add your handling code here:
        int returnVal = fileChooser.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            URL url;

            try {
                url = file.toURI().toURL();

                logoImage = new ImageIcon(url);
                logoImage = new ImageIcon(logoImage.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));

                imgLogo.setIcon(logoImage);
            } catch (MalformedURLException ex){
                logger.log(Level.ALL, null, ex);

                //System.out.print(file.toPath() + " opened.");
            }
        }
        
    }//GEN-LAST:event_btnAttachActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        logoImage = null;
        imgLogo.setIcon(logoImage);
    }//GEN-LAST:event_btnRemoveActionPerformed
        private void backAction() {
            workArea.remove(this);
            Component[] componentArray = workArea.getComponents();
            Component component = componentArray[componentArray.length - 1];
            ManageSuppliers manageSuppliersJPanel = (ManageSuppliers) component;
            manageSuppliersJPanel.refreshTable();
            CardLayout layout = (CardLayout) workArea.getLayout();
            layout.previous(workArea);
    /**
     * @param args the command line arguments
     */
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnAttach;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
