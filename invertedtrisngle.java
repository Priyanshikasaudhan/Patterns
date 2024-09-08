// Output:-
// Enter the value: 4
// 1111
//  222
//   33
//    4
import java.util.Scanner;

public class invertedtrisngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(i+1);
            }
          System.out.println();
        }
    }
}
