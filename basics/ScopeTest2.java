package basics;

public class ScopeTest2 {

    public static void main(String[] args) {

        //int[] arr = new int[10_000_000];
        System.out.println(getValue());

        int val;
        {
            int[] arr = new int[10_000_000];
            val = arr[10_000];
        }

        System.out.println(val);

        //

        byte a = 10; // 00001010
        byte b = 25; // 00011001
                     // 00001000
        System.out.println(a & b);

        // System.out.println(a && b); // && funktioniert nur mit boolean

        /*
        if(10 + 15 > 10 & 25 - 17 < 8) {
        }

        if(10 + 15 > 10 && 25 - 17 < 8) {
        }
        */


    }

    private static int getValue() {
        int[] arr = new int[10_000_000];
        return arr[10_000];
    }
}
