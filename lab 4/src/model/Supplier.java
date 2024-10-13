/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author kaushikj
 */
public class Supplier {
        
    private String supplyName;
    private ProductCatalog productCatalog;
    private ImageIcon logoImage;

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }
    
    public Supplier() {
        productCatalog = new ProductCatalog();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }
    public Product getProductById(String productId) {
    for (Product product : productCatalog.getProducts()) {
        if (String.valueOf(product.getId()).equals(productId)) {
            return product;
        }
    }
    return null;
}
    
    
    
    @Override
    public String toString() {
        return supplyName;
    }
    
    
}