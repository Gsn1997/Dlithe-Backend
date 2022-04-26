package com.assignment;

public class RemoveDigitsFromString {
    public static void removeDigits(String givenSting) {
        System.out.println("INPUT ="+givenSting);

        givenSting = givenSting.replaceAll("[012346789]", "");//digits is replaced by empty spaces

        System.out.print("OUTPUT =" + givenSting);
    }

    public static void main(String[] args) {
        removeDigits("Amb2an9i is4 ric0he1st pe2rso7n");
    }
}
