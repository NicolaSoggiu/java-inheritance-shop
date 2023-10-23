package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Product {
    private int codeIMEI;
    private int memory;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int codeIMEI, int memory) {
        super(name, description, price, vat);
        this.codeIMEI = codeIMEI;
        this.memory = memory;
    }

    public int getCodeIMEI() {
        return codeIMEI;
    }

    public int getMemory() {
        return memory;
    }

    public void setCodeIMEI(int codeIMEI) {
        this.codeIMEI = codeIMEI;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
