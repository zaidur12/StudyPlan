class Shape {
    void area() {
        System.out.println("area");
    }

    void perimeter() {
        System.out.println("perimeter");
    }
}

class Circle extends Shape {
    float r = 6;

    void area() {
        double area = (3.14) * (Math.pow(r, 2));
        System.out.println(area);
    }

    void perimeter() {
        double perimeter = 2 * 3.14 * r;
        System.out.println(perimeter);
    }
}

class Rectangle extends Shape {
    float l = 6;
    float b = 6;

    void area() {
        double area = l * b;
        System.out.println(area);

    }

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

    void area() {
        double area = (0.5)* h*b;
        System.out.println(area);

    }

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