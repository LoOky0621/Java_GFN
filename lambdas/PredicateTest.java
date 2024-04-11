package lambdas;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class PredicateTest {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();
        users.add(new User("Peter", "Parker", LocalDate.of(1998, 10, 15)));
        users.add(new User("Carol", "Danvers", LocalDate.of(2001, 5, 17)));
        users.add(new User("Natasha", "Romanov", LocalDate.of(2005, 7, 13)));
        users.add(new User("Steve", "Rogers", LocalDate.of(1921, 1, 1)));

        // Predicate prüft ein Objekt gegen eine Bahauptung
        //users.removeIf(u -> (Year.now().getValue() - u.getBirthDate().getYear()) < 25);
        users.removeIf(u -> Period.between(LocalDate.now(), u.getBirthDate()).get(ChronoUnit.YEARS) < 25);

        users.forEach(u -> System.out.println(u.getFirstname() + " " + u.getLastname()));


    }
}

class User {

    private String firstname;
    private String lastname;
    private LocalDate birthDate;

    public User(String firstname, String lastname, LocalDate birthDate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
