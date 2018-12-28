package exception.error;

public class ExceptionDemo {

    public static void main(String[] args) {

      final  int X = 2;

        int y = 0;
           y = 2;

       // int div = x / y;

        try{
            // This code block may have some exception
            int div = X / y;
            System.out.println(div);
        }
        catch(ArithmeticException e){

            // this code block is responsible to catch/handle this exception
            e.printStackTrace();
            System.out.println("Any number can not be divided by zero");
        }

        // At all time finally code block will be executed
        finally {

            System.out.println("I am out of try and catch block");
        }
        
    }
}
