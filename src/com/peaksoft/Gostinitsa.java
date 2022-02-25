package com.peaksoft;

public class Gostinitsa extends Jashoo implements KvarPlat{

    public Gostinitsa() {
    }

    public Gostinitsa(UyBuloo uyBuloo, String adress) {
        super(uyBuloo, adress);
    }

    @Override
    public void kvarPlat() {
        System.out.println("Arenda toloyt");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
