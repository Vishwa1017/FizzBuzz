package org.example;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(App.fizzBuzz(2));
    }

    public static String fizzBuzz(int i)
    {
        if (i%3!=0 && i%5 != 0 ) return Integer.toString(i);
        if (i%5 == 0) return "Buzz";

        return("FIZZ");
    }
}