package org.fasttrackit;

public class ShelterKeeper {
    private String name;
    private int moneyAmount;

    public void feedAnimal(Animal animal, Food food) {
        int i = animal.getFoodProcentage();
        if (i > 85) {
            System.out.println(animal.getName() + " is satiated.");
        } else if (food.getName() == animal.getFavoriteFood() && i < 85 && animal.getHappyProcentage() < 90) {
            System.out.println(name + " just gave some " + food.getName() + " food to " + animal.getName()
                    + ". Because this is favorite food of " + animal.getName() + " , the happy procentage was increased.");
            animal.setFoodProcentage(i + 15);
            animal.setHappyProcentage(animal.getHappyProcentage() + 10);
        } else {
            System.out.println(name + " just gave some " + food.getName() + " food to " + animal.getName());
            animal.setFoodProcentage(i + 15);
        }
    }

    public void playWithAnimal(Animal animal) {
        int i = animal.getHappyProcentage();
        if (i > 85) {
            System.out.println(animal.getName() + " is already happy.");
        } else if (animal.getActivity() == animal.getFavoriteActivity() && i <= 85 && animal.getEnergyProcentage() <= 95) {
            System.out.println(name + " just played " + animal.getActivity() + " with " + animal.getName()
                    + ". Because this is favorite activity of " + animal.getName() + ", the energy procentage was increased.");
            animal.setHappyProcentage(i + 15);
            animal.setEnergyProcentage(animal.getEnergyProcentage() + 5);
        } else {
            System.out.println(name + "just played " + animal.getActivity() + "with " + animal.getName());
            animal.setHappyProcentage(i + 15);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }
}

