package com.company;
import java.util.*;
import java.io.*;
public class ReadFile {

    public static void main(String args[]) throws Exception{
        File f1=new File("D:\\Study\\java\\filetest\\akash.txt");
        Scanner input = new Scanner(f1);
        while (input.hasNext()) {
            String s = input.nextLine();
            System.out.println(s);
        }
        input.close();
    }
}