package ca.sheridancollege.project;
import java.util.Scanner;
/**
 * Validates integer value passed in. Invalid input will
 * re-prompt for correct value.
 * 
 * @author Ian Ibrahim, Kris Zwolinski
 * 
 */
public class Validator
{
    /**
     * Make sure user inputs an int.
     * 
     * @return, returns an int. 
     */
   public static int getValidInt ()
   {
      Scanner input = new Scanner(System.in);
      int num;
      while (!input.hasNextInt()) {
         System.out.println("Invalid input please input a valid number");
         input.nextLine();

      }
      num = input.nextInt();
      return num;

   }
}
