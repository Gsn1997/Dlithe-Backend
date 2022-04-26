package com.exception;

public class ExceptionThrow {
    public void method1() throws DataNotFoundException, InvalidPasswordException {
        String userName = "abc@gamil.com";

        String password = null;

        if (password != null) {

            System.out.println("WELCOME");

        }
        if (userName == null) {
            throw new DataNotFoundException("INVALID USERNAME");
        } else {

            throw new InvalidPasswordException("INVALID CREDENTIALS");
        }

    }

    public static void main(String[] args) throws DataNotFoundException, InvalidPasswordException {
        new ExceptionThrow().method1();
    }
}

