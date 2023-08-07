// this program is alphabet or not.

import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a character: ");
        char ch = scanner.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("this is a charcter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("this is a charcter");
        } else {
            System.out.println("this is a digit");
        }
    }
}
