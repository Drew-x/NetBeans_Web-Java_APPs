

 /*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
 */
package point3d_project5;

import java.awt.geom.Area;
import java.math.*;

/**
 *
 * @author I-KingDrew-I
 */
/**
 * Sphere_Sub_Class Creates a Sphere Object given 5 Integers X,Y,Z as
 * coordinates, and radius. Implements Shape3D_AbsClass too pass the coordinates
 * to the super Class.
 *
 */
public class Sphere_Sub_Class extends Shape3D_AbsClass {

    int radius;

    /**
     * Creates a Constructor for Sphere_Sub_Class Class when passed six integer
     * parameters.
     *
     * @param x x coordinate.
     * @param y x coordinate.
     * @param z x coordinate.
     * @param radius radius.
     */
    public Sphere_Sub_Class(int x, int y, int z, int radius) {
        super(x, y, z);
        this.radius = radius;
    }// end constructor

    /**
     * A surfaceArea method Implemented method from Shape3D that returns the
     * surface area of the Sphere.
     *
     * @return surface area of the Sphere
     */
    @Override
    public double surfaceArea() {

        double pi = (double) Math.PI;
        double rad = (double) Math.pow(radius, 2);
        double area = 4 * pi * rad;

        return area;
    }// end surfaceArea

    /**
     * A volume method Implemented method from Shape3D that returns the volume
     * of the Sphere.
     *
     * @return volume of the Sphere
     */
    @Override
    public double volume() {

        double pi = (double) Math.PI;
        double rad = (double) Math.pow(radius, 3);
      
     
        double vol =  (4.0 / 3.0) * pi * rad;

        return vol;
    }// end volume

    /**
     * A toString method that returns a String representation of the
     * Sphere_Sub_Class Object
     *
     * @return representation of the Sphere_Sub_Class Object
     */
    @Override
    public String toString() {

        return "Class name: " + getClass().getSimpleName() + ", Center at: " + super.toString() + ", Radius: " + this.radius + ", Surface Area: " + surfaceArea();
    }// end toString

}// end class
