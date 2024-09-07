import java.util.Scanner;

/**
 * square
 * 
 */
public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter any number: ");
        int n = sc.nextInt();
        for(int i=0;i<=n-1;i++){
            for(int j=0;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}