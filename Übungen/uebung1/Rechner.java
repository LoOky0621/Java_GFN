package uebung1;

public class Rechner {

    private Protokoll protokoll = new Protokoll();

    public double add(double a, double b) {
        double sum = a + b;
        protokoll.add(a + " + " + b + " = " + sum);
        return sum;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double multi(double a, double b) {
        return a * b;
    }

    public void printProtokoll() {
        System.out.println(protokoll.getText());
    }
}
