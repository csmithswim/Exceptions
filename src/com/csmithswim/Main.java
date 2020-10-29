package com.csmithswim;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
            //Can use Exception class or Throwable class because these are the parents of IOException
        } catch (IOException e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}
