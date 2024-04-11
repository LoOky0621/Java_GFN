package designpatterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeTest {

    public static void main(String[] args) {

        Circle c = new Circle(10, 10, 100);
        // c = new Rect(15, 22, 100, 200);
        c.print();

        GeoForm gf = c;
        gf = new Rect(15, 22, 100, 200); // Rect IS-A GeoForm
        gf.print();

        AbstractGeoForm agf = c;
        agf = new Rect(15, 22, 100, 200); // Rect IS-A AbstractGeoForm
        agf.print();

        System.out.println();

        c.moveTo(200, 200);
        c.print();

        gf.moveTo(-100, -200);
        gf.print();


        GeoFormGroup group = new GeoFormGroup(c, gf);
        group.add(new Rect(10, 27, 20, 40));
        group.add(new Rect(10, 25, 20, 40));
        group.add(new Rect(10, 30, 20, 40));
        group.add(new Circle(0, 0, 100));
        group.add(new Circle(-10, -10, 50));
        group.add(new Circle(10, 200, 20));

        System.out.println();
        group.print();

        System.out.println();
        group.moveTo(18, 18);
        group.print();

        GeoFormGroup group2 = new GeoFormGroup();
        group2.add(new Rect(10, 27, 20, 40));
        group2.add(new Rect(10, 25, 20, 40));
        group2.add(group); // GeoFormGroup IS-A GeoForm

        System.out.println();
        group2.print();
    }
}

// Interfaces enthalten nur abstrakte Methoden
interface GeoForm {

    // automatisch public static final
    int WERT = 10;

    // Methoden sind automatisch public und abstract
    void print();

    void moveTo(int x, int y);
}

abstract class AbstractGeoForm implements GeoForm {

    private int x;

    private int y;

    public AbstractGeoForm(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle extends AbstractGeoForm {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void print() {
        System.out.println("Circle: x " + getX() + ", y " + getY() + ", r " + radius);
    }
}

class Rect extends AbstractGeoForm {

    private int height;
    private int width;

    public Rect(int x, int y, int height, int width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void print() {
        System.out.println("Rect: x " + getX() + ", y " + getY() + ", h " + height + ", w " + width);
    }
}

class GeoFormGroup implements GeoForm {

    private List<GeoForm> elements;

    public GeoFormGroup(GeoForm... elements) {
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    public void add(GeoForm element) {
        elements.add(element);
    }

    @Override
    public void print() {
        for (GeoForm geo: elements) {
            geo.print(); // Aufruf wird an einzelne Objekte in der List delegiert
        }
    }

    @Override
    public void moveTo(int x, int y) {
        for (GeoForm geo: elements) {
            geo.moveTo(x, y); // Aufruf wird an einzelne Objekte in der List delegiert
        }
    }
}