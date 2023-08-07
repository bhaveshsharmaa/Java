// userinput divisible
import java.util.Scanner;

public class divisibleuser {
    public static void main(String[] args) {
        System.out.print("enter value of n, m and k number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int a = 1;
        System.out.println("Numbers divisible by " + n + ", " + m + ", and " + k + ":");
        while (a <= 100) {
            if ((a % n == 0) && (a % m == 0) && (a % k == 0)) {
                System.out.println(a);
            }
            a++;
        }
        scanner.close();
    }

}
