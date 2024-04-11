package basic;

public class OverLoadingTest {

    public static void main(String[] args) {

        OverLoadingTest ot = new OverLoadingTest();
        ot.doSomething();

    }

    // Instanzmethode - nur über ein Objekt nutzbar
    public void doSomething(){
        System.out.println("doSomething");
    }

    public void doSomething(int x){
        System.out.println("doSomething");
    }
}
