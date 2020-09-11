package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalApi {

    private AnimalShop animalShop;

    @Autowired
    public AnimalApi(AnimalShop animalShop) {
        this.animalShop = animalShop;
    }

    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello";
    }

    @GetMapping("/getAnimals")
    public List<Animal> getAnimals()
    {
        return animalShop.getAnimalList();
    }

    @PostMapping("/addAnimal")
    public boolean addAnimal(@RequestBody Animal animal)
    {
        return animalShop.addAnimail(animal);
    }
}
