package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian Ibrahim @ Zeinith.com
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

    @Override
    public void play() {
        while (p1.hasCards() && p2.hasCards()) {
            Card card1 = p1.play();
            System.out.println("Player :" + p1.getPlayerID() + " has a" + card1);
            Card card2 = p2.play();
            System.out.println("Player :" + p2.getPlayerID() + " has a" + card2);
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
                    System.out.println("Player :" + p1.getPlayerID() + " has a" + card1);
                    Card c2 = p2.play();
                    System.out.println("Player :" + p2.getPlayerID() + " has a" + card2);
                    addToPile(c1, c2);
                    compared = +(c1.cardValue() - c2.cardValue());
                }
                    else{
                        declareWinner();
                    }
                }
            }
            declareWinner();
        }
        
    }

    private void addToPile(Card c1, Card c2) {
        pile.add(c2);
        pile.add(c1);
    }

    private void grantPile(Player p) {
        while (!pile.isEmpty()) {
             System.out.println("Pile size"+ pile.size());
            p.hand.add(pile.get(0));
            pile.remove(0);
             System.out.println("Pile size"+ pile.size());
           
        }
    }

    private void winAnnouncement(Player p) {
        System.out.println("Player " + p.getPlayerID() + "Won the round");
    }

    private void deal() {
        System.out.println(deck.size());
        for (int i = 0; i < deck.size(); i++) {
            if (i % 2 == 0) {
                p1.hand.add(deck.get(i));
            } else {
                p2.hand.add(deck.get(i));
            }
        }
    }

    @Override
    public void declareWinner() {
        System.out.println("Winner !!");
    }

    private void getplayerInfo() {
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
