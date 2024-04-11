package Donnerkuppel;

public class Eigenschaften {
    public static int würfel(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static int angriff(){
        return (würfel(10,1));
    }

    public static int beweglichkeit(){
        return würfel(10,1);
    }

    public static String bezeichnung() {
        String zufallsName[] = {
                "Lanzelot",
                "Gawain",
                "Tristan",
                "Perceval",
                "Artus",
                "Galahad",
                "Erec",
                "Böswald",
                "Siegfried",
                "Hagen"};
        return zufallsName[würfel(9,0)];
    }

    public static int gesundheit(){
        return würfel(100,70);
    }
    public static int genauigkeit(){
        return würfel(5,1);
    }
}