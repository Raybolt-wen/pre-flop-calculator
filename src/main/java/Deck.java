import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.math.*;
public class Deck{
  Helper helper = new Helper();
  ArrayList<Card> deck = new ArrayList<Card>();
  
  public Deck(ArrayList<Card> deck){
    this.deck = deck;
  }
  public int size(){
   return deck.size();
  }
  public ArrayList<Integer> makeRankList(Deck deck){
    ArrayList<Integer> rankDeck = new ArrayList<Integer>();
    for(int i = 0; i < deck.size(); i++){
      rankDeck.add((deck.deck.get(i)).value);
    }
    return helper.mergeSort(rankDeck);
  }
  public ArrayList<Integer> makeUnsortedRankList(Deck deck){
    ArrayList<Integer> rankDeck = new ArrayList<Integer>();
    for(int i = 0; i < deck.size(); i++){
      rankDeck.add((deck.deck.get(i)).value);
    }
    return rankDeck;
  }

  public ArrayList<Integer> makeSuitList(Deck deck){
    ArrayList<Integer> suitDeck = new ArrayList<Integer>();
    for(int i = 0; i < deck.size(); i++){
        suitDeck.add((deck.deck.get(i)).suit);
    }
    return helper.mergeSort(suitDeck);
  }
  public ArrayList<Integer> makeUnSortedSuitList(Deck deck){
    ArrayList<Integer> rankDeck = new ArrayList<Integer>();
    for(int i = 0; i < deck.size(); i++){
      rankDeck.add((deck.deck.get(i)).suit);
    }
    return rankDeck;
  }

  public ArrayList<Card> make_deck(Hand one, Hand two){
    ArrayList<Integer> ranks = new ArrayList<Integer>();
    ArrayList<Integer> suits = new ArrayList<Integer>();
    ArrayList<Card> deck = new ArrayList<Card>();
    // for(int i = 2; i < 15; i++){
    //   ranks.add(i);
    // }
    // for(int i = 1; i < 5; i++){
    //   suits.add(i);
    // }
    for(int i = 2; i < 15; i++){
      for(int j = 1; j < 5; j++){
        if(!((one.getCardOne().getSuit() == j && one.getCardOne().getValue() == i) ||
          (one.getCardTwo().getSuit() == j && one.getCardTwo().getValue() == i) ||
          (two.getCardOne().getSuit() == j && two.getCardOne().getValue() == i) ||
          (two.getCardTwo().getSuit() == j && two.getCardTwo().getValue() == i))){
            Card c = new Card(i, j);
            deck.add(c);
          }
      }
    }
    return deck;
  }

  public ArrayList<Card> make_river(Hand one, Hand two) {
    ArrayList<Card> deck = make_deck(one, two);
    Collections.shuffle(deck);
    ArrayList<Card> river = new ArrayList<Card>();
    for (int i = 0; i < 5; i++) {
        river.add(deck.get(i));
    }
    return river;
}

