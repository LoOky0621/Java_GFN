package Donnerkuppel;

public class Kämpfer {
    private String name;
    private int stärke;
    private int agilität;
    private int lebenspunkte;

    public Kämpfer(String name, int stärke, int agilität, int lebenspunkte) {
        this.name = name;
        this.stärke = stärke;
        this.agilität = agilität;
        this.lebenspunkte = lebenspunkte;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStärke() {
        return stärke;
    }

    public void setStärke(int stärke) {
        this.stärke = stärke;
    }

    public int getAgilität() {
        return agilität;
    }

    public void setAgilität(int agilität) {
        this.agilität = agilität;
    }

    public int getLebenspunkte() {
        return lebenspunkte;
    }

    public void setLebenspunkte(int lebenspunkte) {
        this.lebenspunkte = lebenspunkte;
    }
}