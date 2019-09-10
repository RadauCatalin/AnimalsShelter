package org.fasttrackit;

public class ShelterKeeper {
   private String name;
   private int moneyAmount;

   public void feedAnimal(Animal animal, Food food) {
       System.out.println(name + " just gave some " + food.getName() + " food to " + animal.getName());
       animal.setFoodProcentage(100);
   }
       public void playWithAnimal(Animal animal){
           System.out.println(name + " plays " + animal.getFavoriteActivity() + " with " + animal.getName());
           animal.setHappyProcentage(100);
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

