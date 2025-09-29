package week05.zachary.id.ac.umn;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;

        do {
            System.out.println("-------Program Menghitung Bangun Ruang-------");
            System.out.println("1. Lingkaran");
            System.out.println("2. Persegi");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("5. Keluar");
            System.out.print("Pilihan : ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("---------Lingkaran---------");
                    System.out.print("Masukkan jari-jari : ");
                    double radius = s.nextDouble();
                    System.out.print("Warna : ");
                    String circleColor = s.next();

                    Circle circle = new Circle(radius, circleColor);
                    System.out.println("Jari-jari : " + circle.getRadius());
                    System.out.println("Keliling Lingkaran : " + circle.getPerimeter());
                    System.out.println("Luas Lingkaran : " + circle.getArea());
                    break;

                case 2:
                    System.out.println("-----------Persegi-----------");
                    System.out.print("Masukkan panjang sisi : ");
                    double side = s.nextDouble();
                    System.out.print("Warna : ");
                    String squareColor = s.next();

                    Square square = new Square(side, squareColor);
                    System.out.println("Panjang Sisi : " + square.getSide());
                    System.out.println("Keliling Persegi : " + square.getPerimeter());
                    System.out.println("Luas Persegi : " + square.getArea());
                    break;

                case 3:
                    System.out.println("--------Persegi Panjang--------");
                    System.out.print("Masukkan panjang : ");
                    double length = s.nextDouble();
                    System.out.print("Masukkan lebar : ");
                    double width = s.nextDouble();
                    System.out.print("Warna : ");
                    String rectColor = s.next();

                    Rectangle rectangle = new Rectangle(length, width, rectColor);
                    System.out.println("Panjang & Lebar : " + rectangle.getLength() + " & " + rectangle.getWidth());
                    System.out.println("Keliling Persegi Panjang : " + rectangle.getPerimeter());
                    System.out.println("Luas Persegi Panjang : " + rectangle.getArea());
                    break;

                case 4:
                    System.out.println("-------Segitiga Siku-Siku-------");
                    System.out.print("Masukkan alas : ");
                    double base = s.nextDouble();
                    System.out.print("Masukkan tinggi : ");
                    double height = s.nextDouble();
                    System.out.print("Warna : ");
                    String triColor = s.next();

                    Triangle triangle = new Triangle(base, height, triColor);
                    System.out.println("Alas & Tinggi : " + triangle.getBase() + " & " + triangle.getHeight());
                    System.out.println("Keliling Segitiga : " + triangle.getPerimeter());
                    System.out.println("Luas Segitiga : " + triangle.getArea());
                    break;

                case 5:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Input tidak valid");
                    break;
            }
            System.out.println();
        } while (choice != 5);

        s.close();
    }
}

class ShapeAssignment {
    private String color;

    public ShapeAssignment() {}
    public ShapeAssignment(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }
}

class CircleAssignment extends ShapeAssignment {
    private double radius;

    public CircleAssignment() {}
    public CircleAssignment(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }
}

class Square extends ShapeAssignment {
    private double side;

    public Square() {}
    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }
}

class Rectangle extends ShapeAssignment {
    private double length;
    private double width;

    public Rectangle() {}
    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Triangle extends ShapeAssignment {
    private double base;
    private double height;

    public Triangle() {}
    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public double getPerimeter() {

        double hypotenuse = Math.sqrt((base * base) + (height * height));
        return base + height + hypotenuse;
    }
}