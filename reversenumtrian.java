// Enter the number: 4
// 1 1 1 1 
// 2 2 2   
// 3 3     
// 4 
import java.util.Scanner;
public class reversenumtrian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print(i+1 +" ");
            }
            System.out.println();
        }
    }
}
