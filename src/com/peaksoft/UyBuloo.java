package com.peaksoft;

import java.util.Arrays;

public class UyBuloo {
    private String[] familyMembers;

    public UyBuloo() {
    }

    public UyBuloo(String[] familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String[] getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(String[] familyMembers) {
        this.familyMembers = familyMembers;
    }

    @Override
    public String toString() {
        return "UyBuloo{" +
                "familyMembers=" + Arrays.toString(familyMembers) +
                '}';
    }
}
