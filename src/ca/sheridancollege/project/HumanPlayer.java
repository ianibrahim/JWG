package ca.sheridancollege.project;
import java.util.Scanner;
/**
 * @author
 */
public class HumanPlayer extends Player
{

   Scanner input = new Scanner(System.in);

   public HumanPlayer (String name)
   {
      super(name);

   }



   @Override
   public Card play ()
   {
      System.out.println("you Have :"+hand.size()+"Press Enter to play a card ");
      input.nextLine();
      Card topCard = hand.get(0);
      hand.remove(0);
      return topCard;

   }

}
