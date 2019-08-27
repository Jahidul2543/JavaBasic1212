package arraydemo;

import basicjava.Calculator;

public class ArrayDemo {

    private int x = 2;

   // getter, it will help to get the private variables value
    public int getX() {

        return x;
    }

   // Whenever you have a return type, do you think you need to have same parameter?

    public int setX(int x) {
        this.x = x;

        return  x;
    }


    public ArrayDemo arrayDemo(int y ){
        // This is local variable

        System.out.println("Print value of y: " + y);

        return new ArrayDemo();

    }

    public Calculator getArray(){

        return new Calculator();
    }

    public static void main(String[] args) {

        Calculator objCalcualtor = new Calculator();
        objCalcualtor.add();

        ArrayDemo objArray = new ArrayDemo();
        objArray.arrayDemo(3).getArray().createArray();

        // By an object we can call fields and methods of a class?


    }
}
/*
* Return Type: Return me a variable or reference variable or object of that type
* 8 Primitive Data Type >> int, char, long, double float, short, byte, boolean
*             Object Type >>
*
* */

/**
 *                   *
 *                  * *
 *                 * * *
 *                * * * *
 *               * * * * *
 *              * * * * * *
 *             * * * * * * *
 *            * * * * * * * *
 *           * * * * * * * * *
 *          * * * * * * * * * * */