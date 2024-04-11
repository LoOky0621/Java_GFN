package basics;

public class AbstractTest {

    public static void main(String[] args) {

        //Fahrzeug f1 = new Fahrzeug();

        Fahrzeug f2 = new PKW();
        f2.gasGeben();

        f2 = new LKW();
        f2.gasGeben();

        // DRY
    }
}

abstract class Fahrzeug {

    private String kennzeichen;

    private String marke;

    private int baujahr;

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public abstract void gasGeben();

    public abstract void abbremsen();
}

class PKW extends Fahrzeug {

    @Override
    public void gasGeben() {
        System.out.println("PKW gibt 10 km/h mehr gas");
    }

    @Override
    public void abbremsen() {
        System.out.println("PKW bremst um 10 km/h ab");
    }
}

class LKW extends Fahrzeug {

    @Override
    public void gasGeben() {
        System.out.println("LKW gibt 5 km/h mehr gas");
    }

    @Override
    public void abbremsen() {
        System.out.println("LKW bremst um 5 km/h ab");
    }
}

