import game.*;
import static org.junit.Assert.*;
import org.junit.*;

public class CardTest{

  Card card;

  @Before
  public void before(){
    card = new Card(SuitType.CLUBS, CardValue.THREE);
  }

  @Test
  public void canGetSuit(){
    assertEquals(SuitType.CLUBS, card.getSuit());
  }

  @Test
  public void canGetValue(){
    assertEquals(CardValue.THREE, card.getCardValue());
  }
}