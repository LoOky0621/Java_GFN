package vererbung;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class OverloadingTest {

    public static void main(String[] args) {

        Person p1 = new Person();
        //String s1 = p1.sayHallo();

        Person p2 = new Scout();
        //String s2 = p2.sayHallo();

        machWas(new Person());
        machWas(new Scout());
        machWas(new Jocker());

        System.out.println();
        machWasAnderes(new Person());
        machWasAnderes(new Scout());
        machWasAnderes(new Jocker());

        String s = "Moin";
        //s.join(); // join ist statisch
        String namen = String.join("; ", "Peter", "Carol", "Bruce", "Steve");
        System.out.println(namen);


    }

    public static void machWas(Person p) {
        try {
            String s = p.sayHallo();
            System.out.println(s);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void machWasAnderes(Person p) {
        Number n = p.getAge();
        System.out.println(n);
    }
}

class Person {

    String sayHallo() throws IOException {
        return "Hallo";
    }

    Number getAge() {
        return 10;
    }
}

class Scout extends Person {

    public String sayHallo() throws IOException {
        return "Hi";
    }

    Integer getAge() {
        return 15;
    }
}

class Jocker extends Person {

    public String sayHallo() {
        return "HHAAAHHHAHAHHAHAHAHHAHAHAHHAHAHAHHAHAHHHHHAAAAAA!!!!!";
    }

    Double getAge() {
        return 10.0;
    }
}