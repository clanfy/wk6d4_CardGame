import java.util.*;

public class Deck {
  private ArrayList<Card> deck;

  public Deck (){
    this.deck = new ArrayList<Card>();
    for (int i = 0; i < 13; i++){
      CardValue cardValue = CardValue.values()[i];

      for (int s = 0; s < 4; s++){
        Card card = new Card (SuitType.values()[s], cardValue);
        this.deck.add(card);
      }
    }
  
// Iterator cardIterator = deck.iterator();
// while (cardIterator.hasNext())
}
 
// public static void main(String[] args) {
//     System.out.println(this.deck); 
// }


}