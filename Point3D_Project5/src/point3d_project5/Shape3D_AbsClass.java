
 /*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
 */
package point3d_project5;

import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author I-KingDrew-I
 */
/**
 * Shape3D_AbsClass a Cone Object given 3 Integers X,Y,Z as coordinates.
 * Implements Comparable too be able to compare objects that inherit
 * Shape3D_AbsClass .
 *
 */
abstract public class Shape3D_AbsClass implements Comparable {

    private Point3D_Class point3D_Class;

    /**
     * Creates a Constructor for Shape3D_AbsClass Class when passed 3 integer
     * parameters.
     *
     * @param x x coordinate.
     * @param y x coordinate.
     * @param z x coordinate.
     */
    public Shape3D_AbsClass(int x, int y, int z) {

        point3D_Class = new Point3D_Class(x, y, z);

    }// end constructor 

    /**
     * A method to calculate the distance of a shape 3D object from the center.
     *
     * @return distanceOrgin returns the distance from origin
     */
    public double concrete() {

        double distanceOrgin = (double) Math.sqrt(Math.pow(point3D_Class.getX(), 2) + Math.pow(point3D_Class.getY(), 2) + Math.pow(point3D_Class.getZ(), 2));

        return distanceOrgin;
    }// concrete

    /**
     * Abstract method that calculates the surface area of a Shape3D_AbsClass
     * object.
     *
     * @return integer value of the surface area.
     */
    abstract public double surfaceArea(); // end 

    /**
     * Abstract method that calculates the volume of a Shape3D_AbsClass object.
     *
     * @return integer value of the volume.
     */
    abstract public double volume(); // end 

    /**
     * Overridden compareTo method orders Shape3D_AbsClass objects by their
     * volume values.
     *
     * @param otherObject explicit parameter to which the implicit parameter is
     * being compared.
     * @return -1 if implicit param > explicit 0 if implicit param == explicit 1
     * if implicit param < explicit
     */
    @Override
    public int compareTo(Object object) {

        Shape3D_AbsClass otherObject = (Shape3D_AbsClass) object;
        if (this.volume() < otherObject.volume()) {

            return 1;

        } else if (this.volume() > otherObject.volume()) {

            return -1;

        } else {

            return 0;
        }

    }// end compareTo

    /**
     * A toString method that returns a String representation of the
     * Shape3D_AbsClass Object
     *
     * @return representation of the Shape3D_AbsClass Object
     */
    @Override
    public String toString() {
        return point3D_Class.toString();
    }// end toString

}// end class
