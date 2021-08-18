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
public class BlackJackPlayer extends Player {
    
    private int score;
   
    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public BlackJackPlayer(String name) {
        super(name);
    }

    /**
     *
     */
    @Override
    public void play(){
    }

	public void win() {
		// TODO - implement BlackJackPlayer.win
	//	throw new UnsupportedOperationException();
                score += 1;
	}

	public void loss() {
		// TODO - implement BlackJackPlayer.loss
	//	throw new UnsupportedOperationException();
	if(score>0)
        score -= 1;
            else
            score = 0;
        }

	public void resetScore() {
		// TODO - implement BlackJackPlayer.resetScore
	//	throw new UnsupportedOperationException();
	score = 0;
        }

	public void HitCard(Card card) {
		// TODO - implement BlackJackPlayer.HitCard
	//	throw new UnsupportedOperationException();
	
        }



}
