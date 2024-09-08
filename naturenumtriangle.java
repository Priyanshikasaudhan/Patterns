// Enter the value of pattern:4
// 1 
// 1 2     
// 1 2 3   
// 1 2 3 4 
import java.util.Scanner;
public class naturenumtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the value of pattern:");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            // int num= 1;
            for(int j=1;j<=i+1;j++){
                System.out.print(j+" ");
                // num++;
            }
            System.out.println();
        }
    }
}
