package vererbung.sample.verhiclemanagement;

public class Fahrzeug implements Buchbar {

    private String kennzeichen;

    private String marke;

    private String typ;

    private boolean gebucht;

    public Fahrzeug(String kennzeichen, String marke, String typ) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.typ = typ;
    }

    @Override
    public boolean buchen() {
        if(gebucht) return false;
        return gebucht = true;
    }

    @Override
    public boolean zurueckgeben() {
        if(!gebucht) return false;
        return !(gebucht = false);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", typ='").append(typ).append('\'');
        sb.append(", gebucht=").append(gebucht);
        sb.append('}');
        return sb.toString();
    }
}
