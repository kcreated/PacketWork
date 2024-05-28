package CUBE;

public class CubeRunner {
    public static void main(String[] args) {
        Cube ricky = new Cube(3.0);

        double vol = ricky.volume();
        System.out.println("The volume is " + vol + " cu. units.");

        double SA = ricky.surfaceArea();
        System.out.println("The surface area is " + SA + " sq. units.");

        ricky.setSideForVolume(125);
        double side = ricky.getSide();
        System.out.println("The side is now " + side + " units.");

        double newSA = ricky.surfaceArea();
        System.out.println("The surface area is " + newSA + " sq. units.");
    }
}