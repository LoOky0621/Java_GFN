package basics;

import java.util.Arrays;

public class OverloadingTest2 {

    public static void main(String[] args) {
        new OverloadingTest2().start();
    }

    private void start() {

        // 1: Methode mit passendem Datentyp
        // 2: primitive Widening zum nächsthöheren Typ
        // 3: Autoboxing
        // 4: Autoboxing und komplex Widening
        // 5: VarArg
        // 6: VarArg mit primitive Widening


        // doSomething();
        doSomething(1); // 1 ist ein int-Literal: int

        byte b = 1;
        //doSomething(b); // b ist byte: byte
        doSomething(b); // primitive widening zum nächsthöheren typ

        doSomething(); // VarArg mit 0 Werte
        doSomething(1,2,3,4,5); // VarArg mit 5 Werten



    }

    /*
    private void doSomething() {
        System.out.println("LEER");
    }
    */

    /*
    private void doSomething(byte val) {
        System.out.println("byte");
    }
    */

    /*
    private void doSomething(Byte val) {
        System.out.println("Byte");
    }
    */

    /*
    private void doSomething(short val) {
        System.out.println("short");
    }
    */

    private void doSomething(Short val) {
        System.out.println("Short");
    }

    /*
    private void doSomething(int val) {
        System.out.println("int");
    }
    */

    // VarArg - Kann 0 oder n int-Werte entgegennehmen
    private void doSomething(int... val) {
        // val ist ein Array
        System.out.println("int VarArg" + Arrays.toString(val));
    }

    /*
    private void doSomething(Integer val) {
        System.out.println("Integer");
    }
    */

    /*
    private void doSomething(float val) {
        System.out.println("float");
    }
    */

    private void doSomething(Float val) {
        System.out.println("Float");
    }

    /*
    private void doSomething(double val) {
        System.out.println("double");
    }
    */

    private void doSomething(Double val) {
        System.out.println("Double");
    }

    /*
    private void doSomething(Number val) {
        System.out.println("Number");
    }
    */
}
