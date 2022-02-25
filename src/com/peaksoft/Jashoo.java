package com.peaksoft;

import java.util.Arrays;

public abstract class Jashoo {
    private UyBuloo uyBuloo;
    private String adress;

    public Jashoo() {
    }

    public Jashoo(UyBuloo uyBuloo, String adress) {
        this.uyBuloo = uyBuloo;
        this.adress = adress;
    }

    public UyBuloo getUyBuloo() {
        return uyBuloo;
    }

    public void setUyBuloo(UyBuloo uyBuloo) {
        this.uyBuloo = uyBuloo;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Jashoo{" +
                "uyBuloo=" + uyBuloo +
                ", adress='" + adress + '\'' +
                '}';
    }
}
