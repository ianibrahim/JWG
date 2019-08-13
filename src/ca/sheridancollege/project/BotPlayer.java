package ca.sheridancollege.project;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class BotPlayer extends Player
{


   public BotPlayer (String name)
   {
      super(name);
   }


   @Override
   public Card play ()
   {

      Card topCard = hand.get(0);
      hand.remove(0);
      return topCard;
   }

}
