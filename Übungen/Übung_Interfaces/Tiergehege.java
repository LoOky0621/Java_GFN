package Übung_Interfaces;

public class Tiergehege {

    private String bodenPflanzenfresserGehege;
    private String bodenFleischfresserGehege;
    private String luftPflanzenfresserGehege;
    private String luftFleischfresserGehege;
    private String wasserPflanzenfresserGehege;
    private String wasserFleischfresserGehege;
    private String terrariumPflanzenfresserGehege;
    private String terrariumFleischfresserGehege;

    public Tiergehege() {
        this.bodenPflanzenfresserGehege = "Innen-Gehege-Pflanzenfresser";
        this.bodenFleischfresserGehege = "Außen-Gehege-Fleischfresser";
        this.luftPflanzenfresserGehege = "Vogel-Käfig-Pflanzenfresser";
        this.luftFleischfresserGehege = "Vogel-Käfig-Fleischfresser";
        this.wasserPflanzenfresserGehege = "Aquarium-Pflanzenfresser";
        this.wasserFleischfresserGehege = "Aquarium-Fleischfresser";
        this.terrariumPflanzenfresserGehege = "Terrarium-Pflanzenfresser";
        this.terrariumFleischfresserGehege = "Terrarium-Fleischfresser";
    }

    public String getBodenPflanzenfresserGehege() {
        return bodenPflanzenfresserGehege;
    }

    public String getBodenFleischfresserGehege() {
        return bodenFleischfresserGehege;
    }

    public String getLuftPflanzenfresserGehege() {
        return luftPflanzenfresserGehege;
    }

    public String getLuftFleischfresserGehege() {
        return luftFleischfresserGehege;
    }

    public String getWasserPflanzenfresserGehege() {
        return wasserPflanzenfresserGehege;
    }

    public String getWasserFleischfresserGehege() {
        return wasserFleischfresserGehege;
    }

    public String getTerrariumPflanzenfresserGehege() {
        return terrariumPflanzenfresserGehege;
    }

    public String getTerrariumFleischfresserGehege() {
        return terrariumFleischfresserGehege;
    }


    public static String starteFütterung(Tier tier){
        String aktiv = tier.getAktiv().toLowerCase();
        return aktiv.equals("nachtaktiv") ? tier.getFütterungn() : tier.getFütterungt();
    }
    public static String starteNachtruhe(Tier tier){
        String aktiv = tier.getAktiv().toLowerCase();
        /*switch (aktiv){
            case "nachtaktiv":
                return tier.getNacht();
            default:
                return tier.getTag();
        }*/
        return aktiv.equals("nachtaktiv") ? tier.getNacht() : tier.getTag();
    }
}
