package edu.iuh.fit.exer1;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0,3.0);
        r1.setWidth(3);
        System.out.println("Width: " + r1.getWidth());
        r1.setLength(3);
        System.out.println("Length: " + r1.getLength());
        r1.getLength();
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
        r1.getLength();
        System.out.println("The length of the rectangle is: " + r1.getLength());
        r1.getWidth();
        System.out.println("The width of the rectangle is: " + r1.getWidth());
        System.out.println(r1.toString());
    }
}
