package InputStream;

import java.io.FileReader;

public class FileReaderExample {

        public static void main(String args[])throws Exception{

            FileReader fr = new FileReader("/Users/jahidul/IdeaProjects/JavaBasic1212/src/resources/Test.txt");

            int i;

            while((i=fr.read())!=-1)
                System.out.println((char)i);
            fr.close();
        }
    }

