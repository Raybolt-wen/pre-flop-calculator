import java.io.*;
import java.util.*;

public class Helper{
  Random rand = new Random();
  //Takes the card value and suit and creates a Card object with int value 
  public int Value_Card_Assigner(String card){
    if(card.equalsIgnoreCase("Ace") || 
       card.equalsIgnoreCase("A") || 
       card.equalsIgnoreCase("14")){
      return 14;
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
              card.equalsIgnoreCase("J")|| 
              card.equalsIgnoreCase("11")) {
      return 11;
    } else if (card.equalsIgnoreCase("Queen") ||
            card.equalsIgnoreCase("Q")|| 
            card.equalsIgnoreCase("12")) {
      return 12;
    } else if (card.equalsIgnoreCase("King") ||
              card.equalsIgnoreCase("K")|| 
              card.equalsIgnoreCase("13")) {
      return 13;
    }else
      return 0;
  }  

    public int Suit_Card_Assigner(String card){
      if(card.equalsIgnoreCase("Spades") ||
         card.equalsIgnoreCase("S") ||
         card.equalsIgnoreCase("1")){
        return 1;
      } else if(card.equalsIgnoreCase("Hearts") ||
                card.equalsIgnoreCase("H") ||
                card.equalsIgnoreCase("2")){
        return 2;
      } else if(card.equalsIgnoreCase("Diamonds") ||
                card.equalsIgnoreCase("D") ||
                card.equalsIgnoreCase("3")){
        return 3;
      } else if(card.equalsIgnoreCase("Clubs") ||
                card.equalsIgnoreCase("C") ||
                card.equalsIgnoreCase("4")){
        return 4;
      } else
        return 0;
    }

      public ArrayList<Integer> mergeSort(ArrayList<Integer> numbers) {
          if (numbers.size() <= 1) {
              return numbers; // Base case: array is already sorted
          }

          // Split the list in half
          int mid = numbers.size() / 2;
          ArrayList<Integer> left = new ArrayList<Integer>(numbers.subList(0, mid));
          ArrayList<Integer> right = new ArrayList<Integer>(numbers.subList(mid, numbers.size()));

          // Recursively sort both halves
          left = mergeSort(left);
          right = mergeSort(right);

          // Merge the sorted halves
          return merge(left, right);
      }
  
      private ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
          ArrayList<Integer> merged = new ArrayList<Integer>();
          int i = 0, j = 0;

          // Merge the two lists while there are elements in both
          while (i < left.size() && j < right.size()) {
              if (left.get(i) <= right.get(j)) {
                  merged.add(left.get(i));
                  i++;
              } else {
                  merged.add(right.get(j));
                  j++;
              }
          }

          // Add any remaining elements from the left list
          while (i < left.size()) {
              merged.add(left.get(i));
              i++;
          }

          // Add any remaining elements from the right list
          while (j < right.size()) {
              merged.add(right.get(j));
              j++;
          }

