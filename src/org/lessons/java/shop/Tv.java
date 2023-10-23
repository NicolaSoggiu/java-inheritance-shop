package org.lessons.java.shop;

import java.math.BigDecimal;

public class Tv extends Product {

    private int dimension;
    private boolean isSmart;

    public Tv(String name, String description, BigDecimal price, BigDecimal vat, int dimension, boolean isSmart) {
        super(name, description, price, vat);
        this.dimension = dimension;
        this.isSmart = isSmart;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public String toString() {
        return super.toString() + "Dimension: " + dimension + " " + "Is smart? " + isSmart;
    }
}
