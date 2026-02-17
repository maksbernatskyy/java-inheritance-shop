package org.lessons.java.shop;

import java.math.BigDecimal;

class Televisori extends Prodotto {
    // Attributi
    private int dimensioni;
    private boolean smart;

    // Metodi
    public Televisori(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensioni, boolean smart) {
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    // Dimensioni
    public int getDimensioni() {
        return this.dimensioni;
    }

    public void setDimensioni(int dimensioni) {
        if(dimensioni > 0) {
            this.dimensioni = dimensioni;
        }
    }

    // Smart
    public boolean getSmart() {
        return this.smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
