package basics;

public class ImmutableTest {

    public static void main(String[] args) { // args übernimmt Kommandozeilen Parameter

        Box b1 = new Box("Das ist der Content");
        System.out.println(b1.getContent());

    }


}

// Immutable Box
class Box {

    private final String content;

    public Box(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
