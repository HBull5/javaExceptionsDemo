package exceptionsdemo;

public class Exceptions {
    
    /**
     * try to get and index that doesn't exist from the array and handle 
     * the exception, should probably take a second parameter of which index you want
     * if this wasn't just for practice.
     */
    public static void printElementOfArrayIfExists(String [] strs) {
        try {
            String index = strs[2];
            // You can change the exception from Array to String to see it break
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Out Of Bounds!!!");
        } finally {
            System.out.println("Happens Every Time!!");
        }
    }
    
    /**
     * Try to get a character out of a String object that does exist and handle 
     * it anyways even though it exists and finally if it did successfully assign 
     * isReal to a char print that char, should probably take a second parameter 
     * of which index you want if this wasn't just for practice.
     */
    public static void printCharOfStringIfExists(String str) {
        Character isReal = '\u0000';
        try {
            isReal = str.charAt(5);
            System.out.println(isReal);
        } catch(StringIndexOutOfBoundsException e) {
            System.out.println("String Out Of Bounds!!!");
        } finally {
            if(isReal.equals('\u0000')) {
                System.out.println(isReal);
            }
        }
    }
    
}