package vererbung.sample.verhiclemanagement;

public class Flugzeug implements Buchbar {

    private String bezeichnung;

    private String nr;

    private boolean gebucht;

    private boolean gewartet;

    public Flugzeug(String bezeichnung, String nr) {
        this.bezeichnung = bezeichnung;
        this.nr = nr;
    }

    @Override
    public boolean buchen() {
        if(gebucht) return false;
        if(!gewartet) return false;
        return gebucht = true;
    }

    @Override
    public boolean zurueckgeben() {
        if(!gebucht) return false;
        gewartet = false;
        return !(gebucht = false);
    }

    public void wartungDurchfuehren() {
        this.gewartet = true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flugzeug{");
        sb.append("bezeichnung='").append(bezeichnung).append('\'');
        sb.append(", nr='").append(nr).append('\'');
        sb.append(", gebucht=").append(gebucht);
        sb.append(", gewartet=").append(gewartet);
        sb.append('}');
        return sb.toString();
    }
}
