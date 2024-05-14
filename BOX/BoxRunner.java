package BOX;

public class BoxRunner{
    public static void main(String[]args){

        Box bobby = new Box(2.0,6.0);
        double area = bobby.getArea();
        System.out.println("The area is " + area);
        bobby.bigger(2.0);
        double perimeter = bobby.getPerimeter();
        System.out.println("The perimeter is " + perimeter);
        
    }
}