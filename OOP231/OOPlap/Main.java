public class Main { 
    public static void main(String[] args) { 
        Circle circle = new Circle(5); 
        Cube cube = new Cube(5); 
        Sphere sphere = new Sphere(5); 
        Square square = new Square(5); 
        System.out.println(circle.convertToString() + " " + circle.calculateArea()); 
        System.out.println(cube.convertToString() + " " + cube.calculateVolume()); 
        System.out.println(sphere.convertToString() + " " + sphere.calculateVolume()); 
        System.out.println(square.convertToString() + " " + square.calculateArea()); 
    } 
} 
    