package exceptionsdemo;

public class ExceptionsDemo {

    public static void main(String[] args) {
        String [] strs = {"abc", "123"};
        String str = "012345";
        // this is the same as seting isReal to NULL
        // Character isReal = new Character('\u0000'); <-- this is what I originally had I guess you can ditch the new Character part
        // I have to make a Character Object instead of [char isReal = '\u0000'] because I want to use the .equals method
        System.out.println("First method output: ");
        Exceptions.printElementOfArrayIfExists(strs);
        System.out.println("\nSecond method output: ");
        Exceptions.printCharOfStringIfExists(str);
    }
 
}
