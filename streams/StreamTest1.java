package streams;

import java.util.stream.IntStream;

public class StreamTest1 {

    public static void main(String[] args) {

        IntStream.range(1, 100)
                //.parallel() // Verarbeitung mit mehreren Threads
                .filter(i -> { // Intermediate Operation
                    System.out.print("#" + i);
                    return i % 2 == 0;
                })
                .map(i -> i * i) // Intermediate Operation
                .forEach(i -> System.out.print("@" + i)); // Terminierende Operation
    }
}
