package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        List<Integer> zahlen = new ArrayList<>(List.of(2,5,7,19,22,1,18,4,33));
        zahlen.add(5);

        Iterator<Integer> itr = zahlen.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
