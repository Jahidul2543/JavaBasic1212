package controlflow;

public class IfElseDemo {

    public static void main(String[] args) {

       /* if(This is a condition it has to be true inorder to execute the code block){
            // Code block
        } */
       int x = 2;
       boolean myHealthIsGood;

       if(myHealthIsGood=true){

           System.out.println("I will play");

          }
       else if (myHealthIsGood=false) {
           System.out.println("I will go for rest");
       }
       else {
           System.out.println("I will go for doctor");
       }



        System.out.println("Out of if block");
    }
}
