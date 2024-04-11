package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>();

        Consumer<Integer> generate = size -> zahlen.add((int)(Math.random() * size) + 1);

        generate.accept(10);
        generate.accept(10);
        generate.accept(10);
        generate.accept(10);

        System.out.println(zahlen);


    }

}
