package com.example.demo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.yaml.snakeyaml.util.ArrayStack;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortDemo {


    private static int[] PARAM =new int[9];
    static {
        PARAM = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
    }

    public static void printInt(int[] param){
        isEmptyOrNullOfArr(param);
        Arrays.stream(param).map(a -> {
            System.out.print(" "+a);
            return a ;
        }).count();
    }


    public static int[] bubbleSort(int[] param){
        isEmptyOrNullOfArr(param);
        for(int i=1;i<param.length;i++){
            for(int j=0;j<param.length-i;j++){
                if(param[j]>param[j+1]){
                    int temp = param[j];
                    param[j] = param[j+1];
                    param[j+1] = temp ;
                }
            }
        }
        return param ;
    }

    public static int[] selectionSort(int[] param){
        isEmptyOrNullOfArr(param);
        for(int i = 0 ; i<param.length-1;i++){
            int min = i ;
            for(int j=i+1;j<param.length;j++){
                if(param[j]<param[min]){
                    min = j ;                 }
            }
            if(i != min){
                int temp = param[i];
                param[i] = param[min];
                param[min] = temp ;
            }
        }
        return param ;
    }

    public static String reverseStr(String str){
        Stack stack = new Stack();
        char[] chars = str.toCharArray();
        for(char c : chars){
            stack.push(c);
        }
        String reverseStr ="";
        while(!stack.isEmpty()){
            reverseStr += stack.pop();
        }
        return reverseStr ;
    }

    public static void isEmptyOrNullOfArr(int[] param){
        if(param == null || param.length == 0){
            throw new RuntimeException("数组为空");
        }
    }
    public static void main(String[] args) {
       // bubbleSort(PARAM);
        //selectionSort(PARAM);
        //printInt(PARAM);
        System.out.println(reverseStr("hello world"));
    }
}
