import java.util.Scanner;

/**
 * Created by QLCrisis on 1/11/2016.
 * Program:   FizzBuzz w/ user iniput.
 * Purpose:   Getting gud Scrub.
 *
 */
public class FizzBuzz {

    public static void main(String[] args) {

        /**
         * Program will print "Fizz" "Buzz" on multiples of 3 and 5 respectively.
         *
         */

        //int fizz;
        //int buzz;
        Scanner keyboard = new Scanner(System.in);



        System.out.println("Please enter the first word you'd like to use in a fizz buzz program: \n");
        String first = keyboard.next();

        System.out.println("Please enter the second work you'd like to use:  \n");
        String second = keyboard.next();

        for(int i=1; i<=100; i++){
            if (i%3 ==0 && i%5==0){
                System.out.println(first + " " + second);
            }
            else if (i%3 == 0){
                System.out.println(first);
            }
            else if (i%5 ==0){
                System.out.println(second);
            }
            else {
                System.out.println(i);
            }
            //
            //
        }

    }
}
