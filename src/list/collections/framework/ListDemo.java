package list.collections.framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        // there is a system to make connection or read from DB
        List <String> studentNameList = new ArrayList<String>();

        studentNameList.add("Mozammel");
        studentNameList.add("Abdel");
        studentNameList.add("Salma");
        studentNameList.add("Alma");

        for (String name : studentNameList) {

            System.out.println(" Student Name " + name );

        }



    }
}
