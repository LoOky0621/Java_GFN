package basics;

public class UserTest {

    public static void main(String[] args) { // Einstiegspunkt für das Programm

        User u1 = new User(); // Objekt wird instanziert
        //u1.firstname = "Peter";
        u1.setFirstname("Bruce");
        u1.setLastname("Banner");
        //System.out.println(u1.firstname);
        System.out.println(u1.getFirstname() + " " + u1.getLastname());

        User u2 = new User(); // Objekt wird instanziert
        System.out.println(u2.getFirstname() + " " + u2.getLastname());

        UserTest test = new UserTest();
        test.wortErweitern("Hallo"); // Methode wird auf dem Objekt aufgerufen

        // Hier wird die Klasse (UserTest) verwendet
        String neuesWort = wortStatischErweitern("Hallo"); // Return der Methode wird in eine Variable geschrieben
        System.out.println(neuesWort);

        // Methode wird auf der Klasse/ dem Bauplan aufgerufen
        neuesWort = UserTest.wortStatischErweitern("Hallo Welt");
        System.out.println(neuesWort);

    }

    // Instanzmethode: gehören einem Objekt
    public String /*Rückgabetyp */ wortErweitern(String /* Eingangstyp */ wort) {
        wort += " erweitert...";
        return wort;
    }

    // Klassenmethode: gehören einer Klasse
    public static String /*Rückgabetyp */ wortStatischErweitern(String /* Eingangstyp */ wort) {
        wort += " erweitert...";
        return wort;
    }
}