          return merged;
      }

  public void printList(ArrayList<Integer> number){
    for(int i = 0; i < number.size(); i++){
      System.out.print(number.get(i));
    }
    System.out.println("\n");
  }

  public void printCardList(ArrayList<Card> number){
    for(int i = 0; i < number.size(); i++){
      System.out.println( number.get(i).getValue() + " of  " +  number.get(i).getSuit());
    }
  }
  
  public void printListList(ArrayList<ArrayList<Integer> > number){
    for(int i = 0; i < number.size(); i++){
      for(int j = 0; j < (number.get(i)).size(); j++){
        System.out.print((number.get(i).get(j)));
      }
      System.out.print("\n");
    }
  }
  
  public ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        // Arraylist for storing reversed elements
        // this.revArrayList = alist;
        for (int i = 0; i < alist.size() / 2; i++) {
            Integer temp = alist.get(i);
            alist.set(i, alist.get(alist.size() - i - 1));
            alist.set(alist.size() - i - 1, temp);
        }

        // Return the reversed arraylist
        return alist;
    }

    public ArrayList<Card> reverseCardArrayList(ArrayList<Card> alist)
    {
        // Arraylist for storing reversed elements
        // this.revArrayList = alist;
        for (int i = 0; i < alist.size() / 2; i++) {
            Card temp = alist.get(i);
            alist.set(i, alist.get(alist.size() - i - 1));
            alist.set(alist.size() - i - 1, temp);
        }

        // Return the reversed arraylist
        return alist;
    }

    // Iterate through all the elements and print
    public void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }
  //Given a sorted list of ints and returns the sorted list with all pairs brought to one
  public ArrayList<Integer> removePairs(ArrayList<Integer> number){
    ArrayList<Integer> newArray =  new ArrayList<Integer>();
    for(int i = 1; i < number.size()-1; i++){
      if(number.get(i) ==  number.get(i+1)){
        newArray.add(number.get(i));
        i++;
      } else{
        newArray.add(number.get(i));
      }
      
    }
    if(!(newArray.contains(number.get(number.size()-1)))){
        newArray.add(number.get(number.size()-1));
    }
    return newArray;
  }
  
  public ArrayList<Card> mergeSortCards(ArrayList<Card> cards) {
    if (cards.size() <= 1) {
        return cards;
    }

    int mid = cards.size() / 2;
    ArrayList<Card> left = new ArrayList<Card>(cards.subList(0, mid));
    ArrayList<Card> right = new ArrayList<Card>(cards.subList(mid, cards.size()));

    left = mergeSortCards(left);
    right = mergeSortCards(right);

    return mergeCards(left, right);
  }

  private ArrayList<Card> mergeCards(ArrayList<Card> left, ArrayList<Card> right) {
    ArrayList<Card> merged = new ArrayList<Card>();
    int leftIndex = 0;
    int rightIndex = 0;

    while (leftIndex < left.size() && rightIndex < right.size()) {
        if (left.get(leftIndex).getValue() <= right.get(rightIndex).getValue()) {
            merged.add(left.get(leftIndex));
            leftIndex++;
        } else {
            merged.add(right.get(rightIndex));
            rightIndex++;
        }
    }

    while (leftIndex < left.size()) {
        merged.add(left.get(leftIndex));
        leftIndex++;
    }

    while (rightIndex < right.size()) {
        merged.add(right.get(rightIndex));
        rightIndex++;
    }

    return merged;
  }

  public twoVar isFlush(int finder, ArrayList<Card> list){
    int counter = 0;
    ArrayList<Integer> top = new ArrayList<Integer>();
    for(int i = 0; i < list.size(); i++){
      if(finder == (list.get(i)).getSuit()){
        counter++;
        top.add(list.get(i).getValue());
      }
    }
    if(counter >= 5){
      twoVar reTwoVar =  new twoVar(top.get(top.size()-1), true);
      return reTwoVar;
    } else {
      twoVar reTwoVar =  new twoVar(top.get(top.size()-1), false);
      return reTwoVar;
    }
  }

  public ArrayList<Integer> keepDoubles(ArrayList<Integer> ogList){
    ArrayList<Integer> returner = new ArrayList<Integer>();
    ArrayList<Integer> holder =  ogList;
    for(int i = 0; i < ogList.size(); i++){
      holder = new ArrayList<Integer>(ogList);
      holder.remove(i);
      //printList(returner);
      if(holder.contains(ogList.get(i))){
        returner.add(ogList.get(i));
      } 
    }
    return reverseArrayList(mergeSort(returner)) ;
  }

  public ArrayList<Integer> removeTrips(int dontWant, ArrayList<Integer> ogList){
    ArrayList<Integer> returner = new ArrayList<Integer>();
    ArrayList<Integer> holder =  ogList;
    for(int i = 0; i < ogList.size(); i++){
      holder = new ArrayList<Integer>(ogList);
      if(!(holder.get(i) == dontWant)){
        returner.add(holder.get(i));
      } 
    }
    return returner ;
  }

  public twoVar babyTrips(ArrayList<Integer> rank_river){
    Integer hold = 0;
    Boolean holdbool = false;
    for(int i = 0; i < rank_river.size()-2; i++){
      if((rank_river.get(i) ==  rank_river.get(i+1)) && (rank_river.get(i) ==  rank_river.get(i+2))){
        holdbool = true;
        hold  = rank_river.get(i);
        i = i+2;
        twoVar holder  = new twoVar(hold, holdbool);
        //System.out.println(holder.getExists());
        return holder;
      }
    }
    twoVar holder  = new twoVar(hold, holdbool);
    return holder;
  }

  public twoVar babyPair(ArrayList<Integer> rank_river){
    Integer hold = 0;
    Boolean holdbool = false;
    for(int i = 0; i < rank_river.size()-1; i++){
      if((rank_river.get(i) ==  rank_river.get(i+1))){
        holdbool = true;
        hold  = rank_river.get(i);
        i = i++;

        twoVar holder  = new twoVar(hold, holdbool);
        return holder;
      }
    }
    twoVar holder  = new twoVar(hold, holdbool);
    return holder;
  }
}
  

