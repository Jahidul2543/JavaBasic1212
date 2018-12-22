package controlflow;

public class IncrementOperator {

    public static void main(String[] args)
    {
        int x = 1;
        // x=1 after increment x=2 >> 2+1 =3
        x = x++ + ++x + x++ + ++x + ++x; //Value sets by increment carried forward 2/3/4/5 // Value used for sum function = 1 + 3 + 3 + 5+ 6

        /*
         * 1. X++ = 1 Here increment will happen after operation that means initially X will hold value 1
         * for the next operation x will carry value of 1+1=2 as it is Post Increment Operator. But for sum value of x=1
         * Post increment >>> Value increments only after operation. In this case for getting sum application
         * need to assign value to x this is the operation here(First x++). Once value is assigned to x=1 due to post increment x will increase by 1,
         * and new value for next operation is 2.
         *
         * 2. ++x  x=2 from earlier operation now we are using Pre Increment Operator which will increase
         * earlier value(x=2) by one and store the x=3 value which will carry forward for next operation. Here value used for sum function is 3 as pre
         * increment happens before operation.
         *
         * 3. x++ this is post increment. Value for sum function x = 3 (which was set by earlier post increment). As it is post increment, that means
         * it will carry forward 3+1=4 for next ++x operation.
         *
         * 4. ++x this is pre increment. Value sets by earlier operation was 4. Due to pre increment it will add 1 to the value of x,
         * and x=4+1= 5 before the sum operation.Value for sum function x = 5. Value to carry forward for next operation is 5
         *
         * 5. ++x this is pre increment. Value sets by earlier operation x =5. Due to pre increment it will add 1 to the value of x,
         * and x=5+1= 5 before the sum operation.Value for sum function x = 6.
         * Hope this will make you clear
         *
         */

        System.out.println(x);
    }
}
