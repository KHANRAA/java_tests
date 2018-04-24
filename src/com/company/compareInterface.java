package com.company;

interface MinMax<t extends Comaparable<T>>{
    T min();
    T max();
}

class MinimumMaximum<T extends Comparable<T>>implements MinMax<T>{
    T[] array;
    MinimumMaximum(T[] o){
        array=0;
    }
    public T min(){
        T min array[0];
            if(array[i].compareTo(min)<0)
                min=array[i];
        }return min;
    }
    public T max(){
        T max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i].compareTo(max)>0)
                max=array[i];
        }
        return max;
    }        for(int i=1;i<array.length;i++){

    }

public class compareInterface {
    public static void main(String args)

}
