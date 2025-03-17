import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  static double counter1 = 0;
  static int highcard1 = 0;
  static int pair1 = 0;
  static int twopair1 = 0;
  static int trips1 = 0;
  static int straight1 = 0;
  static int flush1 = 0;
  static int fullHouse1 = 0;
  static int quads1 = 0;
  static int straightFlush1 = 0;
  static int royal1 = 0;

  static double counter2 = 0;
  static int highcard2 = 0;
  static int pair2 = 0;
  static int twopair2 = 0;
  static int trips2 = 0;
  static int straight2 = 0;
  static int flush2 = 0;
  static int fullHouse2 = 0;
  static int quads2 = 0;
  static int straightFlush2 = 0;
  static int royal2 = 0;
  static double draw = 0;
  
  public static void main(String[] args) {
    double runs = 100000;
    Helper helper = new Helper();
    Deck deckHelper = new Deck(new ArrayList<Card>());
    Scanner myObj = new Scanner(System.in);
      //List of all the ranks
      ArrayList<Integer> ranks = new ArrayList<Integer>();
      //List of all the suits
      ArrayList<Integer> suits = new ArrayList<Integer>();
      //reads the ranks and the suits and puts them into their respective lists



    //     ArrayList<Integer> empty = new ArrayList<Integer>();
    //     returner information = new returner(0, empty, empty);
    //     ArrayList<Integer> rank_river = new ArrayList<Integer>();
    //     ArrayList<Integer> suit_river = new ArrayList<Integer>();
    //     ArrayList<Integer> empty2 = new ArrayList<Integer>();
    //     returner information2 = new returner(0, empty, empty);
    //     ArrayList<Integer> rank_river2 = new ArrayList<Integer>();
    //     ArrayList<Integer> suit_river2 = new ArrayList<Integer>();
    //     ArrayList<Integer> empty3 = new ArrayList<Integer>();
    //     returner information3 = new returner(0, empty, empty);
    //     ArrayList<Integer> rank_river3 = new ArrayList<Integer>();
    //     ArrayList<Integer> suit_river3 = new ArrayList<Integer>();
    //   Card C_1 = new Card(12, 1);
    //   Card C_2 = new Card(10, 1);
    //   Card C_3 = new Card(5,1);
    //   Card C_4 = new Card(3, 2);
    //   Card C_5 = new Card(12,4);
    //   Card C_6 = new Card(14, 1);
    //   Card C_7 = new Card(13, 1);
    //   Card twoC_6 = new Card(4, 2);
    //   Card twoC_7 = new Card(4, 1);


    //   Card twoC_1 = new Card(14, 1);
    //   Card twoC_2 = new Card(14, 2);
    //   Card twoC_3 = new Card(2,3);
    //   Card twoC_4 = new Card(3, 4);
    //   Card twoC_5 = new Card(4,4);
    //   Card threeC_4 = new Card(5, 4);
    //   Card threeC_5 = new Card(6,4);
    //   // ArrayList<Card> river = deckHelper.make_river(H_1, H_2);
    //   ArrayList<Card> river = new ArrayList<Card>();
    //   river.add(C_1);
    //   river.add(C_2);
    //   river.add(C_3);
    //   river.add(C_4);
    //   river.add(C_5);
    //   river.add(C_6);
    //   river.add(C_7);
    //   ArrayList<Card> twoRiver = new ArrayList<Card>();
    //   twoRiver.add(C_1);
    //   twoRiver.add(C_2);
    //   twoRiver.add(C_3);
    //   twoRiver.add(C_4);
    //   twoRiver.add(C_5);
    //   twoRiver.add(twoC_6);
    //   twoRiver.add(twoC_7);
    //   ArrayList<Card> testRiver = new ArrayList<Card>();
    //   testRiver.add(twoC_1);
    //   testRiver.add(twoC_2);
    //   testRiver.add(twoC_3);
    //   testRiver.add(twoC_4);
    //   testRiver.add(twoC_5);
    //   testRiver.add(threeC_4);
    //   testRiver.add(threeC_5);
    // //  Deck decked = new Deck(river);
    // //  rank_river = deckHelper.makeRankList(decked);
    // //  helper.printList(rank_river);

    // //  Deck decked2 = new Deck(twoRiver);
    // // rank_river2 = deckHelper.makeRankList(decked2);
    // //  helper.printList(rank_river2);

    //   //River rivered = new River(river, information, rank_river, suit_river);
    //   //River riveredTwo = new River(twoRiver, information2, rank_river2, suit_river2);
    //   River riveredTest = new River(testRiver, information3, rank_river3, suit_river3);
    //   //rivered.information.printout();
    //   //riveredTwo.information.printout();
    //   riveredTest.information.printout();





        // threeVar result = deckHelper.riverCompare(rivered.information, riveredTwo.information);
        // assignerFunction(result);
        // double ratio1 = counter1/1;
        // double ratio2 = counter2/1;
        // System.out.println("Probability of Hand one winning " + ratio1*100 + " %");
        // System.out.println("Probability of Hand two winning " + ratio2*100 + " %");
        // System.out.println(draw);

      //deckHelper.print_river(river);

      //System.out.println(result.getNum2());


      // Card C_1 = new Card(13, 1);
      // Card C_2 = new Card(14, 1);
      // Hand H_1 = new Hand(C_1, C_2);
      // Card C_3 = new Card(4, 1);
      // Card C_4 = new Card(4, 2);
      
      // Hand H_2 = new Hand(C_3, C_4);

      // ArrayList<Card> river = deckHelper.make_river(H_1, H_2);
      // river.add(C_1);
      // river.add(C_2);
      // river.add(C_3);
      // river.add(C_4);
      // helper.printCardList(river);
      // helper.printCardList(deckHelper.make_deck(H_1, H_2));

      //Main testing rig begin

       for(int i = 1; i < 5; i++){
        
          System.out.println("Enter number " + i + " card rank ");
          String rank = myObj.nextLine();
          int make_rank = helper.Value_Card_Assigner(rank);
          ranks.add(make_rank);
          System.out.println("Enter number " + i + " card suit");
          String suit = myObj.nextLine();  
          int make_suit = helper.Suit_Card_Assigner(suit);
          suits.add(make_suit);
      }
      Card C_1 = new Card(ranks.get(0), suits.get(0));
      Card C_2 = new Card(ranks.get(1), suits.get(1));
      Hand H_1 = new Hand(C_1, C_2);
      Card C_3 = new Card(ranks.get(2), suits.get(2));
      Card C_4 = new Card(ranks.get(3), suits.get(3));
      Hand H_2 = new Hand(C_3, C_4);
      for(int i = 0; i < runs; i++){
        ArrayList<Card> river = new ArrayList<Card>();
        river = deckHelper.make_river(H_1, H_2);
        ArrayList<Card> twoRiver = new ArrayList<Card>(river);
        river.add(C_1);
        river.add(C_2);
        twoRiver.add(C_3);
        twoRiver.add(C_4);
        // deckHelper.print_river(river);
        // System.out.println("");
        // deckHelper.print_river(twoRiver);
        // System.out.println("");
        ArrayList<Integer> empty = new ArrayList<Integer>();
        returner information = new returner(0, empty, empty);
        returner information2 = new returner(0, empty, empty);

        River rivered = new River(river, information);
        River riveredTwo = new River(twoRiver, information2);
        // rivered.information.printout();
        // riveredTwo.information.printout();
        threeVar result = deckHelper.riverCompare(rivered.information, riveredTwo.information);
        // System.out.println(result.getNum2());
        // System.out.println(result.getNum());
        assignerFunction(result);
        // if(result.getNum2() == 0){
        //   System.out.println("draw");
        // }
      }
      double ratio1 = counter1/runs;
      double ratio2 = counter2/runs;
      double ratio3 = draw/runs;
      System.out.println("Probability of Hand one winning " + ratio1*100);
      System.out.println("Probability of Hand two winning " + ratio2*100);
      System.out.println("Probability of Draw " + ratio3*100 + "%");


      


      // Main testing rig end


    
      


}

