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

    // Codice
    public String getCodice() {
        String output = String.format("Il codice del prodotto %s è %d", this.nome, this.codice);
        return output;
    }

    // Nome
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.equals("")) {
            this.nome = nome;
        }
    }

    // Marca
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if(marca != null && !marca.equals("")) {
            this.marca = marca;
        }
    }

    // prezzo
    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        if(prezzo.compareTo(BigDecimal.ZERO) > 0) {
            this.prezzo = prezzo;
        }
    }

    // iva
    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
        if(iva.compareTo(BigDecimal.ZERO) > 0) {
            this.iva = iva;
        }
    }
}
