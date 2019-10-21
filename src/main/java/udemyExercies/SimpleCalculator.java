package udemyExercies;

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        double firstNumber1 = (double) getFirstNumber();
        double secondNumber1 = (double) getSecondNumber();
        return firstNumber1 + secondNumber1;

    }
    public double getSubtractionResult(){
        double firstNumber1 = (double) getFirstNumber();
        double secondNumber1 = (double) getSecondNumber();
        return firstNumber1 - secondNumber1;
    }
    public double getMultiplicationResult(){
        double firstNumber1 = (double) getFirstNumber();
        double secondNumber1 = (double) getSecondNumber();
        return firstNumber1 * secondNumber1;
    }

    public double getDivisionResult() {
        double firstNumber1 = (double) getFirstNumber();
        double secondNumber1 = (double) getSecondNumber();
        if (secondNumber1 != 0) {
            return firstNumber1 / secondNumber1;
        } else {
            return 0;
        }
    }
}
