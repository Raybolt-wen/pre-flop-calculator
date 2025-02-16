public class Card {
  int suit;
  int value;
  public Card(int suit, int value){
    this.suit = suit;
    this.value = value;
  }
  public int getSuit(){
    return suit;
  }
  public int getValue(){
    return value;
  }

  public boolean cardEqual(Card one, Card two){
    if (one.getValue() ==  two.getValue() && one.getSuit() ==  two.getSuit()){
      return true;
    } else {
      return false;
    }
  
  }
}