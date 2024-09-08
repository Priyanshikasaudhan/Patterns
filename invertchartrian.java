// output:-
// Enter the value: 4
// AAAA
//  BBB
//   CC
//    D
// pyramid:-
// Enter the value: 4
// A A A A
//  B B B
//   C C
//    D
import java.util.*;
public class invertchartrian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        char c = 'A';
        for(int i=0;i<n;i++){
            
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++){
                System.out.print(c);
                // System.out.print(c + " "); // for pyramid pattern
            }
            c++;
          System.out.println();
        }
    }
}
