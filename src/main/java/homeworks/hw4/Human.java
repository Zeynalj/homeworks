package homeworks.hw4;

import java.util.Arrays;
import java.util.Random;

public class Human<Mother, Father> {

    private String name;
    private String surname;
    private int year;
    private int iq;
    Mother mother;
    Father father;
    Pet pet;
    private String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, Mother mother, Father father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Mother mother, Father father, Pet pet, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.schedule = schedule;
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.nickname + ".");
    }

    public void describePet() {

        System.out.print("I have a " + pet.species + ", he is " + pet.age + " years old, he is ");

        if (pet.trickLevel < 50) {
            System.out.println("almost not sly.");
        } else {
            System.out.println("very sly.");
        }

    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ", pet=" + pet +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }

    Random random = new Random();
    int generatedNum = random.nextInt(101);


    public void feedPet(boolean isItTimeForFeeding) {
        if (generatedNum < pet.trickLevel) {
            System.out.println("Hm... I will feed Jack's " + pet.nickname + ".");
        } else if (generatedNum > pet.trickLevel) {
            System.out.println("I think Jack is not hungry");
        }
    }

}