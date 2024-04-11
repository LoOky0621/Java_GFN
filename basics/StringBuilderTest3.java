package basics;

public class StringBuilderTest3 {

    public static void main(String[] args) {

        char[] chars = {'1','2','3', '4', '5', '6', '7', '8', '9'};
        String str = "123456789";

        StringBuilder sb = new StringBuilder(); // capacity: 16
        sb.append(str, 3, 5); // endindex ist immer exclusiv
        System.out.println(sb);

        sb = new StringBuilder(); // capacity: 16
        sb.append(chars, 3, 5); // 5 ist die Anzahl der Zeichen
        System.out.println(sb);

        Object o = new Object();
        o.equals(null);

        String s = "Moin";
        s.equals("Xyz");


    }

}
