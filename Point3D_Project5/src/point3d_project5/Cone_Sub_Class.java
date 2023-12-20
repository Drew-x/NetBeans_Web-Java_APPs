
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
 * Cone_Sub_Class Creates a Cone Object given 5 Integers X,Y,Z as coordinates,
 * radius, and height. Implements Shape3D_AbsClass too pass the coordinates to
 * the super Class.
 *
 */
public class Cone_Sub_Class extends Shape3D_AbsClass {

    int radius;
    int height;

    /**
     * Creates a Constructor for Cone_Sub Class when passed six integer
     * parameters.
     *
     * @param x x coordinate.
     * @param y x coordinate.
     * @param z x coordinate.
     * @param radius radius.
     * @param height height.
     */
    public Cone_Sub_Class(int x, int y, int z, int radius, int height) {
        super(x, y, z);
        this.radius = radius;
        this.height = height;

    }// end Constructor

    /**
     * A surfaceArea method Implemented method from Shape3D that returns the
     * surface area of the cone.
     *
     * @return surface area of the cone
     */
    @Override
    public double surfaceArea() {
        double pi = (double) Math.PI;
        double rad = (double) Math.pow(radius, 2);
        double had = (double) Math.pow(height, 2);

        double area = (double) (pi * radius * (radius + Math.sqrt((rad + had))));

        return area;
    }// end surfaceArea

    /**
     * A volume method Implemented method from Shape3D that returns the volume
     * of the cone.
     *
     * @return volume of the cone
     */
    @Override
    public double volume() {
        double pi = (double) Math.PI;
        double rad = (double) Math.pow(radius, 2);

        double vol = (pi * rad * height) / 3;
        return vol;
    }// end volume

    /**
     * A toString method that returns a String representation of the
     * Cone_Sub_Class Object
     *
     * @return representation of the Cone_Sub_Class Object
     */
    @Override
    public String toString() {
        return "Class name: " + getClass().getSimpleName() + ", Center at: " + super.toString() + ", Height:" + this.height + ", Radius: "
                + this.radius + ", Surface Area: " + surfaceArea();
    }// end toString

}// end class
