import java.util.Scanner;

/**
 * Created by QLCrisis on 1/12/2016.
 *
 * Rock paper scissors game using jvm console.
 *
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        //System.out.println(RPSCalc.RPSRand());  //test code for RPSRand();

        Scanner keyboard = new Scanner(System.in);
        String userShoot;


        int i = 0;
        while (i <1){
            System.out.println("This is Rock, Paper, Scissors. Ready to play? \n Rock...Paper..." +
                    "Scissors...Shoot: ");
            userShoot = keyboard.next().toLowerCase();

            System.out.println(RPSCalc.RPSThrow(userShoot));

            System.out.println("\n \n  Would you like to play again? (y/n)");
            String playAgain = keyboard.next();




            switch (playAgain){
                case "yes":
                    System.out.println(RPSCalc.RPSThrow(userShoot)); break;
                case "y":
                    System.out.println(RPSCalc.RPSThrow(userShoot)); break;
                case "no":
                    System.out.println("Thanks for playing."); i++; break;
                case "n":
                    System.out.println("Thanks for playing."); i++; break;
            }
        }

    }
}
