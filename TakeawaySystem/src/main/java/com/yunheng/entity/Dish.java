package com.yunheng.entity;

public class Dish {
    private String name;
    private double price;
    private String businessName;

    public Dish() {
    }

    public Dish(String name, double price, String businessName) {
        this.name = name;
        this.price = price;
        this.businessName = businessName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", businessName='" + businessName + '\'' +
                '}';
    }
}
