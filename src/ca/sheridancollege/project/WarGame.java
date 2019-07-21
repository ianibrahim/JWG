package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian Ibrahim @ Zeinith.com
 */
public class WarGame extends Game {

    private int numOfPlayers;
    private Player[] players;
    private PileOfCards gameDeck = new PileOfCards(52);

    public WarGame(String givenName) {
        super("War Game");

    }

    @Override
    public void play() {
        gameDeck.fill();
        System.out.println(gameDeck.showCards());
        gameDeck.shuffle();
        System.out.println(gameDeck.showCards());

        Scanner userInput = new Scanner(System.in);
        System.out.println("Please Select the number of players ");
        Player player1 = new PCplayer("Alfa");
        Player player2 = new HumanPlayer ("mont");
        player1.play();
        player2.play();

    }
    
    public void truce() { 
        
    }

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
