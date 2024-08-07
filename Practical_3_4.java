import java.util.Scanner;

public class Practical_3_4{
    public static void main(String[] args) {
        int n;
        double res = 0.0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer number : ");
        n = scan.nextInt();

        for(int i=1; i<=n; i++){
            res = res + (double)1/i;
            if(i == n){
                System.out.printf("%.2f", res);
                break;
            }
        }

        scan.close();
    }
}