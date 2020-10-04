import java.util.Scanner;

/**
 * calculates the sum from 1 to input number
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create new scanner for user input
    Scanner input = new Scanner(System.in);

    //ask user for a number
    System.out.println("Please enter an integer to calculate the sum from 1");
    int usersNum = input.nextInt();
    
    //declare variables to count 
    int sum = 0;  
    int count = 1;
     
    //create while loop to add numbers
    while (usersNum >= count){
      sum = sum + count;
      count = count + 1;
      
      // tell user the answer
    }System.out.println("The sum from 1 - " + usersNum + " is " + sum);

  

      
      
    }
    
  }

