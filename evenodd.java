import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any number : ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("a is an Even Number");
        } else {
            System.out.println("a is an Odd Number");
            scanner.close();
        }
    }

}
