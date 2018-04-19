package com.company;
import java.io.*;
import java.util.*;
public class RePlural{
public static void main(String args[])throws Exception{
    String a;
    Scanner sc=new Scanner(System.in);
    a=sc.nextLine();
    FileOutputStream fo=new FileOutputStream("D:\\Study\\java\\filetest\\restest.txt",true);
    byte b[]=a.getBytes();
    fo.write(b);
    fo.close();
   try{
        FileInputStream fi=new FileInputStream("D:\\Study\\java\\filetest\\restest.txt");
        int i=fi.read();
        while(i!=-1){
            System.out.println((char)i);
            i=fi.read();
        }
        System.out.println("s");
        fi.close();
    }catch(Exception e){System.out.println(e);}
    System.out.println("\n\nSuccess...........");
}
}
