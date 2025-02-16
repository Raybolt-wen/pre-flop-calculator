public class Hand {
  Card one;
  Card two;
  public Hand(Card one, Card two){
    this.one = one;
    this.two = two;
  }
  public boolean get_pair(){
    if(one.getValue() == two.getValue()){
      return true;
    } else {
      return false;
    }
  }
  public boolean get_suited(){
    if(one.getSuit() == two.getSuit()){
      return true;
    } else {
      return false;
    }
  }

  public String toString(){
    return "The " + one.getValue() + " of " + one.getSuit() + " and the " + two.getValue() + " of " + two.getSuit();
  } 
}