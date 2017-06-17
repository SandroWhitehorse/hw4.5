package com.trylabs;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
    int array[]=new int[100];
    Random random=new Random();
    for (int i=0; i<array.length; i++ )
    {
        array[i]=random.nextInt(100);
        boolean f = true;
        int j;
        for(j=2; j<array[i] ;j++)
        {
            if (array[i]%j==0) {
                f = false;
                break;
            }
        }
        if (f) System.out.println(i+"-й элемент массива число простое");

    }

    }
}
