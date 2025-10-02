package ie.atu;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create an instance of Calculator
        int result = 0;
        Calculator calc = new Calculator();
        //user input
        System.out.println("Choose an operation: ");
        String operator = sc.next();
        System.out.print("Enter first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNum = sc.nextInt();

        //references to calculator file
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
                if(secondNum == 0){                             //check for divide by 0 error
                    System.out.println("Cannot divide by zero");
                    break;
                }
                else {
                    result = calc.div(firstNum, secondNum);
                    System.out.println(result);
                    break;
                }
            case "modulo":
                result = calc.mod(firstNum, secondNum);
                System.out.println(result);
                break;
            case "power":
                double res = calc.power(firstNum, secondNum);
                System.out.println(res);
                break;
            default:
                System.out.println("Invalid operation, choose:\nadd\nsubtract\nmultiply\ndivide\nmodulo\npower");
                break;
        }

    }
}