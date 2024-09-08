// output:
// Enter the number: 4
// *
// * *
// *   *
// *     *
// *   *
// * *
//  *
import java.util.*;
public class hollowdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        //top
        for(int i=0;i<n;i++){
            //spaces
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars
            
                System.out.print("*");
        
            if (i != 0) {
                for(int j=0;j<2*i-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        //bottom
        for(int i=0;i<n-1;i++){
            //space
            for(int j=0;j<i+1;j++){
                System.out.print(" ");
            }
            //stars
            
                System.out.print("*");
                if (i != (n-2)) {
                    
                    for(int j=0;j<2*(n-i)-5;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
