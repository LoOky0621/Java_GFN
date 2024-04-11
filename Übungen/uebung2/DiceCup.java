package uebung2;

import java.util.Random;

public class DiceCup {

    private int size;

    private Random rand = new Random();

    public DiceCup() {
        size = 6;
    }

    public DiceCup(int size) {
        // this.size isst die Instanzvariable
        // size ist die lokale Variable
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int roll() {
        return rand.nextInt(size) + 1;
    }

    public int[] roll(int num) {
        int[] results = new int[num]; // Array in passender Größe wird gebaut
        for(int i = 0; i < results.length; i++) {
            results[i] = roll(); // Array wird mit Zufallswerten gefüllt
        }
        return results;
    }

    public String stats(int[] results) {

        int[] stats = new int[size];

        for(int i = 0; i < results.length; i++) {
            int index = results[i]-1;
            stats[index]++;
        }

        return createOutput(stats);
    }

    public String createOutput(int[] stats) {
        String output = "";

        for(int i = 0; i < stats.length; i++) {
            output += stats[i] + " mal " + (i + 1) + " \n";
        }
        return output;
    }


}
