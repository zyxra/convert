package com.microtest.testconvert;
//import static spark.Spark.*;
import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World.java");
        //get("/hello", (request, response) -> "Hello World!");

        char c;
        BufferedReader br  =  new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter symbol 'q' to quit");
        //  read symbols
        try {
            do {
                c=(char) br.read();
                System.out.println(c);
            } while(c!=  'q');
        }
        catch (IOException ex)
        {
            System.out.println("Error");
        }
        finally {
            try {
                if (br != null) br.close();
            }
            catch (IOException ex)
            {  ex.printStackTrace();
            }
        }
        //quit arguments commandString
        for(int i=0; i<args.length; i++) {
            System.out.println("args[" + i + "] : " + args[i]);
        }
        //print old java properties
        System.out.println("");
        Properties p = System.getProperties();
        Enumeration keys = p.keys();
        while (keys.hasMoreElements()) {
            String key = (String)keys.nextElement();
            String value = (String)p.get(key);
            System.out.println(key + ": " + value);
        }
        System.out.println("");

    }
}