package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  Subclass of Game class, extends Game class. The main logic and rules of the 
 * the war game. 
 * 
 * @author Ian Ibrahim, Kris Zwolinski
 */
public class WarGame extends Game {

    
    private Player p1, p2;
    private final ArrayList<Card> deck = GroupOfCards.getInstance();
    private final ArrayList<Card> pile = new ArrayList<>();

    public WarGame() {
        super("War Game");
        getplayerInfo();
        deal();
        play();
    }

    /**
     * Continues playing as long as both players have cards in hand. Announces 
     * the card both players are currently using. Compares the card rank, and
     * adds the cards to a pile. Winners receives the cards.
     * 
     */
    @Override
    public void play() {
        while (p1.hasCards() && p2.hasCards()) {
            Card card1 = p1.play();
            System.out.println("Player: " + p1.getPlayerID() + " has a" + card1);
            Card card2 = p2.play();
            System.out.println("Player: " + p2.getPlayerID() + " has a" + card2);
            int compared = card1.cardValue() - card2.cardValue();
            addToPile(card1, card2);

            if (compared > 0) {

                winAnnouncement(p1);
                grantPile(p1);
                

            } else if (compared < 0) {
                grantPile(p2);
                winAnnouncement(p2);
            } else {
                System.out.println("W**A**R");
               
                while (compared == 0 ) {
                    if (!(p1.hand.size()==0&&p2.hand.size()==0)){
                    Card c1 = p1.play();
                    System.out.println("Player: " + p1.getPlayerID() + " has a " + card1);
                    Card c2 = p2.play();
                    System.out.println("Player: " + p2.getPlayerID() + " has a " + card2);
                    addToPile(c1, c2);
                    compared = +(c1.cardValue() - c2.cardValue());
                }
                    else{
                        System.out.println(declareWinner());
                    }
                }
            }
        }
        System.out.println(declareWinner());
    }

    /**
     * Adds cards to a pile.
     * 
     * @param c1 card from player 1
     * @param c2 card from player 2
     */
    private void addToPile(Card c1, Card c2) {
        pile.add(c2);
        pile.add(c1);
    }

    /**
     * Gives the winner the pile of cards into their deck.
     * 
     * @param p player to receive pile.
     */
    private void grantPile(Player p) {
        while (!pile.isEmpty()) {
             //System.out.println("Pile size "+ pile.size());
            p.hand.add(pile.get(0));
            pile.remove(0);
             //System.out.println("Pile size"+ pile.size());
           
        }
    }

    //Announce player that has won the round.
    private void winAnnouncement(Player p) {
        System.out.println("Player " + p.getPlayerID() + " Won the round");
    }

    /**
     * Deals cards to both players equally(26 cards each).
     */
    private void deal() {
        //System.out.println(deck.size());
        for (int i = 0; i < deck.size(); i++) {
            if (i % 2 == 0) {
                p1.hand.add(deck.get(i));
            } else {
                p2.hand.add(deck.get(i));
            }
        }
    }

 /**
 * Declares the winner once a player has won the game. Returns application to
 * the game select screen.
     * @return returns the winner string
 */
    @Override
    public String declareWinner() {
        if(p1.hasCards()== false){
        return p2.getPlayerID() + " is the Winner !!";
        }
        else if(p2.hasCards()== false){
        return p1.getPlayerID() + " is the Winner !!";    
        }
        else{
            return p1.getPlayerID() + " and " + p2.getPlayerID() + " have tied the game!";
        }
    }

    /**
     * Prompts for number of human players. Prompts for the name of the human user or users.
     * Invalid re-prompts user.
     * Instantiates 2 player objects in both cases. 
     */
    private void getplayerInfo() {
        boolean playerset = false;
        while (!playerset) {
            System.out.println("Plese enter number: 1 for 1 player and number 2 for 2 players");
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
                    System.out.println("Kindly enter the name for player two");
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
