package com.company;
import java.io.*;
public class FileWriteTest1 {
public static void main(String args[]){
    try{
        FileOutputStream fo=new FileOutputStream("D:\\Study\\java\\filetest\\akash.txt");
        String s="Hello I am Akash";
        byte b[]=s.getBytes(); //converting string into byte array
        fo.write(b);
        fo.close();
        System.out.println("Success....");
    }catch (Exception e){System.out.println(e);}





    /* FileOutputStream foo=new FileOutputStream("D:\\Study\\java\\filetest\\restest.txt");
    byte m[]=s.getBytes(); //converting string into byte array
    foo.write(m);
    foo.close();
   */



}



}
