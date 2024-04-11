package basics;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class TimeTest3 {

    public static void main(String[] args) {

        //long start = System.currentTimeMillis();
        Instant start = Instant.now();

        final int SIZE = 1_000_000;

        Random rand = new Random();
        int[] arr = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            arr[i] = rand.nextInt(6) + 1;
        }

        //long end = System.currentTimeMillis();
        Instant end = Instant.now();
        //System.out.println(end - start + " ms");

        System.out.println(Duration.between(start, end).toNanos() + "ns");

    }
}
