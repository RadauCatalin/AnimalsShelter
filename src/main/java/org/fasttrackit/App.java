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
        dog.setFoodProcentage(35);
        dog.setFavoriteFood("Pedigree");
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

        System.out.println(dog.getName() + " food procentage is: " + dog.getFoodProcentage());
        shelterKeeper.feedAnimal(dog, food);
        System.out.println(dog.getName() + " food procentage is: " + dog.getFoodProcentage());

        System.out.println(dog.getName() + " happiness procentage is: " + dog.getHappyProcentage());
        shelterKeeper.playWithAnimal(dog);
        System.out.println(dog.getName() + " happiness procentage is: " + dog.getHappyProcentage());

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.setName("Harold");
        veterinarian.setSpeciality("Dogs");

        System.out.println(dog.getName() + " health procentage is " + dog.getHealthProcentage());
        veterinarian.cureAnimale(dog, shelterKeeper);
        System.out.println(dog.getName() + " health procentage is " + dog.getHealthProcentage());
    }
}