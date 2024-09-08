import java.util.*;
public class butterflypattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        // first
        for (int i = 0; i < n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
           }
           for(int j=1;j<=i;j++){
            System.out.print("*");
           }
           System.out.println();

        }
    }
}
