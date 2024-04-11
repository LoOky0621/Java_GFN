package basics;

public class StaticTest2 {

    public static Object o1 = new Object();
    public Object o2 = new Object();

    public static void main(String[] args) {

        StaticTest2 st1 = new StaticTest2();
        StaticTest2 st2 = new StaticTest2();
        st2 = null;

        st1.machWas();

    }

    public void machWas() {
        System.out.println(o1); // Klassenvariable
        System.out.println(o2); // Instanzvariable
    }

    public static void machWasStatic() {
        System.out.println(o1); // Klassenvariable
        // System.out.println(o2); // Instanzvariable - hier nicht sichtbar!
    }

}
