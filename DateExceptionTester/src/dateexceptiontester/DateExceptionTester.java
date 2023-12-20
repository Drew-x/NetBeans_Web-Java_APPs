/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateexceptiontester;

/**
 *
 * @author I-KingDrew-I
 */


import javax.swing.JOptionPane ;
import java.util.Scanner ;

class DateException extends RuntimeException 
{
    // no-argument constructor
    public DateException() 
    {}
    
	 // one-argument constructor
    public DateException(String message) 
    {
        super(message);
    }
}

/**
 * A class to create and manipulate dates on the Gregorian calendar, i.e. any 
 * date since October 15, 1582.  Date objects have a month, day, and year
 *
 * @author Greg
 * Copyright:  Greg Shaw, October 15, 2010
 *
 * Note: For brevity, most methods and variable declarations are not shown
 */
class Date {

    private int day; 		// 1..number of days in the month
    private int month; 		// 1..12
    private int year; 		// >= 1582

    // MONTH_NAMES[1] is "January", MONTH_NAMES[12] is "December"
    private static final String[] MONTH_NAMES = {"", "January", "February",
                         "March", "April", "May", "June","July", "August",
                         "September", "October", "November", "December"};

    // DAYS_IN_MONTH[1] is 31 (January), DAYS_IN_MONTH[12] is 31 (December)
    private static final int[] DAYS_IN_MONTH = { 0, 31, 28, 31, 30, 31, 30,
                                                31, 31, 30, 31, 30, 31 };
   
    /**
     * Creates a date object
     * @param month the month
     * @param day the day
     * @param year the year
     * @throws DateException on attempt to create invalid date
     */
    public Date(int month, int day, int year) {
        // create part of Exception message, in case of illegal date
        String s = month + "/" + day + "/" + year;

        // check for illegal month
        if (month > 12 || month < 1) {
            throw new DateException(s + "\nIllegal month: " + month
                    + "  (Month must be between 1 and 12)");
        }

        // check for year < 1582 or date in 1582 but prior to October 15th
        if ((year < 1582)
                || (year == 1582 && month < 10)
                || (year == 1582 && month == 10 && day < 15)) {
            throw new DateException(s
                    + "  (Earliest legal date is October 15, 1582)");
        }

        // check for February 29th and NOT a leap year
        if (month == 2 && day == 29 && !isLeapYear(year)) {
            throw new DateException(s + "  (" + year + " is not a leap year)");
        }

        // check for all 4 possible illegal day values
        //   1. day is <= 0
        //   2. February of a leap year and day > 29
        //   3. February, NOT a leap year and day > 28
        //   4. day > number of days in the month
        if ((day <= 0)
        	       || (month == 2 && isLeapYear(year) && day > 29)
                || (month == 2 && !isLeapYear(year) && day > 28)
                || (month != 2 && day > DAYS_IN_MONTH[month])) {
            throw new DateException(s + "\nIllegal day: " + day + "\nFor "
                    + (month == 2 ? "February " + year : MONTH_NAMES[month])
                    + ", must be between 1 and "
                    + (isLeapYear(year) && month == 2 ? 29 :
                                                       DAYS_IN_MONTH[month]));
        }

        // here if month, day, and year are all good
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /**
     * Returns the Date in medium format - with month name
     * @return the Date as "month day, year"
     * (E.g. October 15, 1582)
     */
    public String getMediumDate() {
        return MONTH_NAMES[month] + " " + day + ", " + year;
    }
    
    // Is a specified year a leap year?
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

public class DateExceptionTester{

	public static void main(String [] args)
	{
		String input = JOptionPane.showInputDialog("Enter month, day, and year, "
			            + "separated by spaces\nEx: for 4/1/2011, enter 4 1 2011") ;
		while (input != null)
		{
			Scanner inputScan = new Scanner(input) ;
			try
			{
				int month = inputScan.nextInt() ;
				int day = inputScan.nextInt() ;
				int year = inputScan.nextInt() ;
				Date d1 = new Date(month,day,year) ;
				System.out.println("\n" + d1.getMediumDate()) ;
				// statements to process d1 would go here
			}
			catch (DateException e)
			{
				System.out.println() ;
				e.printStackTrace(System.err) ;
			}
			catch (Exception e)
			{
				System.out.println() ;
				e.printStackTrace(System.err) ;
			}
			input = JOptionPane.showInputDialog("Enter month, day, and year, "
			            + "separated by spaces\nEx: for 4/1/2011, enter 4 1 2011") ;
		}
	}
}
