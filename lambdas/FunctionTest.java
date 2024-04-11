package lambdas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionTest {

    public static void main(String[] args) {

        // R apply(T t);
        Function<String, LocalDate> parseToLocalDate = str -> LocalDate.parse(str, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        // parseToLocalDate = str -> LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        // parseToLocalDate = str -> LocalDate.parse(str, DateTimeFormatter.ofPattern("D-yyyy"));

        System.out.println(parseToLocalDate.apply("10.05.2015"));

        Function<String, String> cleaner = str -> str.trim();
        System.out.println(cleaner.apply("    Hallo     "));

        // Eine Funktion die den gleichen Typ entgegennimmt und zurückgibt
        UnaryOperator<String> cleaner2 = str -> str.trim();

        // MathOperation
        // R apply(T t, U u);
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        System.out.println(add.apply(10.0, 25.0));
    }
}
