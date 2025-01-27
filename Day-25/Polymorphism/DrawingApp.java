package Polymorphism ;
class Shape {
    public void draw() {
        System.out.println("Drawing a generic shape.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square.");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}

public class DrawingApp {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        shape.draw();

        shape = new Square();
        shape.draw();

        shape = new Triangle();
        shape.draw();
    }
}
