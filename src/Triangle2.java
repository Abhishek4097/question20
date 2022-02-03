import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        for (int i=1;i<=n;i++){
            //inner loop for space print   for number triangle for(int j=1;j<=i;j++) and print j
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop for star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
