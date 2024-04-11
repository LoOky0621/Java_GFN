package lambdas;

import java.util.Arrays;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        // R get()
        Supplier<Integer> W6 = () -> (int)(Math.random() * 6) + 1; // Statt Dice
        Supplier<Integer> W10 = () -> (int)(Math.random() * 10) + 1; // Statt Dice
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());
        System.out.println(W6.get());

        // Als anonyme Klasse
        Supplier<Integer> W4 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int)(Math.random() * 4) + 1;
            }
        };

        //int[] arr = getAsArray(W6, 10);
        int[] arr = getAsArray(W10, 10);
        System.out.println(Arrays.toString(arr));
    }

    static int[] getAsArray(Supplier<Integer> sup, int num) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = sup.get();
        }
        return arr;
    }
}

// Als konkrete Klasse
class IntegerSup implements Supplier<Integer> {

    @Override
    public Integer get() {
        return (int)(Math.random() * 200) + 1;
    }
};