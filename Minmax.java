import javax.naming.PartialResultException;

public class Minmax {
    public static void main(String[] args) {
        int[] numbers = {95, 18, 27, 64, 25, 14, 13, 52, 21};
        int min = numbers[0];
        int max = numbers[0];
        for (int n : numbers) {
            min = min < n ? min : n;
            max = max > n ? max : n;
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);


    }
}
