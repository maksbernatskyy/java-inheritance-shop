package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    // Attributi
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;

    // Metodi
    public Prodotto(String nome, String marca, BigDecimal prezzo, BigDecimal iva) {
        Random rand = new Random();
        this.codice = rand.nextInt(999999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }
}
