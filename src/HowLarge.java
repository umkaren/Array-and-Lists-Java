import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        ArrayList<String> listofStrings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text and press enter when completed. Enter a black input if you're done with inputs.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("The total amount of items in the list was:  " + listofStrings.size());
                break;
            }
            listofStrings.add(input);
        }
    }
}