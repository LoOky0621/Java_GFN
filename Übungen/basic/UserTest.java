package basic;

public class UserTest {

    public static void main(String[] args) {  // Einstiegspunkt für das Programm

        User u1 = new User(); // Objekt wird instanziert
        //u1.firstname = "Peter"; FUNKTIONIERT NICHT DA PRIVATE
        u1.setFirstname("Peter");
        u1.setLastname("Parker");
        //System.out.println(u1.firstname); FUNKTIONIERT NICHT DA PRIVATE
        System.out.println(u1.getFirstname() + " " + u1.getLastname());

        User u2 = new User(); // Objekt wird instanziert
        System.out.println(u2.getFirstname() + " " + u1.getLastname());


        UserTest test = new UserTest();
        test.wortErweitern("Hallo");

        // Hier wird die Klasse (UserTest) verwendet
        wortStatischErweitern("Hallo");
        UserTest.wortStatischErweitern("Hallo");
    }

    // Instanzmethode: gehören einen Objekt
    public String/*Rückgabetyp*/ wortErweitern(String /*Eingangstyp*/ wort){
        wort += " erweitern ....";
        return wort;
    }

    // Klassenmethode: gehören einer Klasse
    public static String wortStatischErweitern(String wort){
        wort += " erweitern ....";
        return wort;
    }
}
