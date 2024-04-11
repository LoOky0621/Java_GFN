package basics;

public class Benutzer {

    private static long count;

    private long id;
    private String vorname;
    private String nachname;
    private String stadt;
    private String plz;
    private String strasse;
    private String nr;
    private boolean aktiv;

    public Benutzer(String vorname, String nachname, String stadt, String plz, String strasse, String nr, boolean aktiv) {
        this.id = ++count;
        this.vorname = vorname;
        this.nachname = nachname;
        this.stadt = stadt;
        this.plz = plz;
        this.strasse = strasse;
        this.nr = nr;
        this.aktiv = aktiv;
    }

    public long getId() {
        return id;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getStadt() {
        return stadt;
    }

    public String getPlz() {
        return plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public String getNr() {
        return nr;
    }

    public boolean isAktiv() {
        return aktiv;
    }

    /*
    @Override
    public String toString() {
        return "Benutzer{" +
                "id=" + id +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", stadt='" + stadt + '\'' +
                ", plz='" + plz + '\'' +
                ", strasse='" + strasse + '\'' +
                ", nr='" + nr + '\'' +
                ", aktiv=" + aktiv +
                '}';
    }
    */

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Benutzer{");
        sb.append("id=").append(id);
        sb.append(", vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", stadt='").append(stadt).append('\'');
        sb.append(", plz='").append(plz).append('\'');
        sb.append(", strasse='").append(strasse).append('\'');
        sb.append(", nr='").append(nr).append('\'');
        sb.append(", aktiv=").append(aktiv);
        sb.append('}');
        return sb.toString();
    }
}
