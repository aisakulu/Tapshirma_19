package com.peaksoft;

import java.util.Arrays;

public class Obshijitie extends Jashoo implements KvarPlat {

    public Obshijitie() {
    }

    public Obshijitie(UyBuloo uyBuloo, String adress) {
        super(uyBuloo, adress);
    }

    @Override
    public void kvarPlat() {
        System.out.println("Arenda toloyt!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
