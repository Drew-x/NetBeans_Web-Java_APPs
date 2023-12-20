
/*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
*/
package point3d_project5;

/**
 *
 * @author I-KingDrew-I
 */
/**
 * Cylinder_Sub_Class Creates a Cylinder Object given 5 Integers X,Y,Z as
 * coordinates, radius, and height. Implements Shape3D_AbsClass too pass the
 * coordinates to the super Class.
 *
 */
public class Cylinder_Sub_Class extends Shape3D_AbsClass {

    int height;
    int radius;

    /**
     * Creates a Constructor for Cylinder_Sub_Class Class when passed six
     * integer parameters.
     *
     * @param x x coordinate.
     * @param y x coordinate.
     * @param z x coordinate.
     * @param radius radius.
     * @param height height.
     */
    public Cylinder_Sub_Class(int x, int y, int z, int radius, int height) {
        super(x, y, z);
        this.height = height;
        this.radius = radius;

    }// end Constructor

    /**
     * A surfaceArea method Implemented method from Shape3D that returns the
     * surface area of the Cylinder.
     *
     * @return surface area of the Cylinder
     */
    @Override
    public double surfaceArea() {
        double pi = (double) Math.PI;
        double rad = (double) Math.pow(radius, 2);
        double area = (2 * pi * rad) + (2 * pi * radius * height);

        return area;
    }// end surfaceArea

    /**
     * A volume method Implemented method from Shape3D that returns the volume
     * of the Cylinder.
     *
     * @return surface area of the Cylinder
     */
    @Override
    public double volume() {

        double pi = (double) Math.PI;
        double rad = (double) Math.pow(radius, 2);
        double vol = pi * rad * height;

        return vol;
    }// end volume

    /**
     * A toString method that returns a String representation of the
     * Cylinder_Sub_Class Object
     *
     * @return representation of the Cylinder_Sub_Class Object
     */
    @Override
    public String toString() {
        return "Class name: " + getClass().getSimpleName() + ", Center at: " + super.toString() + ", Height:" + this.height + ", Radius: "
                + this.radius + ", Surface Area: " + surfaceArea() ;
    }// end toString

}// end class
