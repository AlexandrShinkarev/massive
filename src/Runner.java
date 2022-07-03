public class Runner {
    public static void main(String[] args) {
        NumberCounter numberCounter = new NumberCounter();
        int[] mass = numberCounter.getRandomMass();
        int count = numberCounter.count(mass);
        numberCounter.printCount(count);

        NumberCounter counter1 = new NumberCounter();
        int [] massWithArgs = counter1.getRandomMass(20,-666,999);
        int countWithArgs = counter1.count(massWithArgs);
        counter1.printCount(countWithArgs);

        NumberCounter counter2 = new NumberCounter();
        int [] massWithSize = counter2.getRandomMass(50);
        int countWithSize = counter2.count(massWithSize);
        counter2.printCount(countWithSize);

        NumberCounter counter3 = new NumberCounter();
        int [] massWithRange = counter3.getRandomMass(-735, 964);
        int countWithRange = counter3.count(massWithRange);
        counter3.printCount(countWithRange);
    }

}
