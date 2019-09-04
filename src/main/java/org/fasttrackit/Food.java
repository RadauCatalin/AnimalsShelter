package org.fasttrackit;

import java.util.Date;

public class Food {
    String name;
    int price;
    int amount;
    Date date = new Date();

    public Food(String name) {
        this.name = name;
    }
}
