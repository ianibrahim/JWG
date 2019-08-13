package ca.sheridancollege.project;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Ian Ibrahim @ Zeinith.com
 */
public class WarGame extends Game
{

   private final int tieBreaker = 3;
   private Player p1, p2;
   private final ArrayList<Card> deck = GroupOfCards.getInstance();
   private ArrayList<Card> pile = new ArrayList<>();


   public WarGame ()
   {
      super("War Game");
      getplayerInfo();
      deal();
      play();
   }

   @Override
   public void play ()
   {
      while (!p1.hasCards() && !p2.hasCards()) {
         Card card1 = p1.play();
         System.out.println("Player :" + p1.getPlayerID() + " has a" + card1);
         Card card2 = p2.play();
         System.out.println("Player :" + p2.getPlayerID() + " has a" + card2);
         int compared = card1.cardValue() - card2.cardValue();
         if (compared > 0) {
            p1.hand.add(card2);
            p1.hand.add(card1);
         }
         else if (compared < 0) {
            p2.hand.add(card2);
            p2.hand.add(card1);
         }
         else {
            System.out.println("W**A**R");
            for (int i = 0; i < tieBreaker;) {
               
            }
         }


      }
   }

   private void deal ()
   {
      for (int i = 0; i < deck.size(); i++) {
         if (i % 2 == 0) {
            p1.hand.add(deck.get(i));
         }
         else {
            p2.hand.add(deck.get(i));
         }
      }
   }




   @Override
   public void declareWinner ()
   {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

   private void getplayerInfo ()
   {
      boolean playerset = false;
      while (!playerset) {
         System.out.println("Plese enter number 1 for 1 player and number 2 for 2 players");
         Scanner input = new Scanner(System.in);
         switch (Validator.getValidInt()) {
            case 1:
               System.out.println("Kindly enter the name of the player");

               String name1 = input.nextLine();
               p1 = new HumanPlayer(name1);
               p2 = new BotPlayer("PC");
               playerset = true;

               break;
            case 2:
               System.out.println("Kindly enter the name for player One");
               String name = input.nextLine();
               System.out.println("Kindly enter the name for second player ");
               String name2 = input.nextLine();
               p1 = new HumanPlayer(name);
               p2 = new HumanPlayer(name2);
               playerset = true;
               break;
            default:
               System.out.println("The number entered doesn't match the minimum or maximum number of players allowed");
               break;
         }
      }

   }
}
