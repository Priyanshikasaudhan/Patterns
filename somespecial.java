// output:-Enter the value: 4
// 1 
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
import java.util.Scanner;

public class somespecial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            // int num = 1;
            for(int j=1;j<=i+1;j++){
                System.out.print( j + " ");
            }
             if (i!=0) {
                for(int j=i;j>=1;j--){
                    System.out.print(j+ " ");
                }
             }
             System.out.println();
        }
    }
}
