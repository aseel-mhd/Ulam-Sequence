/*
 * 
 *
 *
 */
package ulam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; //turns the byte streams to character streams

/**
 *
 * @author Aseel Mohamed
 */
public class Ulam {  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException { //if the String can't be converted to Integer

        BufferedReader myinput = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int [20000]; //Creates and populates the array
        array[0] = 1; //setting first nth term to 1
        array[1] = 2; //setting second nth term to 1
        int userInput;
        int count = 0;
        int num = 2;
        int userChoice = 0;
        System.out.println("Enter the nth term: ");
        userInput = Integer.parseInt(myinput.readLine()); //Convert from external to internal numeric format
        
        //Loops until desired input is recieved
        for (int i = 3; i <= 11000; i++) { //when the nth term is <= 11000, starting at index 3 
            for(int j = 0; j < num; j++) { //for the second term 
                //iterates while the new term is less than the number entered
                for(int k = j + 1; k < num; k++) { //Adds the previous term + 1
                    if(array[j] + array[k] == i) { 
                        count++; //iterates until the number entered is reached
                    }
                }
            }
            if(count == 1) { //while the count is 1
                array[num] = i; //set the entered number to the current index
                //System.out.println(array[num]); //Testing what's printing
                num++; //iterates until the entered number is reached
            }
            count = 0; //sets the counter back to 1
        }
        //prints the calculated Ulam number of the nth term entered
        System.out.println("The Ulam number is: " + array[userInput - 1]); 
    }
}
"# Ulam-Sequence" 
