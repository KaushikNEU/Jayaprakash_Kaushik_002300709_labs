/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author kaushikj
 */
public class Product {
    private String name;
    private int price;
    private int id;
    
    
    public Product(int id, String name, int price) {
    this.id = id;
    this.name = name;
    this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Product.count = count;
    }
    
    private ArrayList<Feature> features;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<Feature>();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public Feature addNewFeature() {
        Feature feature = new Feature(this);
        features.add(feature);
        return feature;
    }

    
    @Override
    public String toString() {
        return name;
    }


}
