package org.lessons.java.shop;

import java.math.BigDecimal;

public class Headphones extends Product {
    private String color;
    private boolean isWireless;
    public Headphones(String name, String description, BigDecimal price, BigDecimal vat) {
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
}
