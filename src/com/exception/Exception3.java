package com.exception;

public class Exception3 {
    public void test123() throws ArrayIndexOutOfBoundsException{
        String[] cars = new String[3];
        cars[0]="ford";
        cars[1]="mustang";
        cars[2]="audi";

    }

    public static void main(String[] args) {
        new Exception3().test123();
    }
}
