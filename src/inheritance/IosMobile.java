package inheritance;

public class IosMobile implements Mobile , OldIoSThought{
    /*
    * Java class can implements multiple interfaces
    * But cant extend or inherits multiple classes
    *
    * */

    public void developIos(){

    }
    public void makeCall() {
        System.out.println("Make call");
    }


    public void sendText() {
        System.out.println("Send text");
    }

}
