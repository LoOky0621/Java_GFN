package uebung1;

public class Protokoll {

    private String text = "";

    public String getText() {
        return text;
    }

    public void add(String text) {
        this.text += text + "\n";
    }
}
