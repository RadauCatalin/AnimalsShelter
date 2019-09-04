package org.fasttrackit;

import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String [] args){
        System.out.println();
        ShelterKeeper shelterKeeper = new ShelterKeeper();
        shelterKeeper.name = "Catalin";
        shelterKeeper.moneyAmount = 1500;

        Animal dog = new Animal();
        dog.name = "Thor";
        dog.age = 1.3;
        dog.healthProcentage = 90;
        dog.happyProcentage = 80;
        dog.foodProcentage = 70;
        dog.favoriteFood = "Dog food";
        dog.favoriteToy = "Bone toy";
        dog.favoriteActivity = "Walking";

        Food dogFood = new Food();
        dogFood.name = "Pedigree";
        dogFood.amount = 30;
        dogFood.price = 2;
        Date date = new Date(120, Calendar.JULY ,19);
        //Here year =1900+120
        System.out.println("Valability:"+ date);


        Veterinarian veterinarian = new Veterinarian();
        veterinarian.name = "Harold";
        veterinarian.speciality = "Dogs";
    }
}