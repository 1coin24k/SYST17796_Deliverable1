/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author YutingLi
 */
public class BlackJackGame extends Game {
    public BlackJackGame(String givenName) {
        super(givenName);
    }

    @Override
    public void play() {
        BlackJackPlayer player1 = new BlackJackPlayer("SpiderMan");
        BlackJackPlayer player2 = new BlackJackPlayer("IronMan");


        BlackJackGroupOfCards groupOfCards = new BlackJackGroupOfCards(52);

        player1.play();
        player2.play();

        declareWinner();
        resetScore();

    }
    
    

    /**
     *
     */
    @Override
    public void declareWinner() {

    }

    private void resetScore() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
