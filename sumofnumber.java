//1--->10 sum (addition)
public class sumofnumber {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;

        while (number <= 10) {
            sum += number;
            number++;
        }

        System.out.println("sum of number 1 to 10: " + sum);
    }
}
