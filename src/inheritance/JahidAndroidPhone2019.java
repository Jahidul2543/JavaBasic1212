package inheritance;

public class JahidAndroidPhone2019 extends NokiaAndroidPhone {
    /*
    * In an overridden method you can change method body but you are not allowed to change method signature(Parameters)
    * Override happen between two classes same named same signature method
    *
    *
    * */
    @Override
    public void createAndroidApp(){

        System.out.println("Implements New App");

    }
   /*
   * Method Over loading happens in same class with same method having different signature
   *
   * */

    public void developAiApp(){

       System.out.println("Develope AI App");

   }

    public void developAiApp(String advancedAiApp){

        System.out.println("Develope advanced Ai App");

    }


    public static void main(String[] args) {

        JahidAndroidPhone2019 obj = new JahidAndroidPhone2019();

        obj.createAndroidApp();
        obj.developDisplay();
        obj.makeCall();

    }
}
