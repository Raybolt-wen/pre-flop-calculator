import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.math.*;


class River {
  Helper helper = new Helper();
  Deck deckHelper = new Deck(new ArrayList<Card>());
  //rank_river and suit_river should already be sorted from main based on rank and suit respectively
  ArrayList<Card> river = new ArrayList<Card>();
  static ArrayList<Integer> rank_river = new ArrayList<Integer>();
  static ArrayList<Integer> suit_river = new ArrayList<Integer>();
  returner information;
  public River(ArrayList<Card> river, returner Information) {
     this.river = river;
     this.information = Information;
     Deck decked = new Deck(river);
     this.rank_river = deckHelper.makeRankList(decked);
     this.suit_river = deckHelper.makeSuitList(decked);
     this.information = chooser();
  }
  
  //IsPair_twoPair checks for pair, two pair and high card.
  public returner isPair_twoPair(){
    ArrayList<Integer> rankRiver = new ArrayList<Integer>(rank_river);
    //helper.printList(rank_river);
    // System.out.println("pair");
    ArrayList<Integer> revHighCard = helper.reverseArrayList(rankRiver);
    //helper.printList(revHighCard);
    int counter = 0;
    ArrayList<Integer> highCard =  new ArrayList<Integer>();
    ArrayList<Integer> topPair = new ArrayList<Integer>();
    for(int i = 0; i < (rankRiver.size()-1); i++){
      //System.out.println(revHighCard.get(i));
      if(revHighCard.get(i) == revHighCard.get(i+1)){
        counter++;
        if(topPair.size() <= 1){
          topPair.add(revHighCard.get(i));
        }
        i++;
        // System.out.println(rankRiver.get(i));
      } else {
        //System.out.println(revHighCard.get(i));
        // System.out.println("Here 2");
        highCard.add(revHighCard.get(i));
      }
    }
    if(!(topPair.contains(revHighCard.get(6)))){
      highCard.add(revHighCard.get(6));
    }
    if(highCard.isEmpty()){
      highCard.add(0);
    }
    //Run the for loop to get rid of all the other numbers to just return the highcard
      ArrayList<Integer> highCardHolder = new ArrayList<Integer>();
      ArrayList<Integer> revtopPair = helper.reverseArrayList(topPair);
      if(counter >= 2){
          deckHelper.twoListAdd(highCardHolder, highCard, 1);
          returner returner2 = new returner(2, helper.reverseArrayList(topPair), highCardHolder);
          return returner2;
        } else if (counter == 1) {
          // returner.add(noPairPairTwoPair);
          // returner.add(revtopPair);
          deckHelper.twoListAdd(highCardHolder, revHighCard, 3);
          // returner.add(highCardHolder);
          //helper.printList(revHighCard);
          returner returner2 = new returner(1, helper.reverseArrayList(topPair), highCardHolder);
          return returner2;
        } else {
          deckHelper.twoListAdd(highCardHolder, revHighCard, 5);
          returner returner2 = new returner(0, helper.reverseArrayList(topPair), highCardHolder);
          return returner2;
        }
    }


