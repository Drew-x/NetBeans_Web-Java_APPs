/*
Section number: Cop3337 U11
Student ID: 5852258
I affirm that this program is enterely my own work and none of it is the work of any
other person. ______Andrew Bedon___________________________________________
*/
package point3d_project5;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author I-KingDrew-I
 */

/*
   File: Point3D_Project5.java (HardCoded input version)
   
    A Point3D_Project5 Class Creates one object of each concrete class. Then using the data given below - and store them in an array of Shapes.
    1)Using a loop it traverse the array and prints the actual class of the shape (Sphere, Cone, etc), all the input data, and the surface area/
    2) Sort the array in descending order by volume. Using the sort method of the Arrays class.
    3) Using a loop, prints ONLY the class name and volume for each object in the sorted array
    4)Sorts the array again, but this time in ascending order by the distance from the origin.  
      via a call to a sort method of the Arrays class- create a inner class that implements java’s Comparator interface
    5)Using a loop, print ONLY the class name and distance from the origin for each object in the sorted array.

 */
/**
 * A Point3D_Project5 class Containing Main Method.
 */
public class Point3D_Project5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // inner class implements Comparator for shape3D_Comparator class
        class shape3D_Comparator implements Comparator {

            /**
             * Overridden compareTo method orders Comparator objects by their
             * distance to the origin.
             *
             * @param object1 first explicit parameter to which the implicit
             * parameter is being compared.
             *
             * @param object2 explicit parameter to which the implicit parameter
             * is being compared.
             *
             * @return -1 if implicit param < explicit
             *          0 if implicit param == explicit
             *          1 if implicit param > explicit
             */
            @Override
            public int compare(Object object1, Object object2) {

                Shape3D_AbsClass shape1 = (Shape3D_AbsClass) object1;

                double distanceFromOrigin = shape1.concrete();

                Shape3D_AbsClass shape2 = (Shape3D_AbsClass) object2;
                double distanceFromOrigin2 = shape2.concrete();

                if (distanceFromOrigin < distanceFromOrigin2) {

                    return -1;
                } else if (distanceFromOrigin > distanceFromOrigin2) {

                    return 1;
                } else {

                    return 0;
                }

            }// end of Comparator

        } // end inner class

        
        Shape3D_AbsClass[] shapesList = new Shape3D_AbsClass[4];

        Sphere_Sub_Class sphere = new Sphere_Sub_Class(2, 5, 8, 14);

        Cone_Sub_Class cone = new Cone_Sub_Class(-5, 4, -1, 11, 15);

        Cylinder_Sub_Class cyclinder = new Cylinder_Sub_Class(-3, -7, 5, 14, 12);

        Parallelepiped_Sub_Class parallelpiped = new Parallelepiped_Sub_Class(7, 16, 9, 19, 9, 13);

        shapesList[0] = sphere;
        shapesList[1] = cone;
        shapesList[2] = cyclinder;
        shapesList[3] = parallelpiped;

        System.out.println("Printing unsorted shapes array.\n");
        for (Shape3D_AbsClass items : shapesList) {

            System.out.println(items);

        }// end for loop

        Arrays.sort(shapesList); // sort by volume

        System.out.println("\n\nPrinting array sorted by volume.");

        for (int i = 0; i < shapesList.length; i++) {

            System.out.println("\n" + shapesList[i].getClass().getSimpleName() + "\n Volume: " + shapesList[i].volume());

        }// end for loop

        shape3D_Comparator sComparator = new shape3D_Comparator();
        Arrays.sort(shapesList, sComparator);// sort by distance

        System.out.println("\n\nPrinting array sorted by distance from the origin.");

        for (int i = 0; i < shapesList.length; i++) {

            System.out.println("\n" + shapesList[i].getClass().getSimpleName() + "\n Distance from the origin: " + shapesList[i].concrete());

        }// end for loop

    }

}// end class
