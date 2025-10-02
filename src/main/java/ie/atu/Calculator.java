package ie.atu;

import static java.lang.Math.pow;

public class Calculator {
    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
    public int sub(int firstNum, int secondNum) {

        return firstNum - secondNum;
    }
    public int mul(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    public int div(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }
    public int mod(int firstNum, int secondNum) {
        return firstNum % secondNum;
    }
    public double power(int firstNum, int secondNum) {
        return pow(firstNum, secondNum);
    }
}
