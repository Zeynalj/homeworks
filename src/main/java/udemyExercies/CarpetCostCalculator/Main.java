package udemyExercies.CarpetCostCalculator;

public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor(10, 20);
        Carpet carpet = new Carpet(5);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }


}
