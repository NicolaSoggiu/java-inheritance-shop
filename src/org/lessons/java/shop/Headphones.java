package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphones extends Product {
    private String color;
    private boolean isWireless;

    public Headphones(String name, String description, BigDecimal price, BigDecimal vat, String color, boolean isWireless) {
        super(name, description, price, vat);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean wireless) {
        isWireless = wireless;
    }

    private  String headType(){
        if(isWireless){
            return  "The headphones are wireless";
        }else{
            return "The headphones are wired";
        }
    }

    @Override
    public String toString() {
        String headInfo = headType();
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nPrice: " + getPrice() + "\nVAT: " + getVat()
                + "\nColor: " + color + "\nWireless: " + headInfo;
    }
}