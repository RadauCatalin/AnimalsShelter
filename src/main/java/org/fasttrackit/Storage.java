package org.fasttrackit;

public class Storage {
    //The storage is divided into specific areas for every animal type(dog, cat, fish, etc.)
   private String areaName;
   private String foodType;
   private String toyType;
   private String medicineType;
   private int foodCapacity;
   private int medicineCapacity;
   private int toysCapacity;
   private int foodAmount;
   private int medicineAcmount;

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getToyType() {
        return toyType;
    }

    public void setToyType(String toyType) {
        this.toyType = toyType;
    }

    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public int getFoodCapacity() {
        return foodCapacity;
    }

    public void setFoodCapacity(int foodCapacity) {
        this.foodCapacity = foodCapacity;
    }

    public int getMedicineCapacity() {
        return medicineCapacity;
    }

    public void setMedicineCapacity(int medicineCapacity) {
        this.medicineCapacity = medicineCapacity;
    }

    public int getToysCapacity() {
        return toysCapacity;
    }

    public void setToysCapacity(int toysCapacity) {
        this.toysCapacity = toysCapacity;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getMedicineAcmount() {
        return medicineAcmount;
    }

    public void setMedicineAcmount(int medicineAcmount) {
        this.medicineAcmount = medicineAcmount;
    }
}

