package com.company;

import java.util.Arrays;
import java.util.function.Function;


public class Main {

    public static void main(String[] args) {

        String[] arr = new String[]{"string", "integer",  null, "10"};

        String[] newArr =  filter(arr,s->s!=null);
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    public static <T> T[] filter(T[] arr, Function<? super T,Boolean> filter) {
            int counter = 0;
            for(int i = 0; i< arr.length; i++){
                if(!filter.apply(arr[i])){
                    counter++;
                } else{
                    arr[i - counter] = arr[i];
                }
            }
            return Arrays.copyOf(arr, arr.length - counter);
        }

    }
