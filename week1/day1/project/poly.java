package week1.day1.project;

abstract class Shape {
    abstract void area();

    abstract void perimeter();
}
class Circle extends Shape {
    float r = 6;
    @Override
    void area() {
        double area = (3.14) * (Math.pow(r, 2));
        System.out.println(area);
    }
    @Override
    void perimeter() {
        double perimeter = 2 * 3.14 * r;
        System.out.println(perimeter);
    }
}

class Rectangle extends Shape {
    float l = 6;
    float b = 6;
    
    @Override
    void area() {
        double area = l * b;
        System.out.println(area);

    }

    @Override
    void perimeter() {
        double perimeter = 2 * (l + b);
        System.out.println(perimeter);
    }
}

class Triangle extends Shape {
    float h = 6;
    float b = 6;
    float x= 4;
    float y= 5;
    float z= 3;
    
    @Override
    void area() {
        double area = (0.5)* h*b;
        System.out.println(area);

    }
    
    @Override
    void perimeter() {
      double perimeter = x+y+z;
      System.out.println(perimeter);

    }
}

public class poly {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        circle.perimeter();
        circle.area();
        rectangle.area();
        rectangle.perimeter();
        triangle.area();
        triangle.perimeter();

    }
}