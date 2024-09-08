// Enter the number: 4
// 1 
// 2 3      
// 4 5 6    
// 7 8 9 10 
import java.util.Scanner;

public class floydtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
