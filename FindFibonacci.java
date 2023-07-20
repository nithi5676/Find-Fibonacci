package findFibonacci;

import java.util.Scanner;

public class FindFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.print(find(number) + " ");
    }

    private static int find(int number) {
        if (number == 1) {
            return 1;
        }
        if (number == 0) {
            return 0;
        }
        return find(number - 1) + find(number - 2);
    }
}