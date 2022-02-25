package com.peaksoft;

import java.util.Arrays;

public class Kavartira extends Jashoo implements KomUsluga{
    public Kavartira() {
    }

    public Kavartira(UyBuloo uyBuloo, String adress) {
        super(uyBuloo, adress);
    }

    @Override
    public String toString() {
        return "Kavartira{} " + super.toString();
    }

    @Override
    public void komUsulga() {
        System.out.println("Kom usluga toloyt");
    }
}
