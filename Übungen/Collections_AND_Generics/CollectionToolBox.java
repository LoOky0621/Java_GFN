package Collections_AND_Generics;

import java.util.ArrayList;
import java.util.List;

class CollectionToolBox<T> {
    private List<T> elements;

    public CollectionToolBox() {
        this.elements = new ArrayList<>();
    }

    public void addItem(T item) {
        elements.add(item);
    }

    public List<T> getItems() {
        return elements;
    }
}
