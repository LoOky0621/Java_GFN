package vererbung.sample.verhiclemanagement;

import java.util.ArrayList;
import java.util.List;

public class Standort {

    private List<Buchbar> elements = new ArrayList<>();

    void buchen(Buchbar element) {
        if(element.buchen())
            elements.add(element);
    }

    void zurueckgeben(Buchbar element) {
        if(elements.contains(element)) {
            if (element.zurueckgeben())
                elements.remove(element);
        }
    }

    void printElements() {
        for (Buchbar b : elements) {
            System.out.println(b);
        }
    }
}
