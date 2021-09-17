package com.company;

public class Main {

  public static void main(String[] args) {
    int highScore = calculateScore(true, 800, 5, 100);
    System.out.println("Your final score was " + highScore);
    highScore = calculateScore(true, 10000, 8, 200);
    System.out.println("Your final score was " + highScore);

    int highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Jason Bourne", highScorePosition);

    highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Tim Gilbert", highScorePosition);

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("Micheal Jackson", highScorePosition);


  }

  //displayHighScorePosition
  public static void displayHighScorePosition(String name, int position) {
    System.out.println(name + " managed to get into position " + position);
  }

  //calculateHighScorePosition
  public static int calculateHighScorePosition(int score) {
    if (score > 1000) return 1;
    else if (score > 500) return 2;
    else if (score > 100) return 3;
    return 4;
  }

  public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    if (gameOver) {
      int finalScore = score + (levelCompleted * bonus);
      finalScore += 1000;
      return finalScore;
    }
    return -1;
  }


}
