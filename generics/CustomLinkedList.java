package generics;

public class CustomLinkedList {

    public static void main(String[] args) {

        IntValueContainer first = new IntValueContainer(10);

        first.setNext(new IntValueContainer(20));

        first.getNext().setNext(new IntValueContainer(30));

        System.out.println(first.getValue());
        System.out.println(first.getNext().getValue());
        System.out.println(first.getNext().getNext().getValue());

    }
}

class IntValueContainer {

    private int value;

    private IntValueContainer next;

    private IntValueContainer prev;

    public IntValueContainer(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntValueContainer getNext() {
        return next;
    }

    public void setNext(IntValueContainer next) {
        this.next = next;
        next.setPrev(this);
    }

    public IntValueContainer getPrev() {
        return prev;
    }

    public void setPrev(IntValueContainer prev) {
        this.prev = prev;
    }
}
