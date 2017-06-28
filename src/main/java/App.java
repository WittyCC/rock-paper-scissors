import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    boolean proceed = true;

    System.out.println("Let's play Rock-Paper-Scissors. Enter your choice or quit:");
    String choice = myConsole.readLine();
    if (choice.contains("q")) {
      proceed = false;
    } else if (choice.contains("r")) {
      String userPlay = "Rock";
    } else if (play.contains("p")) {
      String userPlay = "Paper";
    } else if (play.contains("s")) {
      String userPlay = "Scissors";
    } else {
      return "Pick again.";
    }


    while(proceed == true) {
      RockPaperScissors rockPaperScissors = new rockPaperScissors();
      System.out.println("Computer chose " + pcPlay + ". It's a " + result + "!");
    }
  }
}
