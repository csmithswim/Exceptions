package com.csmithswim;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

//Example showing custom exceptions

public class ExceptionsDemo {
    //IntelliJ can also add exception to method signature
    public static void show() throws IOException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            e.printStackTrace();
        }
    }
}

//In real applications we want to log our exceptions/errors in a file or a database.

//public class ExceptionsDemo {
//    //IntelliJ can also add exception to method signature
//    public static void show() throws IOException {
//        var account = new Account();
//        try {
//            account.deposit(1);
//        } catch (IOException e) {
//            //Simulating logging
//            System.out.println("Logging");
//            //Rethrowing our exception object
//            throw e;
//        }
//    }
//}

//In this example we are throwing a checked exception

//public class ExceptionsDemo {
//    public static void show() {
//        var account = new Account();
//        try {
//            account.deposit(1);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

//This example illustrates the try/catch statement using the try with resources statement
//This type of statement allows Java to initialize and close with a finally block of code during runtime

//public class ExceptionsDemo {
//    public static void show(){
//        FileReader reader = null;
//        try (
//            var reader = new FileReader("file.text");
//            var writer = new FileWriter("...");
//        ) {
//            var value = reader.read();
//            //Anytime we are reading a file in our code we must close it.
//        }
//        catch (IOException e){
//            System.out.println("Could not read data.");
//        }
//    }
//}

//This example illustrates the finally block

//public class ExceptionsDemo {
//    public static void show(){
//        FileReader reader = null;
//        try {
//            //Imagine that file.text exists
//            var reader = new FileReader("file.text");
//            var value = reader.read();
//            //Anytime we are reading a file in our code we must close it.
//        }
//        catch (IOException e){
//            System.out.println("Could not read data.");
//        }
//        //In our finally block we can have file handles, database connections.
//        //It will always be executed, irregardless if there is an exception or not.
//        finally {
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}

//Example showing how to catch multiple types of exceptions with polymorphism.

//public class ExceptionsDemo {
//    public static void show(){
//        try {
//            var reader = new FileReader("file.text");
//            var value = reader.read();
//            new SimpleDateFormat().parse("");
//        }
//        //This catches exceptions of IOException and ParseException
//        catch (IOException | ParseException e){
//            System.out.println("Could not read data.");
//        }
//    }
//}


/*Example showing catch blocks to deal with polymorphism, we want our catch block to catch an IO exception
* or any of its derivatives, any classes that extend the IO exception class*/

//public class ExceptionsDemo {
//    public static void show(){
//        try {
//            var reader = new FileReader("file.text");
//            var value = reader.read();
//        }
//            catch (IOException e){
//                IOException ex = new FileNotFoundException();
//
//                System.out.println("Could not read data.");
//            }
////        } catch (FileNotFoundException e) {
////            e.printStackTrace();
////        }
//
//    }
//}

/* Example showing multiple types of exceptions, only one catch block will be executed.
Our first catch block if for trying to open/read a file that does not exist. Sometimes the order of your catch blocks matter,
i.e. see above.*/

//public class ExceptionsDemo {
//    //This is the proper way to handle checked extensions
//    public static void show(){
//        try {
//            var reader = new FileReader("file.text");
//            //Reads one character and returns its numeric value
//            var value = reader.read();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        //Catch block to handle the IOException
//        catch (IOException e){
//            System.out.println("Could not read data.");
//        }
//    }
//}


////Comment out to see example of try/catch
//
//public class ExceptionsDemo {
//    //This is the proper way to handle checked extensions
//    public static void show(){
//        try {
//            var reader = new FileReader("file.text");
//            System.out.println("File opened");
//            /*In our catch clause we name the object ex by convention, it is an instance of the FileNotFoundException
//            it contains information about this exception. Code will only be executed after the catch block when an exception
//            is caught. IntelliJ has a built in feature to implement a try/catch block when you highlight the checked exception.*/
//        } catch (FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//}

//Comment out to see example of a checked exception

//public class ExceptionsDemo {
//    public static void show(){
//        var reader = new FileReader("file.text");
//        System.out.println("File opened");
//    }
//}
