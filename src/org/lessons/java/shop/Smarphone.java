package org.lessons.java.shop;

import java.math.BigDecimal;

class Smarphone extends Prodotto {
    // Attributi
    private int codiceIMEI;
    private int memoria;

    // Metodi
    public Smarphone(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int codiceIMEI, int memoria) {
        super(nome, marca, prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    // Codice IMEI
    public int getCodiceIMEI() {
        return this.codiceIMEI;
    }

    public void setCodiceIMEI(int codiceIMEI) {
        if (codiceIMEI > 0) {
            this.codiceIMEI = codiceIMEI;
        }
    }

    // Memoria
    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        if (memoria > 0) {
            this.memoria = memoria;
        }
    }
}
