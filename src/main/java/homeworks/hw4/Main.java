package homeworks.hw4;

public class Main {

    public static void main(String[] args) {

        String[][] schedule1 = {

                {"Friday"}, {"Going out for dinner with family"},
                {"Saturday"}, {"Visiting relatives of father"},
                {"Sunday"}, {"Having a good rest and regaining energy for the next week"}

        };

        Pet pet = new Pet("dog", "Rex", 1, 95, new String[]{"Playing around", "Barking when catching a thief", "Resting"});
        Pet pet1 = new Pet("fish", "Heskey", 2, 60, new String[]{"Bubbling", "Cornering the aquarium", "Getting pleasure being fed by Mary"});

        Human grandfather = new Human("Bobby", "Black", 1935);
        Human grandmother = new Human("Rose", "Black", 1942);
        Human mother = new Human("Alex", "Black", 1973, 90, grandmother, grandfather);
        Human father = new Human("Cristina", "Black", 1974, 93, grandmother, grandmother);
        Human child = new Human("Ronaldo", "Black", 1996, 85, mother, father, pet, schedule1);

        Human grandfather1 = new Human("Dan", "Smith", 1940);
        Human grandmother1 = new Human("Mary", "Smith", 1945);
        Human mother1 = new Human("Rooney", "Smith", 1985, 102, grandmother, grandfather);
        Human father1 = new Human("Saule", "Smith", 1988, 105, grandmother, grandmother);
        Human child1 = new Human("Axel", "Smith", 2011, 95, mother, father, pet1, schedule1);

        System.out.println("Family Black:");
        child.greetPet();
        child.describePet();
        child.feedPet(true);
        child.pet.respond();
        child.pet.eat();
        child.pet.foul();
        System.out.println();

        System.out.println("Family Smith:");
        child1.greetPet();
        child1.describePet();
        child1.feedPet(true);
        child1.pet.respond();
        child1.pet.eat();
        child1.pet.foul();
        System.out.println();


    }

}
