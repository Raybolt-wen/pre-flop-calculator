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
}