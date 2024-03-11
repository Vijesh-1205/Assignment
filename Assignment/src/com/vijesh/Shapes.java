package com.vijesh;

class Shape {
    public double perimeter() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double perimeter() {
        return 2 * (length + breadth);
    }
}

class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}

public class Shapes {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 7);
        Triangle triangle = new Triangle(2.5, 6, 2.5);

  
        System.out.println("Perimeter of Circle: " + circle.perimeter());
        System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
        System.out.println("Perimeter of Triangle: " + triangle.perimeter());
    }
}
