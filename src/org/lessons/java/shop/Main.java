package org.lessons.java.shop;

import java.math.BigDecimal;

import org.lessons.java.shop.Cuffie.Tipologia;

public class Main {
    public static void main(String[] args) {
        Smarphone Iphone16Pro = new Smarphone("Iphone 16 Pro", "Apple", new BigDecimal("800"), new BigDecimal("22"), 22234567, 564);

        Televisori Samsung = new Televisori("Samsung", "Samsung", new BigDecimal("2000.00"), new BigDecimal("22"), 75, true);

        Cuffie Beats = new Cuffie("Beats", "Beats", new BigDecimal("120"), new BigDecimal("22"), "Black", Tipologia.WIRELESS);
        

    }
}
