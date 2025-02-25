import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class Helper{
  Random rand = new Random();
  //Takes the card value and suit and creates a Card object with int value 
  public int Value_Card_Assigner(String card){
    if(card.equalsIgnoreCase("Ace") || 
       card.equalsIgnoreCase("A")){
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
      System.out.println(number.get(i));
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
  
}
  