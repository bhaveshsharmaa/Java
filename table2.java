
// 2 3 4 5 6 7 8 9 10 table print (nested while)
import java.util.Scanner;

public class table2 {
    public static void main(String[] args) {
        int table = 2;

        while (table <= 10) {
            int multi = 1;

            System.out.println("Table of " + table + ":");

            while (multi <= 10) {
                int result = table * multi;
                System.out.println(table + " x " + multi + " = " + result);
                multi++;
            }

            System.out.println();
            table++;
        }

    }
}
