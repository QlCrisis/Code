import java.util.Random;

/**
 * Created by QLCrisis on 1/12/2016.
 *
 * this class is going to hold the methods that will use Random to produce a heads or tails result.
 */
public class HTCalc {


        public static String coinToss(){

            //use a random number generator to get a number (odd = heads; even = tails)


            String result;

            Random rand = new Random();
            int randomNum = rand.nextInt(10) + 1;

            if (randomNum%2 ==0 ) {
                result = "Tails";
            }
            else {
                result = "Heads";
            }
            return result;


        }



}
