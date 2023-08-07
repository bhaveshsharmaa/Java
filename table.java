// table of 2 useinpute

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number:");
        int num = scanner.nextInt();
        int multi = 1;

        while (multi <= 10) {
            int result = num * multi;
            System.out.println(num + " x " + multi + " = " + result);
            multi++;
        }
        scanner.close();
    }
}