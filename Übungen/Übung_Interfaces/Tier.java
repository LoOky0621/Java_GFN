package Übung_Interfaces;

class Tier {

    protected String name;
    public String art;
    public String essen;
    public String aktiv;
    public String lebensraum;
    private String nacht;
    private String tag;
    private String fütterungn;
    private String fütterungt;

    public String getNacht() {
        return nacht;
    }

    public String getTag() {
        return tag;
    }

    public String getFütterungn() {
        return fütterungn;
    }

    public String getFütterungt() {
        return fütterungt;
    }

    public Tier() {
    }

    public Tier(String name, String art, String essen, String aktiv, String lebensraum) {
        this.name = name;
        this.art = art;
        this.essen = essen;
        this.aktiv = aktiv;
        this.lebensraum = lebensraum;
        this.nacht = "Nachtruhe zwischen 8:00uhr - 18:00Uhr";
        this.tag = "Nachtruhe zwischen 20:00Uhr - 6:00Uhr";
        this.fütterungt = "Fütterungen:\n1: 9:00Uhr\n2: 17:00Uhr";
        this.fütterungn = "Fütterungen:\n1: 21:00Uhr\n2: 4:00Uhr";
    }

    public String getName() {
        return name;
    }

    public String getArt() {
        return art;
    }

    public String getEssen() {
        return essen;
    }

    public String getAktiv() {
        return aktiv;
    }

    public String getLebensraum() {
        return lebensraum;
    }
}