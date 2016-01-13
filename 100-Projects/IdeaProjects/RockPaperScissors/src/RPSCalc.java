import java.util.Random;

/**
 * Created by QLCrisis on 1/12/2016.
 */
public class RPSCalc {

    //
    public static String RPSRand(){

        String result = null;


        Random rand = new Random();
        int randomNum = rand.nextInt(3) + 1;

        if (randomNum == 1){
            result = "rock";
        }
        else if (randomNum == 2){
            result = "paper";
        }
        else if (randomNum == 3){
            result = "scissors";
        }

        return result;
    }


    public static String RPSThrow(String s){
        String randShoot = RPSRand();

        String result = "You need to enter Rock Paper or Scissors";

        switch (s) {
            case "rock":
                if (randShoot == "rock") {
                    result = "Your opponent threw Rock. It's A Tie!";
                    break;
                } else if (randShoot == "paper") {
                    result = "Your opponent threw Paper. You lose!";
                    break;
                } else result = "Your opponent threw Scissors. You Win!";
                break;


            case "paper":
                if (randShoot == "rock") {
                    result = "Your opponent threw Rock. You Win!";
                    break;
                } else if (randShoot == "paper") {
                    result = "Your opponent threw Paper. It's a Tie!";
                    break;
                } else result = "Your opponent threw Scissors. You lose!";
                break;

            case "scissors":
                if (randShoot == "rock") {
                    result = "Your opponent throw Rock. You lose!";
                    break;
                } else if (randShoot == "paper") {
                    result = "Your opponent threw Paper. You win!";
                    break;
                } else result = "Your opponent threw Scissors. It's a Tie";
                break;


        }
        return result;
    }

}
