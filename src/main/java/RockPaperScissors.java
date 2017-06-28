import java.util.Random;

class RockPaperScissors {
  public String mPlay;

  public convertToPlay(String pcPlay) {
    // Output for PC choice
    int pcNum = Math.ceil(Math.random() * 3);

    if (pcNum == 1) {
      pcPlay = "Rock";
    } else if (pcNum == 2) {
      pcPlay = "Paper";
    } else if (pcNum == 3) {
      pcPlay = "Scissors";
    }
    return pcPlay;
  }

  public RockPaperScissors(String play) {
    mPlay = play;

    if (userPlay.equals(pcPlay)) {
      result = "DRAW";
    } else if (userPlay == "Rock" && pcPlay == "Paper") {
      result = "LOSS";
    } else if (userPlay == "Rock" && pcPlay == "Scissors") {
      result = "WIN";
    } else if (userPlay == "Paper" && pcPlay == "Rock") {
      result = "WIN";
    } else if (userPlay == "Paper" && pcPlay == "Scissors") {
      result = "LOSS";
    } else if (userPlay == "Scissors" && pcPlay == "Rock") {
      result = "LOSS";
    } else if (userPlay == "Scissors" && pcPlay == "Paper") {
      result = "WIN";
    }
  }
}
