package basics;

// java basics.ArgsTest A B C "Hallo Wel"

public class ArgsTest {

    public static void main(String[] args) {

        for (String s : args) {
            System.out.println(s);
        }
    }
}
