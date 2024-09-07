import java.util.Scanner;
public class charvalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        char c = 'A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c+" ");
                c = (char) (c+1);
            }

            System.out.println();
        }
        System.out.print("After pattern: ");
        System.out.println(c);
    }
}
