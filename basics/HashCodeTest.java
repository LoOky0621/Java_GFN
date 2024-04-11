package basics;

public class HashCodeTest {

    public static void main(String[] args) {

        Object o = new Object();

        // Wenn ein Objekt ausgegeben wird, muss es erstmal in String konvertiert werden
        // Passiert automatisch durch Aufruf von toString()
        System.out.println(o);

        int i = 245393274;
        System.out.println(Integer.toHexString(i)); // Wandelt eine Zahl von Dezimal in Hex


        String a = "Hallo Welt";
        //String b = "Hallo Welt";
        String b = new String("Hallo Welt");

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());


        User u = new User();
        u.hashCode(); // Object vererbt an jedes Objekt hashCode, equals, toString, getClass, wait, notify, notifyAll

        System.out.println(u); // toString wird automatisch verwendet

        System.out.println(new KlasseA());

    }
}
