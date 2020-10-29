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

Defensive programming is good for building a library or framework for other's to use. Don't use that much in an application, 
just use it from a user input/external systems, i.e. the boundary of the application.

Desktop/Mobile apps have generic exception handlers that catch all types and display their message.

Java provides a lot of general exception classes but sometimes custom exceptions are useful for a library or framework
for others to use and allow other users/devs to understand the actual problem and intent.

Always use the Exception suffix to name your exceptions, similarly to how we name classes.

In Java, we can also chain exceptions, which is wrapping an exception in a more general exception.

Chaining exceptions is used in libraries and frameworks a lot.

Exception initCause method takes a throwable object.

Exception get cause method returns a throwable object.











