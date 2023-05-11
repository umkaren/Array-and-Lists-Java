import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        ArrayList<String> listofStrings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text and press enter when completed. Enter a black input if you're done with inputs.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println("The last item in the list is:  " + listofStrings.get(listofStrings.size()-1));
                break;
            }
            listofStrings.add(input);
        }
    }
}