package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Food> availableFood = new ArrayList<>();
    private Activity[] availableActivity = new Activity[2];

    public void start() {
        initActivity();
        displayActivity();
        initFood();
        displayFood();

    }

    private void initActivity() {
        System.out.println("Available activity is: ");
        Activity activity1 = new Activity();
        activity1.setName("Walking");
        availableActivity[0] = activity1;

        Activity activity2 = new Activity();
        activity2.setName("Peting");
        availableActivity[1] = activity2;
    }

    private void displayActivity() {
        for (int i = 0; i < availableActivity.length; i++) {
            System.out.println(availableActivity[i].getName());

        }
    }

    private void initFood() {
        int foodCount = 2;
            Food food1 = new Food("Pedigree");
            availableFood.add(food1);
            Food food2 = new Food("DogFood");
            availableFood.add(food2);

        }
    private void displayFood() {
        System.out.println("Available food is: ");
        for (Food food: availableFood) {
            System.out.println(food.getName());
        }
    }
}