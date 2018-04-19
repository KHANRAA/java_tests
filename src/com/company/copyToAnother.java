package com.company;
import java.io.*;
public class copyToAnother {
public static void main(String args[])throws Exception {
    FileInputStream fi=new FileInputStream("D:\\Study\\java\\filetest\\akash.txt");
    FileOutputStream fo=new FileOutputStream("D:\\Study\\java\\filetest\\aout.txt",true);
    int i=fi.read();
    while(i!=-1){
        fo.write((char)i);
        i=fi.read();
    }
    System.out.println("Success.....");
    fi.close();
    fo.close();

}
}
