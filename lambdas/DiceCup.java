package lambdas;

import java.util.Arrays;

public class DiceCup {

    public static void main(String[] args) {

        // int roll();
        final Dice W6 = () -> Dice.roll(6);
        final Dice W10 = () -> Dice.roll(10);
        final Dice W20 = () -> Dice.roll(20);
        final Dice W100 = () -> Dice.roll(100);

        System.out.println(W6.roll());
        System.out.println(W10.roll());
        System.out.println(W20.roll());

        System.out.println();

        //System.out.println(Arrays.toString(roll(W6, 10)));
        //System.out.println(Arrays.toString(roll(W100, 10)));
        System.out.println(Arrays.toString(roll(() -> Dice.roll(25), 10)));
    }

    static int[] roll(Dice dice, int num) {

        int[] arr = new int[num];

        for (int i = 0; i < num; i++)
            arr[i] = dice.roll();

        return arr;
    }
}
