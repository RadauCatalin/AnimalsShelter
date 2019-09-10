package org.fasttrackit;

import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        System.out.println();
        ShelterKeeper shelterKeeper = new ShelterKeeper();
        shelterKeeper.setName("Catalin");
        shelterKeeper.setMoneyAmount(1500);

        Dog dog = new Dog("Thor");
        dog.setName("Thor");
        dog.setAge(1.3);
        dog.setHealthProcentage(90);
        dog.setHappyProcentage(80);
        dog.setFoodProcentage(70);
        dog.setFavoriteFood("Dog food");
        dog.setFavoriteToy("Bone toy");
        dog.setFavoriteActivity("Walking");

        Food food = new Food("Pedigree");
        food.setName("Pedigree");
        food.setAmount(30);
        food.setPrice(2);
        Date date = new Date(120, Calendar.JULY, 19);
        //Here year =1900+120
        System.out.println("Valability:" + date);

        Cat cat = new Cat("Tom");
        cat.setName("Tom");
        cat.setAge(1.1);
        cat.setHealthProcentage(80);



        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Harold");
        veterinarian.setSpeciality("Dogs");

    }
}