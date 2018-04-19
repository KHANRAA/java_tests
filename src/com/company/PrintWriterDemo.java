package com.company;
import java.util.*;
import java.io.*;
public class PrintWriterDemo {

    public static void main(String args[]) throws Exception{
        File f=new File("D:\\Study\\java\\filetest\\akash.txt");
        PrintWriter output=new PrintWriter(f);
        output.print("java class");
        output.print(40);
        output.print("LPU");
        output.print(85.5);
        output.print('a');
        output.close();
    }

}
