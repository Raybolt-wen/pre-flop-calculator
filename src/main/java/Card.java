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

  public boolean cardEqual(Card two){
    return((this.getValue() == two.getValue()) && (this.getSuit() == two.getSuit()));
      }
  
  public void printCard(){
    System.out.println(this.getSuit() + "of " + this.getValue());
  }
}