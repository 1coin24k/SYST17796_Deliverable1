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
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Random;




public class BlackJackGroupOfCards extends GroupOfCards {
    
            ArrayList<BlackJackCard> cards;

     
    public BlackJackGroupOfCards(int givenSize){
        super(givenSize);
        this.cards = new ArrayList<BlackJackCard>();
    }
    
    public BlackJackCard getCard(int i){
        return this.cards.get(i);
    }
        
            
//    public BlackJackGroupOfCards(int givenSize) {
//        super(givenSize);
//        this.cards = new ArrayList<BlackJackCard>();
//        initial();
//        shuffle();
       
   

//    private void initial(){
//        BlackJackCard card = new BlackJackCard();
//      card.setSuit("Diamond");
//        card.setValue(1);
//
//        ArrayList<Card> cards = new ArrayList<>();
//        cards.add(card);
//
//        this.setCards(cards);
//    }
    
    //Generate Cards
    public void getFullDeck(){
        for(Suit cardSuit : Suit.values()){
            for (Value cardValue : Value.values()){
                this.cards.add(new BlackJackCard(cardSuit, cardValue));
            }
        }
    }
    
    public String toString(){
        String cardList = "";
        for(BlackJackCard a : this.cards){
           cardList += "\n" + a.toString();
        }
        return cardList;
    }
 
    @Override
    public void shuffle(){
        ArrayList<BlackJackCard> newDeck = new ArrayList<BlackJackCard>();
       Random rm = new Random();
       int rmCardIndex = 0;
       for(int i=0; i<cards.size(); i++){
           rmCardIndex = rm.nextInt(cards.size());
           newDeck.add(cards.get(rmCardIndex));
       }
       this.cards = newDeck;
    } 
    public void draw(BlackJackGroupOfCards drawCard){
        this.cards.add(drawCard.getCard(0));
    }
    
    
    public int cardsPoints(){
        int totalPoints = 0;
        int aces = 0;
        
        for(BlackJackCard a : this.cards){
            switch(a.getValue()){
                case TWO: totalPoints += 2; break;
                case THREE: totalPoints += 3; break;
                case FOUR: totalPoints += 4; break;
                case FIVE: totalPoints += 5; break;
                case SIX: totalPoints += 6; break;
                case SEVEN: totalPoints += 7; break;
                case EIGHT: totalPoints += 8; break;
                case NINE: totalPoints += 9; break;
                case TEN: totalPoints += 10; break;
                case JACK: totalPoints += 10; break;
                case QUEEN: totalPoints += 10; break;
                case KING: totalPoints += 10; break;
                case ACE: aces += 1; break;
            }
        }
        for(int i=0; i<aces; i++){
            if(totalPoints > 10){
                totalPoints +=1 ;  
            }
            else{
                totalPoints += 11;
            }
        }
        return totalPoints;
    }

}


