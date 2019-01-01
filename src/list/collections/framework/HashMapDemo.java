package list.collections.framework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    /**
     *
     * Map is a data structure where you can store data as Key Value Pair
     * Key can not be duplicated, value can be duplicated
     *
     * */

    public static void main(String[] args) {


        HashMap <Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Mozammel");
        hashMap.put(2, "Abdel");
        hashMap.put(3, "Salma");
        hashMap.put(4, "Alma");

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){

            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Key is "+entry.getKey() + " & Value is " + entry.getValue());

        }
    }

}
