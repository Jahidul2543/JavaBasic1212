package InputStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferReaderExample {
    public static void main(String args[])throws Exception{

        FileReader fileReader = null;
        BufferedReader br = null;
        File filepath = null;

        /**
         * System.getProperty("user.dir") = Users/jahidul/IdeaProjects/JavaBasic1212
         *
         * */

      try {


         /* fileReader = new FileReader("/Users/jahidul/IdeaProjects/JavaBasic1212/src/resources/Test.txt");
          br = new BufferedReader(fileReader);*/

          filepath = new File(System.getProperty("user.dir") +  "/src/resources/Test.txt");
          fileReader = new FileReader(filepath.getAbsoluteFile());

          br = new BufferedReader(fileReader);


          int i;
          while((i=br.read())!=-1){
              System.out.println((char)i);
          }
          }
      catch (FileNotFoundException e){

          e.printStackTrace();
          System.out.println("Check file location");

      }



     finally {
          br.close();
          fileReader.close();
          System.out.println("Leaving finally block");
      }

    }
}


/**
 * File filepath = new File(System.getProperty("user.dir") +  "/testData/TestData.xlsx");
 *
 *
 * */