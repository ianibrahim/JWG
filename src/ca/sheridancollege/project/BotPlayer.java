package ca.sheridancollege.project;
/**
 * Generates a computer player, extending the Player class.
 * 
 * @author Ian Ibraham, Kris Zwolinski
 */
public class BotPlayer extends Player
{

/**
 * 
 * @param name, name passed in.
 */
   public BotPlayer (String name)
   {
      super(name);
   }

/**
 * Displays the number of cards computer player has. Prompts player to continue the game.
 * Takes the top card of players deck and passes it to the pile.
 * @return Top card will be passed to the pile.
 */
   @Override
   public Card play ()
   {
       System.out.println("PC Has: "+hand.size()+" Cards\n");
      Card topCard = hand.get(0);
      hand.remove(0);
      return topCard;
   }

    @Override
    public void clearTest() {
        hand.clear();
    }

   
}
