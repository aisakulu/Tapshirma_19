package com.peaksoft;

public class Main {

    public static void main(String[] args) {
	// write your code here
        UyBuloo familyMemsGostinisa = new UyBuloo(new String[]{"Maksat","Bakyt"});
        UyBuloo familyMemsKavrtira = new UyBuloo(new String[]{"Atasi","Apasi","Akasi","Ejesi","Ukasi"});
        UyBuloo familyMemsObshiy = new UyBuloo(new String[]{"Student Zamir", "Student Adil"});

        System.out.println("****************************");
        Kavartira kvt = new Kavartira(familyMemsKavrtira,"Toktogul 25");
        System.out.println(kvt);
        kvt.komUsulga();

        System.out.println("****************************");

        Obshijitie obsh = new Obshijitie(familyMemsObshiy,"Chui prospekt 698 A");
        System.out.println(obsh);
        obsh.kvarPlat();

        System.out.println("****************************");
        Gostinitsa gost = new Gostinitsa(familyMemsGostinisa,"Tynystanova 25 B");
        gost.kvarPlat();

    }
}
