package streams;

import java.util.ArrayList;
import java.util.List;

public class MethodenReferenzTest1 {

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();
        namen.addAll(List.of("Peter", "Bruce", "Carol", "Tony"));
        System.out.println(namen);

        // void accept(T t);
        namen.forEach(MethodenReferenzTest1::print); // Verwendet die vordefinierte statische Methode als Consumer

        MethodenReferenzTest1 mrt1 = new MethodenReferenzTest1();
        namen.forEach(mrt1::printInst); // Verwendet die vordefinierte Instanz-Methode als Consumer


        // void println(String x) hat die gleiche Signatur wie der Consumer
        namen.forEach(System.out::println);

    }

    static public void print(String s) {
        System.out.println("####" + s + "####");
    }

    public void printInst(String s) {
        System.out.println("##" + s + "##");
    }
}
