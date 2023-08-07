
// random two odd number
import java.util.Scanner;

public class randomodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter two number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a % 2 == 1) && (b % 2 == 1)) {
            System.out.print("both number is odd");
            scanner.close();
        }

    }

}
