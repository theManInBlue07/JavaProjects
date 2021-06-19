package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	int playerScore = calculateScore("Satyam",200);
//	System.out.println("new score is,"+playerScore);
//	calculateScore(900);
//    calculateScore();
//    }
//    public static int calculateScore(String playerName, int score){
//        System.out.println("Player "+playerName+" scored "+score+" points.");
//        return score*200;
//    }
//    //Method Overloading --> using the same method but with diffrent parameters.
//    public static int calculateScore(int score){
//        System.out.println("Unnmaed player scores,"+score);
//        return  score*300;
//    }
//    public static int calculateScore(){
//        System.out.println("No parameter gives no output.");
//        return -1;
  calcFeetAndInchesToCentimetres(6,-90);
  calcFeetAndInchesToCentimetres(100);
    }
  // Challenge 1
    public static double calcFeetAndInchesToCentimetres(double feet, double inches){
        if (feet<0||((inches<0) || (inches>12))){
            System.out.println("Invalid parameters ");
            return -1;
        }
        double centimetres = (feet*12)*2.54;
        centimetres += (inches*2.54);
        System.out.println(feet+"feets,"+inches+"Inches="+centimetres+"cm.");
        return centimetres;

    }
    public static double calcFeetAndInchesToCentimetres(double inches){
        if (inches<0){
            System.out.println("Invalid parameters ");
            return -1;
        }
        double feet =(int) (inches/12);
        double remainderInches = (int)(inches%12);
        System.out.println(feet+"feets,"+remainderInches+"inches");
        return calcFeetAndInchesToCentimetres(feet, remainderInches);
    }
}
