import java.util.Scanner;

public class Main {
    public static int main(String [] args) {
        while(true) {
            System.out.println("Enter in a command");
            Scanner s = new Scanner(System.in);

            String input = s.nextLine();
            if (input.contains("quit")) {
                return 0;
            }

            System.out.println(input);
        }
    }
}
