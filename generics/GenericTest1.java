package generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericTest1 {

    public static void main(String[] args) {

        List zeug = new ArrayList(); // Nimmt Object entgegen
        zeug.add(100);
        zeug.add("Moin");
        zeug.add(LocalDate.now());
        Object o = zeug.get(1);

        List<String> strings = new ArrayList<>();
        strings.add("Hallo");

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(123);

        StringBox b1 = new StringBox();
        b1.setValue("Moin");

        Box<LocalDate> dates = new Box<>();
        dates.setValue(LocalDate.now());
        LocalDate ld = dates.getValue();
        System.out.println(dates);

        Box<String> strings2 = new Box<>();
        strings2.setValue("Hallo");
        String str = strings2.getValue();
        System.out.println(strings2);

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("Berlin", 3_600_000);
        einwohner.put("München", 1_500_000);
        einwohner.put("Kiel", 246_000);

        System.out.println(einwohner.get("München"));
    }
}

class StringBox {

    private String value;

    public StringBox() {
    }

    public StringBox(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class IntegerBox {

    private Integer value;

    public IntegerBox() {
    }

    public IntegerBox(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}

class Box<T> {

    private T value;

    public Box() {
    }

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "value = " + value.toString();
    }
}
