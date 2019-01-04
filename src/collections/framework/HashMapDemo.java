package collections.framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    /**
     *
     * Map is a data structure where you can store data as Key Value Pair
     * Key can not be duplicated, value can be duplicated
     * HashMap is not Synchronised thus it is not thread safe
     *
     * */

    public static void main(String[] args) {


        Map <Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Mozammel");
        hashMap.put(2, "Abdel");
        hashMap.put(3, "Salma");
        hashMap.put(4, "Alma");

        /**
         * Get value by key
         * */

        System.out.println(hashMap.get(1));

        /**
         * Iterating using iterator object as per the insertion order
         * 
         * */

        Set set = hashMap.entrySet();

        Iterator iterator = set.iterator();

        System.out.println("****** Iteration using Iterator by while statement ******");
        while (iterator.hasNext()){

            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Key is "+entry.getKey() + " & Value is " + entry.getValue());

        }
        
        /**
         * Iterating using entrySet() as per the insertion order
         * using for each loop
         * 
         * */
        System.out.println("****** Iteration using entrySet by foreach statement ******");

        for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
            
        }

        /**
         *
         * We will store all the key in Set and
         * by enhance for loop we will iterate the set and get the key
         * using the key by get(key) we can get the value of the HashMap
         *
         * */

        Set<Integer> keys = hashMap.keySet();

        System.out.println("****** Iteration Using for statement ******);");

        for (Integer key : keys) {
            System.out.println(key + " " + hashMap.get(key));
        }

        System.out.println("****** Iteration Using foreach() method ******);");

        hashMap.forEach((key, value )-> System.out.println("Key " + key + "Value " + value) );

    }

}
