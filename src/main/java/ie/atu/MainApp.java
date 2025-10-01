package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an instance of Calculator
        int result = 0;
        Calculator calc = new Calculator();
        System.out.println("Choose an operation: ");
        String operator = sc.next();
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();
        switch (operator) {
            case "add":
                result =calc.add(firstNum, secondNum);
                System.out.println(result);
                break;
            case "subtract":
                 result = calc.sub(firstNum, secondNum);
                System.out.println(result);
                break;
            case "multiply":
                result = calc.mul(firstNum, secondNum);
                System.out.println(result);
                break;
            case "divide":
                if(secondNum == 0){
                    System.out.println("Cannot divide by zero");
                    break;
                }
                else {
                    result = calc.div(firstNum, secondNum);
                    System.out.println(result);
                    break;
                }
        }

    }
}