package com.csmithswim;
import java.io.IOException;

//This is an example of chained exceptions.

public class Account {
    private float balance;
    //We must specify that this method may throw an IOException, it is apart of its API.
    public void deposit(float value) throws IOException {
        //Known as defensive programming.
        if (value <= 0)
            throw new IOException();
    }
    public void withdraw(float value) throws AccountException {
        if (value > balance)
            throw new AccountException(new InsufficientFundsException());
    }
}

//In this example we are throwing a checked exception
//public class Account {
//    private float balance;
//    //We must specify that this method may throw an IOException, it is apart of its API.
//    public void deposit(float value) throws IOException {
//        //Known as defensive programming.
//        if (value <= 0)
//            throw new IOException();
//    }
//
//    public void withdraw(float value) throws InsufficientFundsException {
//        if (value > balance)
//            throw new InsufficientFundsException();
//    }
//}

//Sometimes in Java we want to throw exceptions. In this example we are throwing a runtime exception.

//public class Account {
//    public void deposit(float value) {
//        //Known as defensive programming.
//        if (value <= 0)
//            throw new IllegalArgumentException();
//    }
//}
