package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;

        while (i <= printToInclusive) {
            if (i % 2 != 0 && i % 3 != 0 && i % 4 != 0 && i % 5 != 0 && i % 6 != 0 &&
            i % 7 != 0 && i % 8 != 0 && i % 9 != 0 || (i == 2 || i == 3 || i == 5 || i == 7)) {
                System.out.println(i);
            }

            i++;
        }
    }

}
