// 3 and 7 division
public class division {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 100) {
            if ((a % 3 == 0) && (a % 7 == 0)) {
                System.out.println(a);

            }
            a++;
        }
        scanner.close();
    }

}
