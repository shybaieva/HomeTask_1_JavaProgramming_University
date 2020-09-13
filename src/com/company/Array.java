package com.company;

public class Array {

    int a;
    int b;
    int step;
    int length;

    int [] arr;

    public Array(int a, int b, int step, int length) {
        this.a = a;
        this.b = b;
        this.step = step;
        this.length = length;

        arr = new int [length];
        fillArray();
    }

    private int [] fillArray(){
        arr[0]= a;
        for(int i=1; i<length; i++){
            arr[i] = arr[i-1]+step;
        }
        return arr;
    }

}
