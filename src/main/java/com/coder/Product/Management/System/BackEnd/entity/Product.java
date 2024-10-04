package com.coder.Product.Management.System.BackEnd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String productName;
    private String status;
    private String description;
    private double price;


    public Product() {
        super();
    }

    public Product(int id, String productName, String status, String description, double price) {
        this.id = id;
        this.productName = productName;
        this.status = status;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
