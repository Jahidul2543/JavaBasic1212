package list.collections.framework;

import java.util.HashSet;

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
        //  hashSet.add(null);

        System.out.println(hashSet);

    }
}
