package Errorhandling;
// Exception - It is used to handle the error in java using try-catch block
// try - function code which may/not throw exception
// catch - code to handle the exception
// finally - code to be executed always

// Custom Exception - user defined exception it should extends Exception
class MyCustomException extends Exception{
    MyCustomException(String msg){
        super(msg);
    }
}

public class ExceptionClass {

    static void systemHandlingException() {
        try{
            
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Always executed");
        }
    }
    static void exceptionThrowing() {
        try{
            
            int a = 10;
            int b = 0;
            if(b==0){
                throw new Exception("Divide by zero");
            }
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void exceptionVarities() {
        try{
            
            int a = 10;
            // int b = 0;
            int b = 1;
            // String s = null;
            String s = "Hello";
            int arr[] = new int[2];
            if(b==0){
                throw new ArithmeticException("Divide by zero");
            }

            // check b is null
            // if(b.equals(null)){
            if(s==null){
                throw new NullPointerException("String is null");
            }

            if(b>=arr.length){
                throw new ArrayIndexOutOfBoundsException("Array index out of bound");
            }

            if(true){
                throw new MyCustomException("This is my custom exception");
            }
            System.out.println(a/b);
        }
        // chaining exception 
        // Common Exception should be at bottom to handle all exceptions else it will be executed at first & close execution of further code
        // Individual catch blocks are executed in sequence 
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception : "+e.getMessage());
        }
        //Group Exception
        catch(NullPointerException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(MyCustomException e){
            System.out.println(e.getMessage());
        }
        // Final catch
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static float divide(){
        // CAUTION - Finally block is always executed and value of finally block 
        // finally block return value will always be the return value of this method
        try{
            int a = 10;
            int b = 10;
            System.out.println(a/b);
            return (float) (a/b);
        }catch(Exception e){
            return 0;
        }finally {
            // System.out.println("Always executed");
            return -1;
        }
    }

    // using throws - it is used in method signature to throw the exception 
    // the exception should be handled by the calling method
    // throws will not handle the exception, the exception should be handled by the calling method
    // The calling method to decide how to handle it.

    static void exceptionThrowingUsingThrows() throws Exception{ 
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }
    static void usingThrows(){
        try {
            exceptionThrowingUsingThrows();
        }catch(Exception e){
            System.out.println("This is using throws : "+e.getMessage());
        }
    }

    public static void invoke(){
        systemHandlingException();
        exceptionThrowing();
        exceptionVarities();
        System.out.println(divide());
        usingThrows();
    }
}