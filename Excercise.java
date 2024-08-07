import java.util.Scanner;

public class Excercise {

    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
        char alpha[] = {'a','b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'c', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        System.out.print("Enter message : ");
        str = scan.nextLine();

        char chr[] = str.toCharArray(); // '1' '1' '1'

        for (int i=0; i<chr.length; i++) {
            
            int temp = chr[i] - '0';

            if(temp == arr[temp-1]){
                System.out.println(alpha[temp-1]);
            }
        }
    }
}
