package basics;

public class ProtokollTest {

    private String protokoll = "";

    public void add(String text) {
        protokoll += text + "\n";
    }

    public String getProtokoll() {
        return protokoll;
    }

    public static void main(String[] args) {

        ProtokollTest p = new ProtokollTest();
        p.add("fdkhkfhfdksf");
        p.add("lhgkjgöhkfghö");
        p.add("aSFHSAFFAS");
        p.add("fotzriuopzti");
        p.add("sdahdsa dsjdsgdksj dfkjh");

        //System.out.println(p.protokoll);
        System.out.println(p.getProtokoll());
    }
}
