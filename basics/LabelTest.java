package basics;

public class LabelTest {

    public static void main(String[] args) {

        f1: for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                //if(j == 5) break; // bricht das innere for ab
                //if(j == 5) break f1; // bricht das äußere for ab
                //if(j == 5) continue f1; // springt zum nächsten durchlauf der äußeren for-anweisung
            }
        }

    }
}
