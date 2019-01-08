package demo.string;

public class Immutable {
    public static void mysteryMethod( String data )
    {

    }

    public static void main ( String[] args )
    {
       // String str = "An Immutable String" ;

        String str = new String("An Immutable String");

                     str.length();

                     /**
                      * It is not possible to append
                      * Only we can create new String  reference variable
                      * */

        System.out.println("Strign object: " + str);

        StringBuffer stringBuffer = new StringBuffer("StringBuffer is ");
        System.out.println("StringBuffer String object: " + stringBuffer);

        /**
         * Add/append String to stringBuffer reference variable
         *
         * */

        stringBuffer.length();
        stringBuffer.append("  mutable");

        System.out.println("After appending the stringBuffer reference variable: " + stringBuffer);

        stringBuffer.replace(0, 1, "TT");

        System.out.println(stringBuffer);






       /* mysteryMethod( str );
        System.out.println( str );*/
    }
}
