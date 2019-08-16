package ca.sheridancollege.project;
import java.util.Scanner;
/**
 * Generates a Human player object. Subclass of Player class, extends Player class.
 * 
 * @author Ian Ibraham, Kris Zwolinski
 */
public class HumanPlayer extends Player
{

   Scanner input = new Scanner(System.in);

   /**
    * 
    * @param name is the name passed in. 
    */
   
   public HumanPlayer (String name)
   {
      super(name);

   }


/**
 * Displays the number of cards player has. Promts player to continue the game.
 * Takes the top card of players deck and passes it to the pile.
 * @return Top card will be passed to the pile.
 */
   @Override
   public Card play ()
   {
      System.out.println("You Have: "+hand.size()+ " Cards\nPress 'Enter' to play a card ");
      input.nextLine();
      Card topCard = hand.get(0);
      hand.remove(0);
      return topCard;

   }
   
   @Override
   public void clearTest(){
       hand.clear();
   }

}
