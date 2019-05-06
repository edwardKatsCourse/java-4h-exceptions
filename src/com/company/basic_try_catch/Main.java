package com.company.basic_try_catch;

public class Main {

    public static void main(String[] args) {
        //try, catch, finally
        //throw, throws


        try {
            System.out.println(1/0); //ArithmeticException
            if (true) {
                throw new PersonException("");
            } else {

                throw new ManagerException("exception message");
            }

        } catch (EmployeeException | PersonException e) {
            System.out.println("person exception");
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("exception");
            System.out.println(e.getMessage());
        }

        System.out.println("Exit");

//        getDigit();

    }

    //StackOverflowError
    private static int getDigit() {
        return getDigit();
    }
}

class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super("EmployeeException -> " + message);
    }
}

class ManagerException extends EmployeeException {
    public ManagerException(String message) {
        super(message);
    }
}





class PersonException extends Exception {

    public PersonException(String message) {
        super("PersonException -> " + message);
    }
}


