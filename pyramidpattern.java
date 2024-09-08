// output:-
// Enter the number: 4
//    1
//   121
//  12321
// 1234321
import java.util.Scanner;
public class pyramidpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
