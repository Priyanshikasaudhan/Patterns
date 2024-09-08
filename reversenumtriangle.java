// Enter the value of pattern:4
// 1       
// 2 1     
// 3 2 1   
// 4 3 2 1 
import java.util.Scanner;
public class reversenumtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the value of pattern:");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
