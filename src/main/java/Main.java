import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        while(true) {
            System.out.println("Enter in a command");

            Scanner s = new Scanner(System.in);
            String input = s.nextLine();

            if (input.contains("quit")) break;

            Calculator calculator = new Calculator();
            String[] inputs = input.split(" ");
            
            if (Objects.equals(inputs[0], "add")) {
                try {
                    int sol = calculator.add(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
                    System.out.println(sol);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }

            if (Objects.equals(inputs[0], "subtract")) {
                try {
                    int sol = calculator.subtract(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
                    System.out.println(sol);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }

            if (Objects.equals(inputs[0], "multiply")) {
                try {
                    int sol = calculator.multiply(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
                    System.out.println(sol);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }

            if (Objects.equals(inputs[0], "divide")) {
                try {
                    int sol = calculator.divide(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2]));
                    System.out.println(sol);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }

            if (Objects.equals(inputs[0], "fibonacci")) {
                try {
                    int sol = calculator.fibonacciNumberFinder(Integer.parseInt(inputs[1]));
                    System.out.println(sol);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }

            if (Objects.equals(inputs[0], "binary")) {
                try {
                    String sol = calculator.intToBinaryNumber(Integer.parseInt(inputs[1]));
                    System.out.println(sol);
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }
            }
        }
    }
}
