import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import java.util.Date;

import java.util.Scanner;




/**
 * Created by QLCrisis on 1/11/2016.
 */
public class AgeInSeconds {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("This program will tell you how old you are in days!\n" +
                "Enter your date of birth (mm/dd/yyyy): ");

        String userBDay = keyboard.next();
        System.out.println("input today's date:");
        String currentDate = keyboard.next();

        dateCalculations.dateformatter(userBDay);

        LocalDate date1 = dateCalculations.dateformatter(userBDay);

        LocalDate date2 = dateCalculations.dateformatter(currentDate);

        int days = Days.daysBetween(date1, date2).getDays();

        System.out.println(days);


    }
}
