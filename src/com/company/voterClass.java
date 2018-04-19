package com.company;
import java.util.*;

public class voterClass {

    public static  void main(String args[])
    {
        int a;
        System.out.println("Enter the age for voting generetaion");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        try{
            if(a<18)
            { try { throw new ArithmeticException(""); } catch(ArithmeticException e){ System.out.println("Age cannot be less than 18");throw e; }}
            else if(a>50)
            {
                try{throw new NullPointerException("");} catch(NullPointerException f){System.out.println("Voting is not for old ones");throw f;}
            }
            else
            {System.out.println("Welcome to vote\n");}

        }
        catch(ArithmeticException e) { System.out.println("DO better in next Time"); }
        catch (NullPointerException f){System.out.println("GO and rest of life in Home and do some sex with your wife");}
    }

}
