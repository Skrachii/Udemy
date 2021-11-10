package Udemy;

public class Player {
    public static void main(String[] args) {
        int HighScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("Stefan", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Milen", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Emo", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("VLadi", HighScorePosition);

    }

    public static void displayHighScorePosition(String Name, int Position) {
        System.out.println(Name + " managed to get into " + Position + " position");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
         return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
         return 2;
        } else if (playerScore > 100 && playerScore < 500) {
          return 3;
        } else {
           return 4;
        }
    }
}
