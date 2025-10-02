package ie.atu;

import static java.lang.Math.pow;

public class Calculator {
    //adding 2 numbers
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
    //subtracting 2 numbers
    public int sub(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
    //multiplying 2 numbers
    public int mul(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    //dividing 2 numbers
    public int div(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
    //remainder of 2 numbers after division
    public int mod(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }
    //number to the power of another number
    public double power(int firstNum, int secondNum) {
        return pow(firstNum, secondNum);
    }
}
