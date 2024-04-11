package lambdas;

import java.util.Random;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        final Random RAND = new Random();

        Stream.generate(() -> RAND.nextInt(6))
                .forEach(w -> System.out.println(w));


    }
}
