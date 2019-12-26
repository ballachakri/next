package com.next;

import java.io.*;
import java.util.*;

public class SystemClassDemo {
    public static void main(String[] args) throws IOException {

        long time=System.currentTimeMillis();
        Date date=new Date(time);
        System.out.println("Normal date format :   "+ date);

        long nano=System.nanoTime();
        Date date1=new Date(nano);
        System.out.println("Scientific date format : "+ date1);


//        System.out.println("JVM RUNNING:");
//        System.exit(0);
//        System.out.println("JVM TERMINATED:");
//        FileInputStream IN = new FileInputStream(new File("C:\\Users\\sball\\Desktop\\customer.txt"));
//        FileOutputStream OUT = new FileOutputStream("system.txt");
//
//        // set input stream
//        System.setIn(IN);
//        char c = (char) System.in.read();
//        System.out.print(c);
//
//        // set output stream
//        System.setOut(new PrintStream(OUT));
//        System.out.write("Hi Chakra\n".getBytes());
//
//        // set error stream
//        System.setErr(new PrintStream(OUT));
//        System.err.write("Exception message\n".getBytes());

//        System.out.println(System.getenv());
//
//        Map<String, String> m=System.getenv();
//        Set<String> s=m.keySet();
//        for(String str:s) {
//            System.out.println(str +" : " +m.get(str));
//        }
//
//        System.out.println(System.getenv("PATH"));
////
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//        System.out.println(System.getProperties());
//
//        Properties p=System.getProperties();
//        Set<Object> set=p.keySet();
//        for(Object obj:set) {
//           String key =(String) obj;
//            System.out.println( obj + " = " +System.getProperty(key));
//        }
//        Runtime r=Runtime.getRuntime();
//        System.out.println(r.freeMemory());
//        System.gc();
//        System.out.println(r.freeMemory());
//        Set<Currency> s=Currency.getAvailableCurrencies();
//        System.out.println(s);
//        Console c = System.console();
//        if(c != null)
//        {
//            Currency currency = Currency.getInstance(Locale.ITALY);
//            c.printf(currency.getSymbol());
//            c.flush();
//        }
//        else
//            System.out.println("No console attached");
//    }
    //      System.out.println(c.getSymbol());
//        System.out.println(" sec manager : " +System.getSecurityManager());

    }
}
