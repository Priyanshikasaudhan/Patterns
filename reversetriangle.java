import java.util.Scanner;
public class reversetriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}
