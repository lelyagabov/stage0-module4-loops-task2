package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int numToMultiply = multiplyByAndToInclusive;

        if (multiplyByAndToInclusive < 0) {
            multiplyByAndToInclusive = -multiplyByAndToInclusive;
        } else if (multiplyByAndToInclusive == 0) {
            multiplyByAndToInclusive = -1;
        }

        int i = 0;

        while (i <= multiplyByAndToInclusive) {
            System.out.println(numToMultiply * i);
            i++;
        }

    }

}