  public returner isStraightOrFlushOrStrightFlush(){
    ArrayList<Integer> rankRiver = new ArrayList<Integer>(rank_river);
    ArrayList<Integer> suitRiver = new ArrayList<Integer>(suit_river);
    // helper.printList(rankRiver);
    // System.out.println("Flush");
    //deckHelper.print_river(river);
    ArrayList<Integer> topCard = new ArrayList<Integer>();
    ArrayList<Integer> empty = new ArrayList<Integer>();
    if(deckHelper.isFlush(river).getExists()){
      //System.out.print("hi");
      //deckHelper.print_river(river);
      



      ArrayList<Card> temp = deckHelper.removeNonSuit(river, deckHelper.isFlush(river).getNum2());
      temp = deckHelper.removeDoubles(temp);
      //helper.printCardList(temp);
      Deck decking2 = new Deck(temp);
      ArrayList<Integer> tempInt = deckHelper.makeRankList(decking2);
      


      if((deckHelper.isStraight(tempInt)).getExists()){
        if(deckHelper.isRoyal(tempInt)){
          returner returner2 = new returner(9, empty, empty);
          return returner2;
        }

        topCard.add((deckHelper.isStraight(tempInt)).getNum());
        returner returner2 = new returner(8, topCard, empty);
        return returner2;
      }
      else if(deckHelper.wheelStraightStraightFlush(river).getExists()){
        if(deckHelper.wheelStraightStraightFlush(river).getNum() == 2){
          topCard.add(5);
          returner returner = new returner(4, topCard, empty);
          return returner;
        } else if (deckHelper.wheelStraightStraightFlush(river).getNum() == 1){
          topCard.add(5);
          returner returner = new returner(8, topCard, empty);
          return returner;
        }
      }
      else{
        topCard.add(deckHelper.isFlush(river).getNum());
        returner returner2 = new returner(5, topCard, empty);
        return returner2;
      }
    } 
    ArrayList<Card> temp = deckHelper.removeDoubles(river);
      //helper.printCardList(temp);
    Deck decking2 = new Deck(temp);
    ArrayList<Integer> tempInt = deckHelper.makeRankList(decking2);
    if (deckHelper.isStraight(tempInt).getExists()){
      topCard.add((deckHelper.isStraight(tempInt)).getNum());
      returner returner2 = new returner(4, topCard, empty);
      return returner2;

    }

    if(deckHelper.wheelStraightStraightFlush(river).getExists()){
      if(deckHelper.wheelStraightStraightFlush(river).getNum() == 2){
        topCard.add(5);
        returner returner = new returner(4, topCard, empty);
        return returner;
      } else if (deckHelper.wheelStraightStraightFlush(river).getNum() == 1){
        topCard.add(5);
        returner returner = new returner(8, topCard, empty);
        return returner;
      }
    }

    returner returner2 = new returner(-1, empty, empty);
    return returner2;
   
  }

  public returner isTrips(){
    ArrayList<Integer> rankRiver = new ArrayList<Integer>(rank_river);
    ArrayList<Integer> suitRiver = new ArrayList<Integer>(suit_river);
    // helper.printList(rankRiver);
    // System.out.println("isTrips");
    int counter = 0;
    ArrayList<Integer> highCard =  new ArrayList<Integer>();
    ArrayList<Integer> counterHolder =  new ArrayList<Integer>();
    ArrayList<Integer> topTrips = new ArrayList<Integer>();
    for(int i = 0; i < rankRiver.size()-2; i++){
      if((rankRiver.get(i) ==  rankRiver.get(i+1)) && (rankRiver.get(i) ==  rankRiver.get(i+2))){
        counter = 3;
        topTrips.add(rankRiver.get(i));
        i = i+2;
      } else {
        highCard.add(rankRiver.get(i));
      }
    }
    ArrayList<Integer> holder = new ArrayList<Integer>();
    deckHelper.containAdd(topTrips, highCard, rankRiver, 5, 6);
    if(highCard.size() > 1){
      deckHelper.twoListAdd(holder, helper.reverseArrayList(highCard), 2);
    }
    // if(!(topTrips.contains(rankRiver.get(5)))){
    //   highCard.add(rankRiver.get(5));
    // }
    // if(!(topTrips.contains(rankRiver.get(6)))){
    //   highCard.add(rankRiver.get(6));
    // }
    if(counter == 0){
      returner returner = new returner(-1, highCard, highCard);
      return returner;
    } else {
      topTrips = helper.reverseArrayList(topTrips);
      highCard = helper.reverseArrayList(highCard);
      returner returner = new returner(3, topTrips, holder);
      return returner;
    }
    
  }

