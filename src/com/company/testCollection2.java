package com.company;
import java.util.*;
public class testCollection2 {
    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Amit");
        al.add("Vijoy");
        al.add("Sachin");
        al.add(1,"Akash");
        System.out.println("Element at 2nd position:" + al.get(2));
        ListIterator<String> itr = al.listIterator();
        System.out.println("Traversing elemnts in forward direction...");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Traversing elemets in backward direction...");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
