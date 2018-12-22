package controlflow;

public class WhileDemo {

    public static void main(String[] args) {
       /*int price = 100;

        while (price>50){

            System.out.println("Price = " + price);
            break;
        }*/

       /*
       * Increment operator will increase value before(pre) or after(post) operation by 1
       *
       *
       * */

        int count = 1;

        while (count< 5){

            //System.out.println("Number of loop: " + count);

            // What is the value of count in this line.;
            // this is sum count = 1          +  3          +  3
                           count = count++    +    ++count + count++; //7
            System.out.println("After increment: first" + count);

            count = count++ ;

            // What is the value of count in this line.;
            System.out.println("After increment:last " + count); //

            break;

        }
/*        int count2 = 1;

        while (count2< 5){

            System.out.println("Number of loop: " + count2);
            // what is the value of count in this line. count =1;
            ++count2;
            //// what is the value of count in this line. count =2;
            int value = count2 +1;
            System.out.println("After post increment: " + count2 + "value: " + value);
            break;

        }*/
    }
}
