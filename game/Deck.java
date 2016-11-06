package game;
import game.*;
import java.util.ArrayList;
// import java.util.Collections;


public class Deck {

    private ArrayList<Card> deck;

    public Deck(){
      this.deck = new ArrayList<Card>();
    }

    public void buildDeck(){
      for (int i = 0; i < 13; i++) {
        CardValue cardValue = CardValue.values()[i];
        for (int s = 0; s < 4; s++) {
          Card card = new Card (SuitType.values()[s],cardValue);
          this.deck.add(card);
        }
      }
    }


  //   public void buildDeck(){
  //   for (int i = 0; i < 13; i++){
  //     CardValue cardValue = CardValue.getCardValue()[i];

  //     for (int s = 0; s < 4; s++){
  //       Card card = new Card (SuitType.getSuitValue()[s], cardValue);
  //       this.deck.add(card);
  //     }
  //   }
  // }

  public ArrayList<Card> getDeck(){
    return this.deck;
  }
  


}