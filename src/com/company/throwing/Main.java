package com.company.throwing;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(method1());

        } catch (Exception e) {
            System.out.println("Unfortunately, an error occurred. Please try again later");
        }
    }

    static int method1() {
        return method2();
    }

    static int method2() {
        return method3();
    }

    static int method3() {
        //code here
        if (true) {
            throw new UncheckedException(12, "asdwegwgewg");
        }
        return 15;
        //code here
    }
}


class CheckedException extends Exception {}

class UncheckedException extends RuntimeException {

    public UncheckedException(int i, String message) {
        super(message);
    }
}