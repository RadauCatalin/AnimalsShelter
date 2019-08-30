package org.fasttrackit;

import java.util.Date;

public class Food {
        String name;
        int price;
        int amount;
        int stockProcentage;

    boolean before(Date when) {
        return false;
    }
}