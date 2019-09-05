package org.fasttrackit;

import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println();
        ShelterKeeper shelterKeeper = new ShelterKeeper();
        shelterKeeper.name = "Catalin";
        shelterKeeper.moneyAmount = 1500;

        Dog dog = new Dog("Thor");
        dog.name = "Thor";
        dog.age = 1.3;
        dog.healthProcentage = 90;
        dog.happyProcentage = 80;
        dog.foodProcentage = 70;
        dog.favoriteFood = "Dog food";
        dog.favoriteToy = "Bone toy";
        dog.favoriteActivity = "Walking";

        Food food = new Food("Pedigree");
        food.name = "Pedigree";
        food.amount = 30;
        food.price = 2;
        Date date = new Date(120, Calendar.JULY, 19);
        //Here year =1900+120
        System.out.println("Valability:" + date);

        Cat cat = new Cat("Tom");
        cat.name = "Tom";
        cat.age = 1.1;
        cat.healthProcentage = 80;



        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Harold";
        veterinarian.speciality = "Dogs";

    }
}