  public void print_river(ArrayList<Card> river){
    ArrayList<String> display = new ArrayList<String>();
    for (int i = 0; i< river.size(); i++) {
      Card temp = river.get(i);
      String sentence = " " + temp.getValue()  + " of  " + temp.getSuit()+" " ;
      display.add(sentence);
    }
    for (int i = 0; i < display.size(); i++) {
      System.out.print(display.get(i));
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

  
  //Takes in a unsorted deck, sorts it and sets all cards of double rank to a single card
  public ArrayList<Card> removeDoubles(ArrayList<Card> unSortedDeck){

    ArrayList<Card> returner = new ArrayList<Card>();
    ArrayList<Card> deck = helper.mergeSortCards(unSortedDeck);
    for(int i = 0; i < unSortedDeck.size()-1; i++){
      if (deck.get(i).getValue() == (deck.get(i+1)).getValue()){
        returner.add(deck.get(i));
        i++;
      }else {
        returner.add(deck.get(i));
      }
    }
    if(!(returner.contains(deck.get(deck.size()-1)))){
       returner.add(deck.get(deck.size()-1));
    }
    return returner;
    
  }
  
  public threeVar isFlush(ArrayList<Card> deckList){
    int counter = 0;
    ArrayList<Integer> holder = new ArrayList<Integer>();
    for(int i = 1; i < 5; i++){
      for(int j = 0; j < deckList.size(); j ++){
        if((deckList.get(j)).getSuit() == i){
          counter++;
          holder.add((deckList.get(j)).getValue());
          //System.out.print(counter);
        }
      }
       if(counter >= 5){
        holder = helper.mergeSort(holder);
        threeVar returner = new threeVar(holder.get(holder.size()-1), true, i);
        return returner;
       }
       counter = 0;
    }
    threeVar returner = new threeVar(0,false, 0);
    return returner;
  }

  public ArrayList<Card> removeNonSuit(ArrayList<Card> deckList, int keep){
    //print_river(deckList);
    ArrayList<Card> returner = new ArrayList<Card>();
    for(int i =0; i < deckList.size(); i++){
      if(deckList.get(i).getSuit() == keep){
        returner.add(deckList.get(i));
      }
    }
    return returner;
  }

  public twoVar isStraight(ArrayList<Integer> list){
    int counter = 0;
    //helper.printList(list);
    ArrayList<Integer> cardReturner = new ArrayList<Integer>();
    boolean exists = false;
    for(int i = 0; i < list.size()-4; i++){
      if((list.get(i) ==  (list.get(i+1)-1)) && 
        (list.get(i) ==  (list.get(i+2)-2)) && 
        (list.get(i) ==  (list.get(i+3)-3)) && 
        (list.get(i) ==  (list.get(i+4)-4))){
          cardReturner.add(list.get(i+4));
          exists = true;
        }
    }
    if(cardReturner.isEmpty()){
      cardReturner.add(0);
    }
    twoVar returner = new twoVar(cardReturner.get(cardReturner.size()-1), exists);
    return returner;
  }

  public boolean isRoyal(ArrayList<Integer> list){
    int counter = 0;
    for(int i = 0; i < list.size(); i++){
      if(list.contains(i+10)){
        counter++;
      }
    }
    if(counter >= 5){
      return true;
    } else {
      return false;
    }
  }

  public twoVar wheelStraightStraightFlush(ArrayList<Card> list){
    int counter = 0;
    boolean ace = false;
    if(isFlush(list).getExists()){
      ArrayList<Card> temp = removeNonSuit(list, isFlush(list).getNum2());
      Deck decking2 = new Deck(temp);
      ArrayList<Integer> tempInt = makeRankList(decking2);
      for(int i = 0; i < 4; i++){
        if(tempInt.contains(i+2)){
          counter++;
        }
        if(tempInt.contains(14)){
          ace = true;
        }
      }
      if(counter >= 4 && ace == true){
        twoVar retruner = new twoVar(1, true);
        return retruner;
      } else {
        twoVar retruner = new twoVar(1, false);
        return retruner;
      }
    }
    Deck decking2 = new Deck(list);
    ArrayList<Integer> tempInt = makeRankList(decking2);
    //helper.printList(tempInt);
    for(int i = 0; i < 4; i++){
      if(tempInt.contains(i+2)){
        counter++;
      }
      if(tempInt.contains(14)){
        ace = true;
      }
    }
    if(counter >= 4 && ace == true){
      twoVar retruner = new twoVar(2, true);
      return retruner;
    } else {
      twoVar retruner = new twoVar(2, false);
      return retruner;
    }
  }
  

  public void containAdd(ArrayList<Integer> topThing, ArrayList<Integer> highCard, ArrayList<Integer> rankRiver, int start, int end){
    for(int i = start; i <= end; i++){
      if(!(topThing.contains(rankRiver.get(i)))){
        highCard.add(rankRiver.get(i));
      }
    }
  }

  public void twoListAdd(ArrayList<Integer> highCardHolder, ArrayList<Integer> revHighCard, int end){
    for(int i = 0; i < end; i++){
      highCardHolder.add(revHighCard.get(i));
    }
  }

  public threeVar riverCompare(returner r1, returner r2){
    if(r1.getCounter() != r2.getCounter()){
        return new threeVar(Math.max(r1.getCounter(), r2.getCounter()), false,
                            (r1.getCounter() > r2.getCounter()) ? 1 : 2);
    } else {
        for(int i=0; i<Math.min(r1.top.size(), r2.top.size()); i++){
            if(r1.top.get(i) > r2.top.get(i)) return new threeVar(r1.counter, false, 1);
            else if(r1.top.get(i) < r2.top.get(i)) return new threeVar(r2.counter, false, 2);
        }
        for(int i=0; i<Math.min(r1.highCard.size(), r2.highCard.size()); i++){
            if(r1.highCard.get(i) > r2.highCard.get(i)) return new threeVar(r1.counter,false,1);
            else if(r1.highCard.get(i) < r2.highCard.get(i))return new threeVar(r2.counter,false,2);
        }
        return new threeVar(r2.counter,false,0); // Draw scenario
    }
  }
}