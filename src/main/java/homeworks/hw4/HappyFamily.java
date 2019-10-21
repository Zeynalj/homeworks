package homeworks.hw4;

public class HappyFamily {

    public static void main(String[] args) {

        String[][] secondSchedule =
                {

                {"Friday"}, {"Going out for dinner with family"},
                {"Saturday"}, {"Visiting relatives of father"},
                {"Sunday"}, {"Having a good rest and regaining energy for the next week"}

                };

        Pets pet1 = new Pets( "dog", "Rex", 1, 95,
                new String[] {"Playing around", "Barking when catching a thief", "Resting"} );

        Pets pet2 = new Pets( "fish", "Heskey", 2, 60,
                new String[]{"Bubbling", "Cornering the aquarium", "Getting pleasure being fed by Mary"} );

        Pets pet3 = new Pets( "horse", "Charlie", 7, 115,
                new String[]{"Running", "Petting his kids", "Playing with Michael", "Sniggering loudly"} );

        Humans grandpa1 = new Humans( "Bobby", "Black", 1935 );
        Humans grandma1 = new Humans( "Rose", "Black", 1942 );

        Humans grandpa2 = new Humans( "Dan", "Smith", 1940 );
        Humans grandma2 = new Humans( "Mary", "Smith", 1945 );

        Humans grandpa3 = new Humans( "Michael", "Prince", 1942 );
        Humans grandma3 = new Humans( "Susanne", "Prince", 1943 );

        Humans grandpa4 = new Humans( "Steven", "Gerrard", 1955 );
        Humans grandma4 = new Humans( "Louisse", "Gerrard", 1963 );

        Humans father1 = new Humans( "Alex", "Radcliff", 1973, 90, grandpa1, grandma1 );
        Humans mother1 = new Humans( "Cristina", "Radcliff", 1974, 93, grandpa2, grandma2 );

        Humans father2 = new Humans("Rooney", "Smith", 1985, 102, grandpa3, grandma3);
        Humans mother2 = new Humans( "Saule", "Smith", 1988, 105, grandpa4, grandma4 );

        Humans child1 = new Humans( "Ronaldo", "Black", 1996, 95, father1, mother1, secondSchedule, pet1 );
        Humans child2 = new Humans( "Axel", "Smith", 2011, 82, father2, mother2 );
        Humans child3 = new Humans( "Luna", "Prince", 2016, 60, father2, mother2 );

        mother2.pet = pet2;
        child2.pet = child3.pet = pet3;

        System.out.println( "Family Grace:" );
        child1.greetPet();
        child1.pet.respond();
        child1.pet.eat();
        child1.describePet();
        System.out.println();

        System.out.println( "Family Smith:" );
        mother2.greetPet();
        mother2.pet.respond();
        mother2.pet.eat();
        mother2.describePet();
        System.out.println();


    }

}
