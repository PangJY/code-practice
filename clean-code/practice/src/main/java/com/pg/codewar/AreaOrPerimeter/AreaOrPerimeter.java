package com.pg.codewar.AreaOrPerimeter;

public class AreaOrPerimeter {
    public static int areaOrPerimeter (int l, int w) {
       assert (l != 0 && w !=0); // assert l/w not equad 0, as the line of suqare or perimeter should not be 0.
       return calculateAreaOrPerimeter(l, w);
    }
    public static int calculateAreaOrPerimeter(int length, int width) {
        if (length == width) {
            return calculateSquareArea(length);
        } else {
            return calculateRectanglePerimeter(length, width);
        }
    }
    
    private static int calculateSquareArea(int side) {
        return side * side;
    }
    
    private static int calculateRectanglePerimeter(int length, int width) {
        return 2 * (length + width);
    }
}
