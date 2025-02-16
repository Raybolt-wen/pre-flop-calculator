import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args) {
    Helper helper = new Helper();
    Scanner myObj = new Scanner(System.in);
      //List of all the ranks
      ArrayList<Integer> ranks = new ArrayList<Integer>();
      //List of all the suits
      ArrayList<Integer> suits = new ArrayList<Integer>();
      //reads the ranks and the suits and puts them into their respective lists
      for(int i = 1; i < 5; i++){
        System.out.println("Enter number" + i + " card rank ");
        String rank = myObj.nextLine();
        int make_rank = helper.Value_Card_Assigner(rank);
        ranks.add(make_rank);
        System.out.println("Enter number" + i + " card suit");
        String suit = myObj.nextLine();  
        int make_suit = helper.Suit_Card_Assigner(suit);
        suits.add(make_suit);
      }
      Card C_1 = new Card(suits.get(0), ranks.get(0));
      Card C_2 = new Card(suits.get(1), ranks.get(1));
      Hand H_1 = new Hand(C_1, C_2);
      Card C_3 = new Card(suits.get(2), ranks.get(2));
      Card C_4 = new Card(suits.get(3), ranks.get(3));
      Hand H_2 = new Hand(C_3, C_4);
      ArrayList<Card> river = helper.make_river();
      helper.print_river(river);
      
  }

}

