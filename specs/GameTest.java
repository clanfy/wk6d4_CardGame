import game.*;
import static org.junit.Assert.*;
import org.junit.*;

public class GameTest{

  Game game;
  Deck deck;
  Player player1;
  Player player2;

  @Before
  public void before(){
    game = new Game();
    player1 = new Player("Cookie");
    player2 = new Player("Martin");
  }

  @Test
  public void hasDeckof52(){
    assertEquals(52, game.getDeck().size());
  }

}