package org.lessons.java.shop;

import java.math.BigDecimal;

class Cuffie extends Prodotto {
    // Attributi
    private String colore;

    enum Tipologia {
        WIRELESS,
        CABLATE
    }

    private Tipologia tipologia;

    // Metodi
    public Cuffie(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, Tipologia tipologia) {
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.tipologia = tipologia;
    }

    // Colore
    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        if (colore != null && !colore.equals("")) {
            this.colore = colore;
        }
    }

    // Tipologia
    public Tipologia getTipologia() {
        return tipologia;
    }

    public void setTipologia(Tipologia tipologia) {
        this.tipologia = tipologia;
    }

}
