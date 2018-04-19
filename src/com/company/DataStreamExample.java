package com.company;
import java.io.*;

public class DataStreamExample {
public static void main(String args[]){
    try{
        FileInputStream fin=new FileInputStream("D:\\Study\\java\\filetest\\akash.txt");
        int i=fin.read();
        while(i!=-1){

            System.out.println((char)i);
            i=fin.read();
        }
        fin.close();

    }catch(Exception e){System.out.println(e);}
}}
