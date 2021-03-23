//
//  LambdaException.java
//  Java 8 The Complete Reference
//
//  Created by José Ruiz on 3/19/21.
//

package com.ruiz211.i.languaje.xv.lambdas;

interface ValidateAge {
    boolean validate(int age);
}

public class LambdaException {
    public static void main(String... doYourBest) {
        ValidateAge validateAge = age -> {
            try {
                if (age <= 0) {
                    throw new AgeException("Age not valid");
                } else if (age < 18) {
                    System.out.println("You shall no pass!");
                    return false;
                } else {
                    System.out.println("Pass");
                    return true;
                }
            } catch (AgeException ageException) {
                System.out.println(ageException.getMessage());
            }
            return false;
        };

        System.out.println(Age.canEnter(validateAge) ? "Welcome" : "Bye");
    }
}

class Age {
    static boolean canEnter(ValidateAge validateAge) {
        return validateAge.validate(17);
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}