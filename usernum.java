import java.util.Scanner;

public class usernum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        if (a > 10) {
            System.out.println("a is greater than 10");
        }

        scanner.close();
    }
}
