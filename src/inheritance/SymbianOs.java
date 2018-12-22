package inheritance;

public abstract class SymbianOs implements Mobile{
/*
* A class having at least one unimplemented method is called abstract class
*
*
*
* */

    public void makeCall() {
        System.out.println("This will make call In SymbianOs class");
    }


    public void sendText() {
        System.out.println("This will make call");

    }
    public abstract void removeAntena();
    public abstract void developDisplay();
}
