
package ca.sheridancollege.project;
import java.util.ArrayList;
/**
 * A class that models Players in the game. Players have an identifier.
 *
 * @author dancye, 2018, Ian Ibraham, Kris Zwolinski
 */
public abstract class Player
{
   public ArrayList<Card> hand = new ArrayList<>();
   private String playerID; //the unique ID for this player

   /**
    * A constructor that allows you to set the player's unique ID
    *
    * @param name the unique ID to assign to this player.
    */
   public Player (String name)
   {
      playerID = name;
   }

   public boolean hasCards ()
   {
      return !hand.isEmpty();
   }

   /**
    * @return the playerID.
    */
   public String getPlayerID ()
   {
      return playerID;
   }

   /**
    * Sets the playerID
    *
    * @param givenID, name passed in to set.
    */
   public void setPlayerID (String givenID)
   {
      playerID = givenID;
   }

   /**
    * The method to be instantiated when you subclass the Player class
    * with your specific type of Player.
    */
   public abstract Card play ();

   
   public abstract void clearTest();
}
