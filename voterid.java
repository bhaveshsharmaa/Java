import java.util.Scanner;

public class voterid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the age : ");
        int a = scanner.nextInt();

        if (a >= 18) {

            System.out.println("you are eligible to vote");
        } else {
            System.out.println("you are not eligible to vote");
        }
        scanner.close();

    }
}