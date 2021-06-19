package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//	// assining the method to a new variable
//	int highscore = calculateScore(true,800,10,200);
//	System.out.println("Your final Score," + highscore);
//
//	highscore = calculateScore(true,1000,12,250);
//	System.out.println("Your final Score," + highscore);
//
//		// void is used only when we do not want to return anything if we want to return something we have to replace
//		//it with the type of data type
//
//        }
//
//    public static int calculateScore(boolean gameOver,int score,int levelCompleted,int bonus) {
//
//	// void was changed to int in this method as we want to return the final score
//		if (gameOver) {
//			int finalScore = score + (levelCompleted * bonus);
//			finalScore += 2000;
//			return finalScore;
//		}else{
//			return -1;
//			// in programming  terms -1 represents an error or an invalid term.
//		}

    // Challenge 1

    int highScorePosition = calculateHighScorePosition(1500);
    displayHighScorePosition("Tim",highScorePosition);

    highScorePosition = calculateHighScorePosition(900);
    displayHighScorePosition("Mason",highScorePosition);

    highScorePosition = calculateHighScorePosition(400);
    displayHighScorePosition("Timo",highScorePosition);

    highScorePosition = calculateHighScorePosition(50);
    displayHighScorePosition("Riyad",highScorePosition);


    }
    public static void displayHighScorePosition(String playerName,int postionInTable){
    System.out.println(playerName+" managed to get a position in the table "+postionInTable+" in the high score table.");

	}
    public static int calculateHighScorePosition(int playerScore){
//    if(playerScore>=1000){
//        return 1;
//    }else if(playerScore>=500 ){
//        return 2;
//    }else if(playerScore>=100 ){
//        return 3;
//    }
//        return  4;
//
      //Alternate way to code --> if we do not want to use return again and again we can create a variable
        // assume a default value and then keep on updating it on every step.
        // and in the end return the variable.
      int position= 4;
      if(playerScore>=1000){
          position=1;
      }else if(playerScore>=500){
          position = 2;
      }else if(playerScore>=100){
          position = 3;
      }
      return position;
    }

	}

