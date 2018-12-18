package basicjava;

import arraydemo.ArrayDemo;

public class PrimitiveDataTypeDemo {


    public static void main(String[] args) {
        // 8 Primitive data type
        int x = 4;
        char grade = 'A';
        boolean lightStatusIsOn = true; // true or false
       //
        String yourName = "Jahid";
        String name = "Jahid12";

        //Concatenation>> add

        String firstName = "Jahidul";
        String lastName = "Islam";

        String myName = firstName + " " +lastName;

        System.out.println("My Name: " + "Jahidul" + " Islam");


        System.out.println("My Name: " + myName);

        Calculator myCasioCalculator = new Calculator();
        myCasioCalculator.sub();

        ArrayDemo objArrayDemo = new ArrayDemo();
        // a private variable value can be accessed by getter
       int y = objArrayDemo.getX();
       // a private variable value can be assigned by setter
       int z = objArrayDemo.setX(4);
        System.out.println(y); // 2,
        System.out.println(z);


    }


}
