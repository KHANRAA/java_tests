package com.company;
import java.io.*;
public class FileDemo {
    public static void main(String args[])
    {
        File f1=new File("D:\\Study\\java\\filetest\\akash.txt");
        System.out.println("File name: "+f1.getName()+"\n");
        System.out.println("PathL: "+f1.getPath()+"\n");
        System.out.println("IS Absolute :"+f1.isAbsolute()+"\n");
        System.out.println("Absolute Path: "+f1.getAbsolutePath()+"\n");
        System.out.println("Parent :"+f1.getParent()+"\n");
        System.out.println(f1.exists()?" : exists\n":"does not Exists\n");
        System.out.println("IS a directory :"+f1.isDirectory()+"\n");
        System.out.println("Is a File: "+f1.isFile()+"\n");
        System.out.println("Can Write :"+f1.canWrite()+"\n");
        System.out.println("CAn Read: "+f1.canRead()+"" +"\n");
        System.out.println("File last modified :"+f1.lastModified()+"\n");
        System.out.println("File Size :"+f1.length()+" Bytes\n");


    }


}
