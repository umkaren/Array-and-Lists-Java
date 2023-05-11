import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> listofIntegers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (enter '0' to stop): ");

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                System.out.println("Done entering integers into the list");
                break;
            }
            listofIntegers.add(input);
        }
        System.out.println("What number are you looking for in the list?");

        int searchInput = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i <listofIntegers.size(); i++) {
            if (searchInput == listofIntegers.get(i)) {
                System.out.println(searchInput + " is at index " + i);
            }
        }
    }
}
