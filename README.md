This repo contains work about exceptions with Java.

An exception/exceptional event, such as NullPointerException, is an object that contains information about an error. 

When tracing through the particular exception error one goes through the stack trace, which is the method call stack in reverse order that caused the error.

When an exception occurs in a method it is known as a method throwing an exception.  

The java runtime looks for an exception handler when the method throws an exception.

In java there are three types of exceptions.

Checked: Exceptions we anticipate and handle properly.

Unchecked:AKA runtime exception, they are not checked by the compiler at compile time. The null pointer exception is an example 
of this. This can be avoided with good coding practice, abundant testing and preferably automated testing. 

Other examples of runtime exceptions are ArithmeticException, which gets thrown if you try to divide value by 0. 

IllegalArgumentException: which is when you throw an argument that is different from the one expected.

IndexOutOfBoundsException which occurs when you try to access a list, array or string index that is out of bounds. An

IllegalStateException is when we try to call a method, but the underlying object is not in the right state.   

Error examples include stack overflow error, or out of memory error. 

Within the exception hierarchy there is throwable, exception, error and runtime exception.

Throwable - defines the common characteristics for all exceptions and errors like messages and the stacktrace. 

Error class and all their subtypes represent errors that are external to our application, like out of memory error. 

Exception class is the parent for all checked and unchecked exceptions. 

RuntimeException are considered unchecked exceptions.



