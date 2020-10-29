package com.csmithswim;

//Checked -> Exception
//Unchecked (runtime) -> RuntimeException


public class InsufficientFundsException extends Exception {
    //Default constructor
    public InsufficientFundsException(){
        super("Insufficient funds in your account.");
    }
    //Other constructor
    public InsufficientFundsException(String message){
        super(message);
    }

}
