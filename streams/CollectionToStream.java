package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionToStream {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();
        namen.add("Carol");
        namen.add("Bruce");
        namen.add("Tony");
        namen.add("Natasha");
        namen.add("Steve");
        namen.add("Peter");
        namen.add("Scott");

        // wird sequeziell verarbeitet
        namen.forEach(n -> {
            System.out.println(Thread.currentThread().getName() + ":" + n);
        });

        System.out.println();

        // Collection zu Stream

        namen.stream() // Werte der Collection werden in einem Stream verfügbar gemacht
                .parallel() // wird parallel verarbeitet
                .forEach(n -> {
                    System.out.println(Thread.currentThread().getName() + ":" + n);
                });

        // Array zu Stream
        String[] arr = {"Peter", "Carol", "Bruce", "Natasha"};
        Arrays.stream(arr)
                .forEach(n -> System.out.println(n));

        // NIO
        try {
            Path path = Paths.get("content.txt");
            Files.lines(path)
                    .filter(l -> l.length() > 250)
                    .map(l -> l.toUpperCase())
                    .forEach(l -> System.out.println(l));
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n");

        Random r = new Random();
        final Supplier<Integer> W6 = () -> r.nextInt(6) + 1;

        // Endlos-Stream
        //Stream.generate(W6)
        //        .forEach(System.out::println);

        List<Integer> zahlen = Stream.generate(W6)
                .limit(100)
                .collect(Collectors.toList());

        System.out.println(zahlen);

    }



}
