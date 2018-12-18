package basicjava;

public class VaraibleScoping2 {
    public static void main(String[] args) {

        VariablesScoping obj = new VariablesScoping();
        String myFirstName = obj.firstName;
        System.out.println(" myFirstName stores a Non Static field of VariableScoping.java class:  "+ myFirstName);

        String myLastName = VariablesScoping.lastName;
        System.out.println("myLastName stores a static field of VariableScoping.java class: " + myLastName);

    }
}
