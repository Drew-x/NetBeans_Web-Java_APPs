/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
 * Point3D_Class Creates a Point3D Object given 5 Integers X,Y,Z as coordinates. 
 */
public class Point3D_Class {

    private int x;
    private int y;
    private int z;

    /**
     * Creates a Constructor for Point3D_Class when passed 3 integer parameters.
     *
     * @param x x coordinate.
     * @param y x coordinate.
     * @param z x coordinate.
     */
    public Point3D_Class(int x, int y, int z) {

        this.x = x;
        this.y = y;
        this.z = z;

    }// end constructor 

    /**
     * A getter method that returns the x coordinate value
     *
     * @return x coordinate
     */
    public int getX() {
        return x;
    }// end geterX

    /**
     * A getter method that returns the y coordinate value
     *
     * @return y coordinate
     */
    public int getY() {
        return y;
    }// end geterY

    /**
     * A getter method that returns the z coordinate value
     *
     * @return z coordinate
     */
    public int getZ() {
        return z;
    }// end geterZ

    /**
     * A toString method that returns a String representation of the
     * Point3D_Class Object
     *
     * @return representation of the Point3D_Class Object
     */
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }// end tostring

}// end class
