
/**
 * Write a description of class Main here.
 * This will create a random number which has to be guessed by the user in a number
 * of attemps which will be counted at the end.
 * @author (Marlys)
 * 
 */
import java.util.Scanner;
import java.util.Random; 
public class Main
{
    // instance variables - replace the example below with your own
    
    public static void main(){
    
        // initialise instance variables
        Random randomNumber = new Random();
        int limit = randomNumber.nextInt(50); 
        int yourNumber;
        int oldNumber=0;
        int i=0;
       
        do{
        System.out.println("Enter a number from 0 to 50");
        Scanner number = new Scanner(System.in);
        yourNumber = number.nextInt();
        i++;
        
         if (yourNumber==oldNumber){i--;
            System.out.println("You already guessed that");}
         
        else if(limit == yourNumber){
            System.out.println("Correct guess");}
            else if(limit > yourNumber){
                System.out.println("Too small");}
                else if(yourNumber>50){
                    System.out.println("Invalid Number");i--;}
                else{
                    System.out.println("Too large");}
                oldNumber= yourNumber;
                System.out.println("This is your guess number "+i);
            }
                while(limit != yourNumber);
                System.out.println("Your number of guesses was "+i);
                
        
    

    
}
}
