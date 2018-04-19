package com.company;


public class GenecricMeth{
    public static <E> void printArray(E[] elements){
        for(E element : elements){System.out.println(element);}
        System.out.println();
    }
    public static void main(String args[])
    {
        Integer[] intArray={10,20,30,40,50};
        Character[] charArray={'j','a','v','a','T','P','O','I','n','T'};
        System.out.println("printing integer array");
        printArray(intArray);
        System.out.println("PrintingCharacter Array");
        printArray(charArray);
    }


}

