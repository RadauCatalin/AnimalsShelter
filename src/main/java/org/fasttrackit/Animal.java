package org.fasttrackit;

public class Animal {
    private String name;
    private double age;
    private int healthProcentage;
    private int foodProcentage;
    private int happyProcentage;
    private String favoriteFood;
    private String favoriteToy;
    private String favoriteActivity;
    private int cleanProcentage;
    private int energyProcentage;


    public Animal(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getHealthProcentage() {
        return healthProcentage;
    }

    public void setHealthProcentage(int healthProcentage) {
        this.healthProcentage = healthProcentage;
    }

    public int getFoodProcentage() {
        return foodProcentage;
    }

    public void setFoodProcentage(int foodProcentage) {
        this.foodProcentage = foodProcentage;
    }

    public int getHappyProcentage() {
        return happyProcentage;
    }

    public void setHappyProcentage(int happyProcentage) {
        this.happyProcentage = happyProcentage;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public int getCleanProcentage() {
        return cleanProcentage;
    }

    public void setCleanProcentage(int cleanProcentage) {
        this.cleanProcentage = cleanProcentage;
    }

    public int getEnergyProcentage() {
        return energyProcentage;
    }

    public void setEnergyProcentage(int energyProcentage) {
        this.energyProcentage = energyProcentage;
    }

    public void isHappy() {
        if (getHappyProcentage() > 80) ;
    }
}
