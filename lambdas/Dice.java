package lambdas;

import java.util.Random;

// SAM: Single Abstrac Method
public interface Dice {

    Random RANDOM = new Random();

    // abstract method
    int roll();

    static int roll(int size) {
        return RANDOM.nextInt(size) + 1;
    }
}
