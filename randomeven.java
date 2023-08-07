
// random two even number
import java.util.Scanner;

public class randomeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter two number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a % 2 == 0) && (b % 2 == 0)) {
            System.out.print("both number is even");
            scanner.close();
        }

    }

}
