import java.util.Scanner;

public class studentperecentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of 5 subjects: ");
        int hindi = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int phy = sc.nextInt();
        int che = sc.nextInt();

        float per = (hindi + eng + phy + math + che) / 5;
        if (per < 25) {
            System.out.println("your grad is 'F' ");
        } else if (per >= 25 && per < 45) {
            System.out.println("your grad is 'E' ");
        } else if (per >= 45 && per < 50) {
            System.out.println("your grad is 'D' ");
        } else if (per >= 50 && per < 60) {
            System.out.println("your grad is 'C' ");
        } else if (per >= 60 && per < 80) {
            System.out.println("your grad is 'B' ");
        } else {
            System.out.println("your grad is 'A' ");
        }

    }
}