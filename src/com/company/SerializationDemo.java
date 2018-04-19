package com.company;
import java.io.Serializable;
import java.io.*;

class MyClass implements Serializable {
    String s;
    int i;
    double d;
    public MyClass(String s,int i, double d){
        this.s=s;
        this.i=i;
        this.d=d;
    }
    public String toString()
    {
        return "s="+s+";i="+i+";d="+d;
    }
}

public class SerializationDemo{
    public static void main(String args[]){

        try{
            MyClass obj1=new MyClass("Hello",-7,2.7e10);
            System.out.println("Obj1 : "+obj1);
            FileOutputStream fo=new FileOutputStream("D:\\Study\\java\\filetest\\serial.txt",true);
            ObjectOutputStream oos=new ObjectOutputStream(fo);
            oos.writeObject(obj1);
            oos.flush();
            oos.close();
        }catch(IOException e){
            System.out.println("Exception During Srialixatioin");
            System.exit(0);
        }
        try{
            MyClass obj2;
            FileInputStream fi=new FileInputStream("D:\\Study\\java\\filetest\\serial.txt");
            ObjectInputStream ois=new ObjectInputStream(fi);
            obj2=(MyClass)ois.readObject();
            ois.close();
            System.out.println("Obj2 :"+obj2);
        }catch (Exception e){System.out.println("Exception During Desrialization: "+e);
        System.exit(0);}

    }
}