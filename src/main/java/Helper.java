import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Helper{
  Card card = new Card();
  Random rand = new Random();
  //Takes the card value and suit and creates a Card object with int value 
  public int Value_Card_Assigner(String card){
    if(card.equalsIgnoreCase("Ace") || 
       card.equalsIgnoreCase("A")){
      return 1;
    } else if(card.equalsIgnoreCase("Two") || 
              card.equalsIgnoreCase("2")){
      return 2;
    } else if(card.equalsIgnoreCase("Three") ||
              card.equalsIgnoreCase("3")){
      return 3;
    } else if(card.equalsIgnoreCase("Four") ||
            card.equalsIgnoreCase("4")){
      return 4;
    } else if(card.equalsIgnoreCase("Five") ||
              card.equalsIgnoreCase("5")){
      return 5;
    } else if(card.equalsIgnoreCase("Six") || 
              card.equalsIgnoreCase("6")){
      return 6;
    } else if(card.equalsIgnoreCase("Seven") ||
              card.equalsIgnoreCase("7")){
      return 7;
    } else if(card.equalsIgnoreCase("Eight") ||
            card.equalsIgnoreCase("8")){
      return 8;
    } else if (card.equalsIgnoreCase("Nine") ||
              card.equalsIgnoreCase("9")) {
      return 9;
    } else if (card.equalsIgnoreCase("Ten") || 
              card.equalsIgnoreCase("10")) {
      return 10;
    } else if (card.equalsIgnoreCase("Jack") ||
              card.equalsIgnoreCase("J")) {
      return 11;
    } else if (card.equalsIgnoreCase("Queen") ||
            card.equalsIgnoreCase("Q")) {
      return 12;
    } else if (card.equalsIgnoreCase("King") ||
              card.equalsIgnoreCase("K")) {
      return 13;
    }else
      return 0;
  }  

    public int Suit_Card_Assigner(String card){
      if(card.equalsIgnoreCase("Spades") ||
         card.equalsIgnoreCase("S")){
        return 1;
      } else if(card.equalsIgnoreCase("Hearts") ||
                card.equalsIgnoreCase("H")){
        return 2;
      } else if(card.equalsIgnoreCase("Diamonds") ||
                card.equalsIgnoreCase("D")){
        return 3;
      } else if(card.equalsIgnoreCase("Clubs") ||
                card.equalsIgnoreCase("C")){
        return 4;
      } else
        return 0;
    }

  

  public void remove_hands(Hand one, Hand two, ArrayList<Card> deck){
    Card first = one.getCardOne();
    Card second = one.getCardTwo();
    Card third = two.getCardOne();
    Card fourth = two.getCardTwo();
    int i = 0;
    while(i < deck.size()){
      if(cardEqual(first, deck.get(i))){
        deck.remove(i);
        i--;
      } else {
        i++;
      }
    }
  }
  
  public ArrayList<Card> make_deck(Hand one, Hand two){
    ArrayList<Integer> ranks = new ArrayList<Integer>();
    ArrayList<Integer> suits = new ArrayList<Integer>();
    ArrayList<Card> deck = new ArrayList<Card>();
    for(int i = 1; i < 15; i++){
      ranks.add(i);
    }
    for(int i = 1; i < 5; i++){
      suits.add(i);
    }
    for(int i = 1; i < 14; i++){
      for(int j = 1; j < 5; j++){
        Card c = new Card(j, i);
        deck.add(c);
      }
    }
    return deck;
  }

  public ArrayList<Card> make_river(){
    ArrayList<Card> river = new ArrayList<Card>();
    ArrayList<Card> deck = make_deck();
    for (int i = 0; i< 5; i++) {
      int randomNum = (int)(Math.random() * (52-i));
      river.add(deck.get(randomNum));
    }
    return river;
  }

  public void print_river(ArrayList<Card> river){
    ArrayList<String> display = new ArrayList<String>();
    for (int i = 0; i< 5; i++) {
      Card temp = river.get(i);
      String sentence = temp.getValue() + "of " + temp.getSuit();
      display.add(sentence);
    }
    for (int i = 0; i < display.size(); i++) {
      System.out.println(display.get(i));
    }
  }
  
}