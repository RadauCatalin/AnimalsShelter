package org.fasttrackit;

public class Cat extends Animal {
    private int waterProcentage;
    private int pawsCount;

    public Cat(String name) {
        super(name);
    }

    public int getWaterProcentage() {
        return waterProcentage;
    }

    public void setWaterProcentage(int waterProcentage) {
        this.waterProcentage = waterProcentage;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }

    @Override
    public void isHappy() {
        System.out.println(getName() + " purrs");
        super.isHappy();
    }
}
