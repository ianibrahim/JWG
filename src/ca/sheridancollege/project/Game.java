
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models the game.
 * @author dancye, 2018, Ian Ibrahim, Kris Zwolinski
 */
public abstract class Game 
{
    private final String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    
    
    /**
     * Chooses the game based on the given name.
     * 
     * @param givenName 
     */
    public Game(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    
    /**
     * Play the game. 
     */
    public abstract void play();
    
    /**
     * Declare the winner for the game.
     */
    public abstract void declareWinner();

   
    
}//end class
