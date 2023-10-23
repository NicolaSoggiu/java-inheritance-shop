package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {
    private int ImeiCode;
    private int memory;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int codeIMEI, int memory) {
        super(name, description, price, vat);
        this.ImeiCode = codeIMEI;
        this.memory = memory;
    }

    public int getCodeIMEI() {
        return ImeiCode;
    }

    public int getMemory() {
        return memory;
    }

    public void setCodeIMEI(int codeIMEI) {
        this.ImeiCode = codeIMEI;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nDescription: " + getDescription() + "\nPrice: " + getPrice() + "\nVAT: " + getVat()
                + "\nIMEI Code: " + ImeiCode + "\nMemory: " + memory + "gb";
    }
}
