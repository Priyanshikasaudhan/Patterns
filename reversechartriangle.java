// output:-
// A 
// B A
// C B A
// D C B A
import java.util.Scanner;
public class reversechartriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the value of pattern:");
        int n= sc.nextInt();

            int alphabet = 64; //ASCII value of “A”
            
            for (int i = 0; i <n; i++) {
            
            for (int j = i+1; j>0; j--) {
            
            System.out.print((char) (alphabet + j) + " "); //Logic to print Alphabet pattern
            
            }
            
            System.out.println();
            
            }
    }
}
 
