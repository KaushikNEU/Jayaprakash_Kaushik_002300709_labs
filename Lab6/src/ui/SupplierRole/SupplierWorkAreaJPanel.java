package ui.SupplierRole;

import model.Supplier;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Mihir Mehta / Hechen Gao
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Supplier supplier;
    public SupplierWorkAreaJPanel(JPanel upc, Supplier s) {
        initComponents();
        userProcessContainer = upc;
        supplier = s;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnManageProductCatalog = new javax.swing.JButton();
        btnProductPerformance = new javax.swing.JButton();
        btnUpdateProfile = new javax.swing.JButton();
        btnUpdateStaff = new javax.swing.JButton();

        setBackground(new java.awt.Color(207, 92, 54));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logoPleaseBuySmall.png"))); // NOI18N
        lblTitle.setText("Supplier Work Area");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblTitle.setIconTextGap(100);
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 35, -1, -1));

        btnManageProductCatalog.setText("Manage Product Catalog >>");
        btnManageProductCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageProductCatalogActionPerformed(evt);
            }
        });
        add(btnManageProductCatalog, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 205, -1, -1));

        btnProductPerformance.setText("Review Product Performance >>");
        btnProductPerformance.setEnabled(false);
        btnProductPerformance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductPerformanceActionPerformed(evt);
            }
        });
        add(btnProductPerformance, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 234, -1, -1));

        btnUpdateProfile.setText("Update Personal Profile >>");
        btnUpdateProfile.setEnabled(false);
        btnUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfileActionPerformed(evt);
            }
        });
        add(btnUpdateProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 263, -1, -1));

        btnUpdateStaff.setText("Manage Staff");
        btnUpdateStaff.setEnabled(false);
        add(btnUpdateStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 292, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void btnManageProductCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageProductCatalogActionPerformed

        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(userProcessContainer, supplier);
        userProcessContainer.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageProductCatalogActionPerformed

    private void btnProductPerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductPerformanceActionPerformed

    }//GEN-LAST:event_btnProductPerformanceActionPerformed

    private void btnUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfileActionPerformed

    }//GEN-LAST:event_btnUpdateProfileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageProductCatalog;
    private javax.swing.JButton btnProductPerformance;
    private javax.swing.JButton btnUpdateProfile;
    private javax.swing.JButton btnUpdateStaff;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
