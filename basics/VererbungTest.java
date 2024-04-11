package basics;

public class VererbungTest {

    public static void main(String[] args) {

        //Student s1 = new Student();
        Mensch s1 = new Student(); // Student IS-A Mensch
        s1.essen();
        s1.arbeiten();

        System.out.println();
        s1 = new Forscher(); // Student IS-A Mensch
        s1.essen();
        s1.arbeiten();

    }
}

class Mensch {

    public void arbeiten() {
        System.out.println("Ich tue meinen Job!");
    }

    public void essen() {
        System.out.println("Ich esse alles auf!");
    }
}

class Student extends Mensch {

    public void arbeiten() {
        System.out.println("Job? Brauch ich nicht. Ich bekomme BAFÖG!");
    }

    public void essen() {
        System.out.println("Toll! Die Mensa ist da!");
    }
}

class Forscher extends Mensch {

    public void arbeiten() {
        System.out.println("Ich erforsche Dinge");
    }

    public void essen() {
        System.out.println("Essen... brauch ich nicht...");
    }
}