package java_calculator;

import java.util.Scanner;

public class MainClass {
	
	public void calculator() {
		System.out.println(" Java Console Calculator");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Please enter two to perform calculation");
        System.out.print("\n First number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("\n Second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("\n Select between (*,/,+,-)\n Type out the character in a single letter: ");
        String operation = scanner.next();


        switch (operation) {
        case "*": 
            System.out.println("\n Your Result: "+ ( firstNumber * secondNumber )); 
            break;
        case "/": 
            System.out.println("\n Your Result: "+ ( firstNumber / secondNumber )); 
            break;
        case "+": 
            System.out.println("\n Your Result: "+ ( firstNumber + secondNumber ));
            break;
        case "-": 
            System.out.println("\n Your Result: "+ ( firstNumber - secondNumber )); 
            break;
        default: System.out.println("\n Please select a valid character"); 
        }

        scanner.close();
	}

}
