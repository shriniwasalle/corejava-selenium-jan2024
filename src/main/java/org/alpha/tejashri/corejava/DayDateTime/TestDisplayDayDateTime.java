package org.alpha.tejashri.corejava.daydatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestDisplayDayDateTime {

    public static void main(String[] args) {

        //1. To display the current date
        //LocalDate is a class in java.time
        //create the object of LocalDate class, in that class now() is method
        LocalDate date = LocalDate.now();
        System.out.println("Current Date : " + date);  //Display the current date

        //2. To display the current time
        //LocalTime is a class in java.time
        //create the object of LocalTime class, in that class now() is method
        LocalTime time = LocalTime.now();
        System.out.println("Current Time : " + time);

        //3. To display the current date and time
        //LocalDateTime is a class in java.time
        //create the object of LocalDateTime class, in that class now() is method
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before formatting : Current Date Time : " + dateTime);

        /*4. Formatting Date and Time
        Different Types of formats:
        yyyy-MM-dd--> 1988-09-29
        dd/MM/yyyy--> 29/09/1988
        dd-MMM-yyyy--> 29-Sep-1988
        E, MMM dd yyyy--> Thu, Sep 29 1988
        HH:mm:ss--> 19:48:40 --> 24hr format
        hh:mm:ss--> 07:45:52 --> 12hr format
        */

        //DateTimeFormatter is class in java.time.format
        //create the object of DateTimeFormatter class, in that class ofPattern() is method
        DateTimeFormatter formatDT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");//24-04-2024 19:48:40
        //DateTimeFormatter formatDT = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");//24/04/2024 07:45:52

        //format() is method in LocalDateTime class
        String formattedDT = dateTime.format(formatDT);
        System.out.println("After formatting : Current Date Time : " + formattedDT);
    }
}
