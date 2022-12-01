import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] str_arra = {"a", "b", "c", "d", "e", "p", "r", "s", "t"};
        System.out.printf("Letters that do work:\n" + Arrays.toString(str_arra));
        
        System.out.println();
        System.out.println();
        System.out.println("String to ouput: ");
        
        //Initialize the String which needs to be split
        String str = "artificialintelligence";

        //Use the Split method and store the array of Strings returned in a String array.
        String[] arr = str.split("(?!^)");

        //Printing the characters using for-each loop
        for(String character : arr)
        System.out.print(character + " ");

        System.out.println();
        
        System.out.println();
        System.out.println("Letters that can be output: ");

        //Printing letters that do work from the string
        for(int i =0; i < str_arra.length; i++) {
            if(str.contains(str_arra[i])) {
                System.out.print(str_arra[i]);
            }
        }
    }
}