package org.fasttrackit;

public class Parrot extends Animal {
   private int waterProcentage;
   private int wingAcount;

    public Parrot(String name) {
        super(name);
    }

    public int getWaterProcentage() {
        return waterProcentage;
    }

    public void setWaterProcentage(int waterProcentage) {
        this.waterProcentage = waterProcentage;
    }

    public int getWingAcount() {
        return wingAcount;
    }

    public void setWingAcount(int wingAcount) {
        this.wingAcount = wingAcount;
    }
}

