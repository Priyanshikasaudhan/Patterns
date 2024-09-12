import java.util.Scanner;

public class practicepattern {
    public static void Pattern(int n) {
        for (int i = 0; i < n; i++) {
            // Print the stars on the left side
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            // Print the spaces in between
            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Print the stars on the right side (same as left side)
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        Pattern(n);
        sc.close();
    }
}
