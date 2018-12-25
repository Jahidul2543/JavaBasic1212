package inheritance;

public class NokiaAndroidPhone extends NokiaSymbianPhone{
    /*
    *
    * By inheriting a class inherits all the properties/members of Super class
    *
    *
    * */

    public void createAndroidApp(){

        System.out.println("Android app In NokiaAndroidPhone class");
    }
    public void developTouchScreen(){

        System.out.println(" Touch Screen");
    }

    public static void main(String[] args) {

        NokiaAndroidPhone obj = new NokiaAndroidPhone();
        obj.developDisplay();

    }

}


