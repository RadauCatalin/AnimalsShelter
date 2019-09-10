package org.fasttrackit;

public class Veterinarian {
   private String name;
   private String speciality;

    public String getName() {
        return name;
    }
    public void cureAnimale(Animal animal, ShelterKeeper shelterKeeper){
        System.out.println(shelterKeeper.getName() + " took the dog to Dr." + name );
        animal.setHealthProcentage(100);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}

