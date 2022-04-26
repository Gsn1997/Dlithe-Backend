package com.exception;

public class Exception1 {
    public static void tryCatch(int a,int b){
        try {
            int c = a/b;
            System.out.println(c);

        }catch (ArithmeticException exe){
            System.out.println(exe);
        }
    }

    public static void main(String[] args) {
        tryCatch(1,0); }

    }
