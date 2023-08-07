import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the year : ");
            int yr = sc.nextInt();
            if (yr % 4 == 0 && yr % 100 != 0) {
                System.out.print("this is a leap year ");
            } else {
                System.out.print("this is not a leap year");

            }
        }
    }

}
