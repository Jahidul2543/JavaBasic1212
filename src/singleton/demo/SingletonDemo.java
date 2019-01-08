package singleton.demo;

public class SingletonDemo {

    private static SingletonDemo obj = new SingletonDemo() ;

     /**
      * By creating private constructor Singleton class restricts other classes to create object of this class
      * This is basic property of Singleton class
      *
      * */
    private SingletonDemo( ){

        System.out.println("I am private Constructor of SingletonDemo class");
    }

    public static SingletonDemo getObj() {
        return obj;
    }

}
