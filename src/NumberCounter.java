import java.util.Random;

public class NumberCounter {


    public int[] getRandomMass() {
        Random rand = new Random();
        int[] mass = rand.ints(100, -99, 99).toArray();
        return mass;
    }

    public int[] getRandomMass(int size, int lower, int upper) {
        Random rand = new Random();
        int[] mass = rand.ints(size, lower, upper).toArray();
        return mass;
    }

    public int[] getRandomMass(int size) {
        Random rand = new Random();
        int[] mass = rand.ints(size).toArray();
        return mass;
    }

    public int[] getRandomMass(int lower, int upper) {
        Random rand = new Random();
        int[] mass = rand.ints(lower, upper).limit(100).toArray();
        return mass;
    }

    public int count(int[] mass) {
        int count = 0;
        for ( int i = 0; i < mass.length; i++) {
            int element = mass [i];
            if(element > 0 && element % 2 > 0) {
                count ++;
            }
        }
        return count;
    }

    public void printCount(int count) {
        System.out.println(" оличество положительных нечетных чисел: " + count);
    }

}
