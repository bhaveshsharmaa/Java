
// userinput two num  
import java.util.Scanner;

public class twonum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter two number a and b: ");

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        while (i <= j) {
            System.out.print(i + " ");
            i++;

        }
        scanner.close();
    }
}
