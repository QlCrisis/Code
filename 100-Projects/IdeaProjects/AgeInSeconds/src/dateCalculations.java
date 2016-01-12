import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


/**
 * Created by QLCrisis on 1/11/2016.
 * code borrowed from http://alvinalexander.com/java/simpledateformat-convert-string-to-date-formatted-parse
 */
public class dateCalculations {

    //this function converts user input to Date and checks for false input.
    public static org.joda.time.LocalDate dateformatter(String s) {
        String expectedPattern = "MM/dd/yyyy";
        //LocalDate formatter = new LocalDate(expectedPattern);
        DateTimeFormatter formatter = DateTimeFormat.forPattern(expectedPattern);
        //try catch to protect from user entering in something that isn't their birthday.
        try
        {
            String userInput = s;
            LocalDate date = formatter.parseLocalDate(userInput);
           // System.out.println("date");
            return date;

        }
        catch(IllegalFieldValueException e)
        {
            //exception will throw if user inputs anything other than in the expecte format.
            e.printStackTrace();
            return null;
        }

    }
}


