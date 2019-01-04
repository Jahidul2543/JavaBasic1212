package collections.framework;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet <String> hashSet = new HashSet<>();
        hashSet.add("Mozammel");
        hashSet.add("Abdel");
        hashSet.add("Salma");
        hashSet.add("Alma");
       //hashSet.add("Alma");
        hashSet.add(null);
      /**
       * Set can store only one null value
       * It does not allow any duplicate value
       *
       * */


        System.out.println(hashSet);

        /**
         *  Access data from HashSet using foreach() method
         *
         * */
        System.out.println("*******Access data from HashSet using foreach() method*******");

        hashSet.forEach( name -> System.out.println(name));

        /**
         *  Access data from HashSet using foreach statement
         *
         * */

        for (String st : hashSet) {
            System.out.println(st);

        }

    }
}
