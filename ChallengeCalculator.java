package exercicio;

import java.util.Scanner;

public class ChallengeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = input.nextDouble();

        System.out.println("Enter the operation (+, -, *, /, %): ");
        String operation = input.next();

        double result = "+".equals(operation) ? number1 + number2 : 0;
        result = "-".equals(operation) ? number1 - number2 : result;
        result = "*".equals(operation) ? number1 * number2 : result;
        result = "/".equals(operation) ? number1 / number2 : result;
        result = "%".equals(operation) ? number1 % number2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", number1, operation, number2, result);

        input.close();
    }
}
