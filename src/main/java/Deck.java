import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Deck{
  Helper helper = new Helper();
  ArrayList<Card> deck = new ArrayList<Card>();
  
  public Deck(ArrayList<Card> deck){
    this.deck = deck;
  }

  public ArrayList<Integer> makeRankList(Deck deck){
    ArrayList<Integer> rankDeck = new ArrayList<Integer>();
    for(int i = 0; i < deck.deck.size(); i++){
      rankDeck.add((deck.deck.get(i)).value);
    }
    return helper.mergeSort(rankDeck);
  }

  public ArrayList<Integer> makeSuitList(Deck deck){
    ArrayList<Integer> suitDeck = new ArrayList<Integer>();
    for(int i = 0; i < deck.deck.size(); i++){
        suitDeck.add((deck.deck.get(i)).suit);
    }
    return helper.mergeSort(suitDeck);
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

  public ArrayList<Card> make_river(Hand one, Hand two){
    ArrayList<Card> river = new ArrayList<Card>();
    ArrayList<Card> deck = make_deck(one, two);
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

  public void remove_hands(Hand one, Hand two, ArrayList<Card> deck){
    Card first = one.getCardOne();
    Card second = one.getCardTwo();
    Card third = two.getCardOne();
    Card fourth = two.getCardTwo();
    int i = 0;
    int k = 1;
    while(i < deck.size()){
      if(i == -1){
        i++;
        k = 2;
      }
      if(first.cardEqual(deck.get(i)) || 
         second.cardEqual(deck.get(i)) ||
         third.cardEqual(deck.get(i)) ||
         fourth.cardEqual(deck.get(i))){
        deck.remove(i);
        if(k == 2){
          i--;
          i--;
        }
      } else {
        i++;
      }
    }
  }

  
  
  public void removeDoubles(Deck deck){
    
  }
  
}