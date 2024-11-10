/*
 * CreateProductJPanel.java
 *
 * Created on September 18, 2008, 2:54 PM
 */

package ui.CustomerRole;

import model.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rushabh
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    Product product;       


    /** Creates new form CreateProductJPanel */
    public ViewProductDetailJPanel(JPanel userProcessContainer,Product product) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.product = product;
        
        txtProdName.setText(product.getProdName());
        txtId.setText(String.valueOf(product.getModelNumber()));
        txtPrice.setText(String.valueOf(product.getPrice()));
        txtAvail.setText(String.valueOf(product.getAvail()));
        
        
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtProdName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(207, 92, 54));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Product Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 25, 222, -1));

        jLabel2.setText("Product Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 135, -1, 30));

        txtProdName.setEditable(false);
        add(txtProdName, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 139, 160, -1));

        jLabel3.setText("Price:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 215, -1, 30));

        txtPrice.setEditable(false);
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 219, 160, -1));

        backButton1.setText("<< Back");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 27, -1, -1));

        txtId.setEditable(false);
        add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 179, 160, -1));

        jLabel5.setText("Product ID:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 175, -1, 30));

        jLabel6.setText("Availability:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 260, -1, -1));

        txtAvail.setEditable(false);
        add(txtAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 257, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backButton1ActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdName;
    // End of variables declaration//GEN-END:variables
    
}
