public class Triangle {
    public static void main(String[] args) {
        int n=4;
        //for inverted triangle
        //for(int i=n;i<=1;i==)
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
