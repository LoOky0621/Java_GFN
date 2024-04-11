package vererbung.a;

import java.time.LocalDate;

public class Person {

    protected String firstname;
    protected String lasrtname;

    public Person() {
    }

    public Person(String firstname, String lasrtname) {
        this.firstname = firstname;
        this.lasrtname = lasrtname;
    }

    protected void sayHello() {
        System.out.println(firstname + " " + lasrtname + ": Hello");
    }
}
