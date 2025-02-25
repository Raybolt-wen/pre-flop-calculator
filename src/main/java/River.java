import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class River {
  Helper helper = new Helper();
  Deck deckHelper = new Deck(new ArrayList<Card>());
  //rank_river and suit_river should already be sorted from main based on rank and suit respectively
  ArrayList<Card> river = new ArrayList<Card>();
  ArrayList<Integer> rank_river = new ArrayList<Integer>();
  ArrayList<Integer> suit_river = new ArrayList<Integer>();
  ArrayList<ArrayList<Integer> > information =  new ArrayList<ArrayList<Integer> >(3);
  public River(ArrayList<Card> river, ArrayList<ArrayList<Integer> > Information, ArrayList<Integer> rank_river, ArrayList<Integer> suit_river) {
     this.river = river;
     this.information = Information;
     this.rank_river = rank_river;
     this.suit_river = suit_river;
     Deck decked = new Deck(river);
     this.rank_river = deckHelper.makeRankList(decked);
     this.suit_river = deckHelper.makeSuitList(decked);
     this.information = isStraightIsStraightFlush();
  }
  
  //IsPair_twoPair checks for pair, two pair and high card.
  public ArrayList<ArrayList<Integer> > isPair_twoPair(){
    int counter = 0;
    ArrayList<Integer> highCard =  new ArrayList<Integer>();
    ArrayList<Integer> topPair = new ArrayList<Integer>();
    
    for(int i = 0; i < (rank_river.size()-1); i++){
      if(rank_river.get(i) == rank_river.get(i+1)){
        counter++;
          topPair.add(rank_river.get(i));
        // System.out.println(rank_river.get(i));
        i++;
      } else {
        // System.out.println("Here 2");
        highCard.add(rank_river.get(i));
      }
    }
    
    if(!(topPair.contains(rank_river.get(6)))){
      highCard.add(rank_river.get(6));
    }
    
    //Run the for loop to get rid of all the other numbers to just return the highcard
      ArrayList<ArrayList<Integer> > returner = new ArrayList<ArrayList<Integer> >(3);
      ArrayList<Integer> noPairPairTwoPair = new ArrayList<Integer>();
      ArrayList<Integer> highCardHolder = new ArrayList<Integer>();
      ArrayList<Integer> revHighCard = helper.reverseArrayList(highCard);
      ArrayList<Integer> revtopPair = helper.reverseArrayList(topPair);
      if(counter >= 2){
          noPairPairTwoPair.add(2);
          returner.add(noPairPairTwoPair);
          returner.add(revtopPair);
          highCardHolder.add(revHighCard.get(0));
          returner.add(highCardHolder);
          return returner;
        } else if (counter == 1) {
          noPairPairTwoPair.add(1);
          returner.add(noPairPairTwoPair);
          returner.add(revtopPair);
          highCardHolder.add(revHighCard.get(0));
          highCardHolder.add(revHighCard.get(1));
          highCardHolder.add(revHighCard.get(2));
          returner.add(highCardHolder);
          return returner;
        } else {
          noPairPairTwoPair.add(0);
          returner.add(noPairPairTwoPair);
          highCardHolder.add(revHighCard.get(0));
          highCardHolder.add(revHighCard.get(1));
          highCardHolder.add(revHighCard.get(2));
          highCardHolder.add(revHighCard.get(3));
          highCardHolder.add(revHighCard.get(4));
          returner.add(highCardHolder);
          return returner;
        }
    }

  public ArrayList<ArrayList<Integer> > isStraightIsStraightFlush(){
    int counter = 0;
    ArrayList<Integer> topCard = new ArrayList<Integer>();
    ArrayList<Integer> rankRiverNoDup = helper.removePairs(rank_river);
    for(int i = 0; i < (rankRiverNoDup.size()-3); i++){
      if ((rankRiverNoDup.get(i) == rankRiverNoDup.get(i+1)) && 
          (rankRiverNoDup.get(i) == rankRiverNoDup.get(i+2)) &&
          (rankRiverNoDup.get(i) == rankRiverNoDup.get(i+3)) &&
          (rankRiverNoDup.get(i) == rankRiverNoDup.get(i+4)) &&
          (suit_river.get(i) == suit_river.get(i+1)) && 
          (suit_river.get(i) == suit_river.get(i+2)) &&
          (suit_river.get(i) == suit_river.get(i+3)) &&
          (suit_river.get(i) == suit_river.get(i+4))) {
            counter = 8;
            topCard.add(rankRiverNoDup.get(i+4));
            i++;
        } else if ((rankRiverNoDup.get(i) == (rankRiverNoDup.get(i+1)-1)) && 
                   (rankRiverNoDup.get(i) == (rankRiverNoDup.get(i+2)-2)) &&
                   (rankRiverNoDup.get(i) == (rankRiverNoDup.get(i+3)-3)) &&
                   (rankRiverNoDup.get(i) == (rankRiverNoDup.get(i+4)-4))) {
              counter=4;
              topCard.add(rankRiverNoDup.get(i+4));
            // System.out.println(rank_river.get(i));
              i++;
        } 
        
    }
    
    ArrayList<ArrayList<Integer> > returner = new ArrayList<ArrayList<Integer> >(3);
    ArrayList<Integer> counterHolder = new ArrayList<Integer>();      
    ArrayList<Integer> highCardHolder = new ArrayList<Integer>();
    counterHolder.add(counter);
    highCardHolder = helper.reverseArrayList(topCard);
    returner.add(counterHolder);
    returner.add(highCardHolder);
    return returner;
  }

}
