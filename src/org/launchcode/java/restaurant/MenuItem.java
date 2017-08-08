package org.launchcode.java.restaurant;

import java.util.Date;

public class MenuItem {


    private String name;
    private String description;
    private double price;
    public enum Type {
        MAIN, APPETIZER, DESSERT
    }
    private Type category;
    private Date dateAdded;
    private Boolean newItem;

    public MenuItem(String name, String description, double price, Type category) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        dateAdded = new Date();
        newItem = true;

    }

    public String getName() {
        return this.name;
    }
    public void setName(String aName) {
        this.name = aName;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public Type getCategory() {
        return this.category;
    }
    public void setCategory(Type aCategory) {
        this.category = aCategory;
    }

    //No setters for these, only alterable with Menu/Item changes
    public boolean isNewItem() {
        return this.newItem;
    }
    public Date getDateAdded() {
        return this.dateAdded;
    }
}
