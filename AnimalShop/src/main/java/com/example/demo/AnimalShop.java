package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalShop {

    private List<Animal> animalList;

    public AnimalShop() {
        this.animalList = new ArrayList<>();
        animalList.add(new Animal("Burek", "Kot"));
        animalList.add(new Animal("Rex", "Pies"));
    }

    public boolean addAnimail(Animal animal)
    {
        return animalList.add(animal);
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }
}
