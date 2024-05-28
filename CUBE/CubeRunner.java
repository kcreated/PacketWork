package CUBE;

public class CubeRunner {
    public static void main(String[]args){
        Cube ricky = new Cube(3.0);
        double vol = ricky.volume();
        System.out.println("The area is " + vol);
        double SA = ricky.surfaceArea();
        System.out.println("The perimeter is " + SA);
        double side = ricky.getSide();
        System.out.println("The perimeter is " + side);
        double SFV = ricky.setSideForVolume();
        System.out.println("The perimeter is " + SFV);
    
}
