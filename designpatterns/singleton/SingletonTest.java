package designpatterns.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        // Singleton = Es gibt das Objekt nur 1 mal!!!!

        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es3 = EagerSingleton.getInstance();

        es1.setI(10);
        es3.setI(25);
        System.out.println(es1.getI());

        EagerSingleton.getInstance().setI(100);
        System.out.println(es1.getI());

        LazySingleton ls1 = LazySingleton.getInstance();

    }

    public static void doSomething() {
        EagerSingleton es2 = EagerSingleton.getInstance();
        System.out.println(es2.getI());
    }

}

// Eager Singleton
class EagerSingleton {

    // Klasse enthält eine Referenz auf ein Objekt
    private static final EagerSingleton instance = new EagerSingleton();

    private int i;

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}




// Lazy Singleton
class LazySingleton {

    // Klasse enthält eine Referenz auf ein Objekt
    private static LazySingleton instance;

    private int i;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(instance == null) {
            // TODO: Threadsicherheit muss noch beachtet werden
            instance = new LazySingleton();
        }
        return instance;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}
