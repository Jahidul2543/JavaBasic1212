package list.collections.framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

       // x is an object?
        int x =2;
        /**
         * ArrayList can not store Primitive variables
         * It can only store Objects
         *
         *
         * */
        // there is a system to make connection or read from DB
        List <String> studentNameList = new ArrayList<String>();

        studentNameList.add("Mozammel");
        studentNameList.add("Abdel");
        studentNameList.add("Salma");
        studentNameList.add("Alma");

       /**
        * This method will insert element at index 0
        * */

        studentNameList.add(1, "Jahid");

        /**
         * this will delete element 1
         * */

        studentNameList.remove(1);
        /**
         * Finding size of the array
         * */

        System.out.println("Length/size of the array: " + studentNameList.size());

        for (String name : studentNameList) {

            System.out.println(" Student Name " + name );

        }
        /**
         * Accessing the elements form ArrayList by index number
         * */

        System.out.println( "Element at index 0: " + studentNameList.get(0));
        System.out.println( "Element at index 1: " + studentNameList.get(1));

    }

}
