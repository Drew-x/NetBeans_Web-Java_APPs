
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
 * Parallelepiped_Sub_Class Creates a Parallelepiped Object given 6 Integers
 * X,Y,Z as coordinates, length, width, and height. Implements Shape3D_AbsClass
 * too pass the coordinates to the super Class.
 *
 */
public class Parallelepiped_Sub_Class extends Shape3D_AbsClass {

    int length;
    int width;
    int height;

    /**
     * Creates a Constructor for Cylinder_Sub_Class Class when passed six
     * integer parameters.
     *
     * @param x x coordinate.
     * @param y x coordinate.
     * @param z x coordinate.
     * @param length length.
     * @param width width.
     * @param height height.
     */
    public Parallelepiped_Sub_Class(int x, int y, int z, int length, int width, int height) {
        super(x, y, z);

        this.length = length;
        this.width = width;
        this.height = height;

    }// end ConStructor

    /**
     * A surfaceArea method Implemented method from Shape3D that returns the
     * surface area of the Parallelepiped.
     *
     * @return surface area of the Parallelepiped
     */
    @Override
    public double surfaceArea() {

        double mul = (width * length) + (height * length) + (height * width);
        double area = 2 * (mul);
        return area;
    }// end surfaceArea

    /**
     * A volume method Implemented method from Shape3D that returns the volume
     * of the Parallelepiped.
     *
     * @return volume of the Parallelepiped
     */
    @Override
    public double volume() {

        double vol = length * height * width;

        return vol;
    }// end volume

    /**
     * A toString method that returns a String representation of the
     * Parallelepiped_Sub_Class Object
     *
     * @return representation of the Parallelepiped_Sub_Class Object
     */
    @Override
    public String toString() {
        return "Class name: " + getClass().getSimpleName() + ", Center at: " + super.toString() + ", Length: "
                + this.length + ", Width: " + this.width + ", Height:" + this.height + ", Surface Area: " + surfaceArea() ;
    }// end toString

}// end class
