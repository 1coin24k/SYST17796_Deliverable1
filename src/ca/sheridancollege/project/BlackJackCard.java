/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author YutingLi
 */
public class Main {

    public static void main(String[] args) {
//        BlackJackGame blackJackGame = new BlackJackGame("BlackJack");
//        blackJackGame.play();
        int score = 0;
        Scanner input = new Scanner(System.in);
        
        
        
       BlackJackGroupOfCards deck = new BlackJackGroupOfCards(1);
       deck.getFullDeck();
       deck.shuffle();
 //       System.out.println(deck);
        System.out.println("____________________");
        
        BlackJackGroupOfCards playerCards = new BlackJackGroupOfCards(1);
        BlackJackGroupOfCards dealerCards = new BlackJackGroupOfCards(1);
       
       //loop to take the players input
       int choice = 0;
        do{
         System.out.println("Welcome to BlackJack Game");
           System.out.println("Please enter your choice?");
           System.out.println("1. Start Game\n2. Your Score\n3Exit");
           choice =input.nextInt();
           
           if(choice == 1){
               playerCards.draw(playerCards);
                playerCards.draw(playerCards);
                dealerCards.draw(dealerCards);
                dealerCards.draw(dealerCards);
                
                System.out.println("Your hand: ");
                System.out.println(playerCards.toString());
                
           } 
           
           if(choice == 2){
               
           }
           
           

         } while(choice != 3);
 }
    
}
    


