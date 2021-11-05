package com.company;


public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");

        dog.name = "Szarik";
        dog.species = "canis";
        dog.weight = 21.3;
        dog.age = 5;
        dog.alive = true;
        System.out.println(dog.name);

        cat.name = "Sierśiuch";
        System.out.println("a kot żyje?" + cat.alive);
        System.out.println("waga kota: " + cat.weight);
        cat.introduceYourself();
        dog.introduceYourself();

        cat.doYouLike("mouse");
        dog.doYouLike("mouse");

        Integer humanAge = dog.getHumanAge();
        System.out.println("If I'll be human I'll be " + humanAge + " years old");

        Human me = new Human();
        me.firstName = "Marcin";
        me.lastName = "Barsow";

        me.pet = dog;
        System.out.println("I have a " + me.pet.species);
        System.out.println("I call it " + me.pet.name);

        Car car = new Car();
        ford.producer = "Zastava";
        ford.model = "1100p";
        ford.millage = 2137.0;
        ford.engineSize = 1.4;

        me.car = car;

        System.out.println("I have " + me.car.producer + " " + me.car.model);
        System.out.println("waga psa: " + dog.weight);

    }
}
