package basicjava;//basicjava.Calculator Type class

import arraydemo.ArrayDemo;

// When no access modifier is explicitly defined it is considered as default
public class Calculator {


    //It is called Constructor
    public Calculator(){
        System.out.println("I am inside the constructor");
    }
    public Calculator(int x){

        System.out.println("I am in 2nd constructor " + x);
        int y = x +2;
        int a = (2);
        System.out.println("Value of 'a': " + a);

    }

    public void methodName(){
        //Method Body
        //integer type of variable
        int x = 2;
        int y = 4;
        int sum = x + y;


    }

    public  void add(){

        int x =2;
        int y = 2;
        int sum = x + y ;

        // this method will add values
        System.out.println("this method will add values: sum= " + sum);
    }

    public  void sub(){
        // this method will substract values
        System.out.println("this method will substract values");
    }

    public void divide(){

        String message = "this method will divide the value";
        // this method will divide the value
        System.out.println(message);
    }

    public void multiply(){
        // this method will multiply the values
        System.out.println("this method will multiply the values");
    }

    public ArrayDemo createArray(){
        System.out.println("I am in Calculator Class");
        return new ArrayDemo();
    }

    // This is called main method
    // This is the entry point to an application
    // to run main method no need help of an object
    public static void main(String[] args) {

        System.out.println("I am in main method");

        // We are creating basicjava.Calculator type object
        // basicjava.Calculator() this is the constructor of basicjava.Calculator
        //Constructor will have same name as class name with (), by saying new you are invoking constructor

        // How to create an object?
        // ClassName objectName = new ClassName();
        Calculator myCalculator = new Calculator();
        myCalculator.add();
        myCalculator.sub();
        myCalculator.divide();
        myCalculator.multiply();

        Calculator calulatorObject = new Calculator(3);
        calulatorObject.sub();



        /*
        *
        * It is called comment . It is not considered as part of application code
        *
        * */


    }

}

/*
* Naming Convention
* Class name: Class Name must start with Capital letter. ScientificCalculator >> this is called camel casing
* Method name: start with small letter and if two or more word use camel casing. >> addByMyScientificCalculator
* variables: same as method name
* Object Name: same as method name
* package name: all small letter
*
* */