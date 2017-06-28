import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void computerChooses_shouldBeAString_true() {
  RockPaperScissors testGame = new RockPaperScissors();
  String computerChoice =  testGame.computerChooses();
  assertEquals(true, computerChoice instanceof String);
  }
}
