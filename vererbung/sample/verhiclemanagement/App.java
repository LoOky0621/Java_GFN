package vererbung.sample.verhiclemanagement;

public class App {

    public static void main(String[] args) {

        Standort standort = new Standort();

        Fahrzeug f1 = new Fahrzeug("AB:CD123", "Ford", "Fiesta");
        Fahrzeug f2 = new Fahrzeug("HH:XY256", "Fiat", "500");
        Fahrzeug f3 = new Fahrzeug("ZZ:BY333", "Renault", "Zoe");

        Flugzeug f4 = new Flugzeug("AB22-17", "1234");

        standort.buchen(f1);
        standort.buchen(f2);
        standort.buchen(f3);

        f4.wartungDurchfuehren();
        standort.buchen(f4);

        standort.zurueckgeben(f2);
        System.out.println(f2);

        System.out.println();
        standort.printElements();



    }

}
