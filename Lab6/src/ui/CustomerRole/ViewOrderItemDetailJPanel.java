/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.CustomerRole;

import java.awt.CardLayout;
import javax.swing.JPanel;
import model.OrderItem;

/**
 *
 * @author Zerel
 */
public class ViewOrderItemDetailJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    OrderItem item;
    

    
    /**
     * Creates new form ViewOrderItemDetailJPanel
     */
    public ViewOrderItemDetailJPanel(JPanel userProcessContainer, OrderItem item) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.item = item;
        
        txtProductName.setText(item.getProduct().getProdName());
        txtProductId.setText(String.valueOf(item.getProduct().getModelNumber()));
        txtSalesPrice.setText(String.valueOf(item.getSalesPrice()));
        txtQuantity.setText(String.valueOf(item.getQuantity()));
        txtTotal.setText(String.valueOf(item.getQuantity()*item.getSalesPrice()));
        
        
        
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
        btnBack = new javax.swing.JButton();
        lblProductName = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        lblProductId = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();

        setBackground(new java.awt.Color(207, 92, 54));
        setPreferredSize(new java.awt.Dimension(650, 600));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setText("Order Item Details");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 23, -1, -1));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 25, -1, -1));

        lblProductName.setText("Product Name:");
        add(lblProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 119, -1, 30));

        txtProductName.setEditable(false);
        add(txtProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 123, 160, -1));

        lblProductId.setText("Product ID:");
        add(lblProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 157, -1, 30));

        txtProductId.setEditable(false);
        add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 161, 160, -1));

        lblPrice.setText("Sales Price:");
        add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 198, -1, -1));

        txtSalesPrice.setEditable(false);
        add(txtSalesPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 195, 160, -1));

        lblQuantity.setText("Quantity:");
        add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 233, -1, -1));

        txtQuantity.setEditable(false);
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 230, 160, -1));

        lblTotal.setText("Total:");
        add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 268, -1, -1));

        txtTotal.setEditable(false);
        add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 265, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblProductId;
    private javax.swing.JLabel lblProductName;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSalesPrice;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
