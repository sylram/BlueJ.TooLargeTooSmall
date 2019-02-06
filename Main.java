
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random; 
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public static void main(){
    
        // initialise instance variables
        Random randomNumber = new Random();
        int limit = randomNumber.nextInt(50); 
        int yourNumber;
        int oldNumber;
        int i=0;
       
        do{
        System.out.println("Enter your number");
        Scanner number = new Scanner(System.in);
        yourNumber = number.nextInt();
        i = i+1;
     
        System.out.println("This is your guess number "+i);
    
        if(limit == yourNumber){
            System.out.println("Correct guess");}
            else if(limit > yourNumber){
                System.out.println("Too small");}
                else{
                    System.out.println("Too large");}
                }
                while(limit != yourNumber);
                System.out.println("Your number of guesses was "+i);
                
        
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     /*
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }*/
}
}
