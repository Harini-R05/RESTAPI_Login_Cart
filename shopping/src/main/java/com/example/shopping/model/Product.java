package com.example.shopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
    @Id
    private int productId;
    private String productName;
    private String productCount;
    private String productBrand;
    private String manufactureId;
    private double productPrice;
    private String productRating;
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductCount() {
        return productCount;
    }
    public void setProductCount(String productCount) {
        this.productCount = productCount;
    }
    public String getProductBrand() {
        return productBrand;
    }
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }
    public String getManufactureId() {
        return manufactureId;
    }
    public void setManufactureId(String manufactureId) {
        this.manufactureId = manufactureId;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public String getProductRating() {
        return productRating;
    }
    public void setProductRating(String productRating) {
        this.productRating = productRating;
    }
    public Product(int productId, String productName, String productCount, String productBrand, String manufactureId,
            double productPrice, String productRating) {
        this.productId = productId;
        this.productName = productName;
        this.productCount = productCount;
        this.productBrand = productBrand;
        this.manufactureId = manufactureId;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }
    public Product() {
    }
    
    
}
