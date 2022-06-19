import java.util.Random;

public class Massive {
    public static void main(String[] args) {
        int count = 0;
        Random r = new Random();
        int[] mass = r.ints(100, -99, 99).toArray();
        for (int i = 0; i < mass.length; i++) {
            int element = mass[i];
            if (element > 0 && element % 2 > 0) {
                count++;
            }
        }
        System.out.println(" оличество положительных нечетных чисел: "+ count);
    }
}
