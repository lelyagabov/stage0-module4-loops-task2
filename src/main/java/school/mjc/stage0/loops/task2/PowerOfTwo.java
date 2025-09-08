package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0) {

            int num = 1;
            int i = 0;

            while (i <= power) {
                System.out.println(num);
                num *= 2;
                i++;
            }

        } else {
            System.out.println("too much power");
        }
    }

}
