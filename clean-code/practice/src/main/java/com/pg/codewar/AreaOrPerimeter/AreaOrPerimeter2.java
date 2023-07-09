package com.pg.codewar.AreaOrPerimeter;

public class AreaOrPerimeter2 {

    public static int areaOrPerimeter (int l, int w) {
        PolygonFactory factory = new PolygonFactory();
        Polygon polygon = factory.polygonFrom(w, l);
        return polygon.measure();
    }
}

class PolygonFactory {
    
    Polygon polygonFrom(int w, int l) {
        return w == l ? new Square(w, l) : new Rectangle(w, l);
    }

}

interface Polygon {

    int measure();
}

class Rectangle implements Polygon {
    private final int l;
    private final int w;
    
    Rectangle(int l, int w) {
        this.l = l;
        this.w = w;
    }
    
    public int measure() {
        return 2 * (l + w);
    }

}

class Square implements Polygon {
    private final int l;
    private final int w;
    
    Square(int l, int w) {
        this.l = l;
        this.w = w;
    }
    
    public int measure() {
        return w * w;
    }

}
