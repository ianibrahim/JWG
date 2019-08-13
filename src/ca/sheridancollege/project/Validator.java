package ca.sheridancollege.project;
import java.util.Scanner;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Validator
{
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
