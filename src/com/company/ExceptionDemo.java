package com.company;
import java.util.*;
public class ExceptionDemo {
public static void main(String args[])
{
    int a;
    System.out.println("Enter Number");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    try{
        if(a<10)
        {
            try{
                throw new ArithmeticException("");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Number is less than 10");
                throw e;
            }
        }
        else if(a>20){

            try{
                throw new ArithmeticException("");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Number is greater than 20");
            throw e;
            }
        }
        else{

            System.out.println("Number is Valid");
        }
    }
    catch(ArithmeticException e){
        System.out.println("Thanks for using this test");
    }

}
}
