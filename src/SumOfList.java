import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listofIntegers = new ArrayList<>();

        System.out.println("Enter integers (enter '0' to stop and get sum)");
        int input = scanner.nextInt();

        while (input != 0) {
            listofIntegers.add(input);
            input = scanner.nextInt();
            }
        int sum = sum(listofIntegers);
        System.out.println(listofIntegers + " were the items in the list. The sum of that list is: " + sum);
        }
        public static int sum(ArrayList<Integer> listofIntegers) {
        int sum = 0;
        for (Integer input : listofIntegers) {
            sum += input;
        }
        return sum;
    }
}
