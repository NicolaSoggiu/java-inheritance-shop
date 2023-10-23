package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {
    // ATTRIBUTI (devono essere tutti sempre privati)
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;

    // COSTRUTTORI
    public Product(String name, String description, BigDecimal price, BigDecimal vat) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
        this.code = generateCode();
    }

    // GETTER E SETTER

    // getter
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    // METODI

    // metodo che restituisce il prezzo comprensivo di iva
    public BigDecimal getFullPrice() {
        // prezzo base + prezzo base * iva
        return price.add(price.multiply(vat)).setScale(2, RoundingMode.HALF_EVEN);
    }

    // metodo che restituisce il codice concatenato con il nome
    public String getFullName() {
        return code + "-" + name;
    }

    // metodo che serve a generare un codice per il prodotto
    private int generateCode() {
        Random rand = new Random();
        return rand.nextInt(1,100000000);
    }

    // metodo che mi genera gli zeri prima del codice
    private String getPaddedCode() {
        String codeString = Integer.toString(code);
        while(codeString.length() < 8) {
            codeString = "0" + codeString;
        }
        return codeString;
    }
}
