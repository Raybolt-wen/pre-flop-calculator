import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
class River {
  Deck deckHelper = new Deck(new ArrayList<Card>());
  //rank_river and suit_river should already be sorted from main based on rank and suit respectively
  ArrayList<Card> river = new ArrayList<Card>();
  ArrayList<Integer> Information = new ArrayList<Integer>();
  ArrayList<Integer> rank_river = new ArrayList<Integer>();
  ArrayList<Integer> suit_river = new ArrayList<Integer>();
  public River(ArrayList<Card> river, ArrayList<Integer> Information, ArrayList<Integer> rank_river, ArrayList<Integer> suit_river) {
     this.river = river;
     this.Information = Information;
     this.rank_river = rank_river;
     this.suit_river = suit_river;
     Deck decked = new Deck(river);
     this.rank_river = deckHelper.makeRankList(decked);
     this.suit_river = deckHelper.makeSuitList(decked);
     this.Information = isPair_twoPair();
  }
  
  public ArrayList<Integer> isPair_twoPair(){
    int counter = 0;
    ArrayList<Integer> highCard =  new ArrayList<Integer>();
    ArrayList<Integer> holder = new ArrayList<Integer>();
    
    for(int i = 0; i < rank_river.size(); i++){
      if(rank_river.get(i) == rank_river.get(i+1)){
        counter++;
        holder.add(i);
        i++;
      } else {
        highCard.add(i);
      }
    }
    
    if(!(holder.contains(rank_river.get(6)))){
      highCard.add(rank_river.get(6));
    }
    
    int highPair = holder.get((holder.size()-1));
    int topCard = highCard.get((highCard.size()-1));
    //Run the for loop to get rid of all the other numbers to just return the highcard
    ArrayList<Integer> returner = new ArrayList<Integer>();
      if(counter >= 2){
          returner.add(2);
          returner.add(topCard);
          returner.add(highPair);
          return returner;
        } else if (counter == 1) {
          returner.add(1);
          returner.add(topCard);
          returner.add(highPair);
          return returner;
        } else {
          returner.add(0);
          returner.add(topCard);
          returner.add(highPair);
          return returner;
        }
  }
