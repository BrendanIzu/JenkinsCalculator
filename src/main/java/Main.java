import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        while(true) {
            System.out.println("Enter in a command");
            Scanner s = new Scanner(System.in);

            String input = s.nextLine();
            if (input.contains("quit")) {
                break;
            }

            String[] inputs = input.split(" ");
            for (String value : inputs) {
                System.out.println(value);
            }
        }
    }
}
