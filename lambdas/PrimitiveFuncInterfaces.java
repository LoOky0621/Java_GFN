package lambdas;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;

public class PrimitiveFuncInterfaces {

    public static void main(String[] args) {

        IntSupplier w6 = () -> (int)(Math.random() * 6) + 1;

        IntConsumer cons1 = (w) -> {
            double d = w; // w ist primitiv
            System.out.println(d);
        };

        Consumer<Integer> cons2 = (w) -> {
            Double d = w.doubleValue(); // w ist komplex Integer
            System.out.println(d);
        };
    }
}