  public returner isQuads(){
    ArrayList<Integer> rankRiver = new ArrayList<Integer>(rank_river);
    ArrayList<Integer> suitRiver = new ArrayList<Integer>(suit_river);
    int counter = 0;
    // helper.printList(rankRiver);
    // System.out.println("isQuads");
    ArrayList<Integer> highCard =  new ArrayList<Integer>();
    ArrayList<Integer> counterHolder =  new ArrayList<Integer>();
    ArrayList<Integer> topQuads = new ArrayList<Integer>();
    for(int i = 0; i < rankRiver.size()-3; i++){
      if((rankRiver.get(i) ==  rankRiver.get(i+1)) && 
         (rankRiver.get(i) ==  rankRiver.get(i+2)) && 
         (rankRiver.get(i) ==  rankRiver.get(i+3))){
        counter = 7;
        topQuads.add(rankRiver.get(i));
        i = i+3;
      } else {
        highCard.add(rankRiver.get(i));
      }
    }
    deckHelper.containAdd(topQuads, highCard, rankRiver, 5, 6);
    if(counter == 0){
      returner returner = new returner(-1, suitRiver, rankRiver);
      return returner;
    } else {
      topQuads = helper.reverseArrayList(topQuads);
      highCard = helper.reverseArrayList(highCard);
      ArrayList<Integer> holder = new ArrayList<Integer>();
      deckHelper.twoListAdd(holder, highCard, 1);
      returner returner = new returner(7, topQuads, holder);
      return returner;
    }
  }

  public returner isFullHouse(){
    ArrayList<Integer> rankRiver = new ArrayList<Integer>(rank_river);
    ArrayList<Integer> suitRiver = new ArrayList<Integer>(suit_river);
    // helper.printList(rankRiver);
    // System.out.println("isFullHouse");
      int counter = -1;
      ArrayList<Integer> mainList = helper.keepDoubles(rankRiver);
      //helper.printList(mainList);
      twoVar tripChecker  = helper.babyTrips(mainList);
      twoVar pairChecker;
      if(tripChecker.getExists()){
        //helper.printList(helper.removeTrips(tripChecker.getNum(), mainList)); 
        pairChecker = helper.babyPair(helper.removeTrips(tripChecker.getNum(), mainList)); 

      } else {
        pairChecker = new twoVar(0,false);
      }
      ArrayList<Integer> highCard =  new ArrayList<Integer>();
      ArrayList<Integer> counterHolder =  new ArrayList<Integer>();
      // System.out.println(tripChecker.getExists());
      // System.out.println(pairChecker.getExists());
      if(tripChecker.getExists() && pairChecker.getExists()){
        counter = 6;
        highCard.add(tripChecker.getNum());
        highCard.add(pairChecker.getNum());
      }
      returner returner = new returner(counter, highCard,counterHolder);
      return returner;
    }
  
  public returner chooser(){
    ArrayList<Integer> rankRiver = new ArrayList<Integer>(rank_river);
    ArrayList<Integer> suitRiver = new ArrayList<Integer>(suit_river);
    int[] numList = {((isPair_twoPair()).getCounter()), 
                       (isStraightOrFlushOrStrightFlush().getCounter()),
                       (isTrips().getCounter()),
                       (isQuads().getCounter()),
                       (isFullHouse().getCounter())};
    ArrayList<returner> all =  new ArrayList<returner>(3);
    all.add(isPair_twoPair());
    all.add(isStraightOrFlushOrStrightFlush());
    all.add(isTrips());
    all.add(isQuads());
    all.add(isFullHouse());
    int maxNum = 0;
    for(int i = 0; i < numList.length; i++) {
      maxNum = Math.max(maxNum, (numList[i]));
    }
    //System.out.println(maxNum);
    returner returner = new returner(maxNum, suitRiver, rankRiver);
    for(int i = 0; i < all.size(); i++ ){
      if(maxNum == (all.get(i).getCounter())){
        returner = all.get(i);
      }
    }
    return returner;
    
        
  }
 }

