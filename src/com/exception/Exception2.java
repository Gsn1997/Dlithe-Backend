package com.exception;

public class Exception2 {

     String id = null;
     public void test2(){
         try{
             id.length();
         }
         catch(NullPointerException abc){
             System.out.println(abc.getMessage());
         }
         System.out.println(id.length());

     }

    public static void main(String[] args) {
        new Exception2().test2();
    }





}