public static void assignerFunction(threeVar resulter){
  if(resulter.getNum2() == 1){
    counter1++;
    if(resulter.getNum() == 0){
      highcard1++;
    } else if (resulter.getNum() == 1) {
      pair1++;
    } else if (resulter.getNum() == 2) {
      twopair1++;
    } else if (resulter.getNum() == 3) {
      trips1++;
    } else if (resulter.getNum() == 4) {
      straight1++;
    } else if (resulter.getNum() == 5) {
      flush1++;
    } else if (resulter.getNum() == 6) {
      fullHouse1++;
    } else if (resulter.getNum() == 7) {
      quads1++;
    } else if (resulter.getNum() == 8) {
      straightFlush1++;
    } else if (resulter.getNum() == 9) {
      royal1++;
    }
  } else if(resulter.getNum2() == 2){
    counter2++;
    if(resulter.getNum() == 0){
      highcard2++;
    } else if (resulter.getNum() == 1) {
      pair2++;
    } else if (resulter.getNum() == 2) {
      twopair2++;
    } else if (resulter.getNum() == 3) {
      trips2++;
    } else if (resulter.getNum() == 4) {
      straight2++;
    } else if (resulter.getNum() == 5) {
      flush2++;
    } else if (resulter.getNum() == 6) {
      fullHouse2++;
    } else if (resulter.getNum() == 7) {
      quads2++;
    } else if (resulter.getNum() == 8) {
      straightFlush2++;
    } else if (resulter.getNum() == 9) {
       royal2++;
    }
}
  else {
    draw++;
  }
}
}
//6 of  3  11 of  3  12 of  3  13 of  3  10 of  3  4 of  1  4 of  2 
//6 of  3  11 of  3  12 of  3  13 of  3  10 of  3  14 of  1  13 of  1 
//Should draw but is giving it to hand 2
//

