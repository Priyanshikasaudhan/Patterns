// Enter number: 4
// A 
// B B     
// C C C   
// D D D D 
import java.util.Scanner;

public class chartriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter number: ");
        int n  = sc.nextInt();
        char c = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(c+" ");
            }
            c++;
            System.out.println();
        }
    }
}
