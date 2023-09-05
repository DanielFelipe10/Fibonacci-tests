package com.example.fibonacci;

public class Fibonacci {
    public static int Calcular(int num){
        if((num==0)||(num==1)){
            return num;
        }else{
            return Calcular(num-1)+Calcular(num-2);
        }
    }

}
