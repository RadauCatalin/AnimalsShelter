package org.fasttrackit;

public class Activity {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "name='" + name + '\'' +
                '}';
    }
}
