package CIRCLE;

public class CircleRunner {
    public static void main(String[]args){

        Circle circcy = new Circle(3.0);
        
        double radius = circcy.getC();
        System.out.println(radius);

        double area = circcy.getArea();
        System.out.println(area);

        Circle circcys = new Circle(1.0);

        double newarea = circcys.getArea();
        System.out.println(newarea);
    }
}
