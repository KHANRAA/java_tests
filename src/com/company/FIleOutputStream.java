package com.company;
import java.io.*;
public class FIleOutputStream {
public static void main(String args[])
{
    try{

        FileOutputStream fout=new FileOutputStream("D:\\Study\\java\\filetest\\akash.txt");
        fout.write(65);
        fout.close();
        System.out.println("Success...");
    }catch (Exception e){System.out.println(e);}

}}
