package ca.sheridancollege.project;

/**
 * @author
 */
public class JavaCardsGame
{
   public static void main (String[] args)
   {

      boolean run = true;
      while (run) {
         System.out.println("******JWG Welcomes you ****** please select one of the following games ");
         System.out.println("1: War Game");
         System.out.println("Or input 0 to quit");

         switch (Validator.getValidInt()) {
            case 1:
               WarGame warGame = new WarGame();

               break;
            case 0:
               run = false;
               break;
            default:
               System.out.println("Kindly input a valid option from the menu");
               break;

         }
      }

   }

}
