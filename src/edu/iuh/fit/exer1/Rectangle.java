package edu.iuh.fit.exer1;

public class Rectangle {
    private double length;
    private double width;
    public Rectangle() {
        this(0.0,0.0);
        this.length = 0.0;
        this.width = 0.0;
        //    length = 0.0;
        //    width = 0.0;
    }

    /**
     *
     * @param length The length of the rectangle
     * @param width The width of the rectangle
     * @throws IllegalAccessException if length less than 0 or width less than 0
     */
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0)
            throw new IllegalArgumentException("Length and width must be greater than 0 ");
        this.length = length;
        this.width = width;
    }
    public double getPerimeter(){
        return(length + width)*2;
    }
    public double getArea(){
        return length*width;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <0)
            throw new IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    /**
     * Set the length of the rectangle
     * @param length The length of rectangle
     * @throws IllegalArgumentException if length less than 0
     */

    public void setLength(double length) {
        if (length<0)
            throw new IllegalArgumentException("Length musst be greater than 0 ");
        this.length = length;
    }
    public String toString() {
        return "Rectangle [length=" + length + ", width=" + width + ",Perimeter=" + getPerimeter() + ",Area=" + getArea()+ ",Length=" + getLength() + "]";
    }

}


