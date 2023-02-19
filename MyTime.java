/**
 * MyTime - a simple time class
 *
 * Add code to replace the temporary 'return' statements in the methods,
 * and additional parameter checking code in the setTime method, etc.
 * The temporary 'return' statements are needed to compile OK until
 * you replace them with the actual code.
 */
public class MyTime {
    // Instance variables holding the time (in 24 hour universal form).
    private int mHour; // 0 - 23
    private int mMinute; // 0 - 59
    private int mSecond; // 0 - 59

    /**
     * Sets the time value for this MyTime object. If *any* of the parameter
     * values are out of range, the time is set to 00:00:00.
     *
     * @param hour   the hour (0 to 23).
     * @param minute the minute (0 to 59).
     * @param second the second (0 to 59).
     */
    public void setTime(int hour, int minute, int second) {

        // TODO - add parameter checking code, and set the instance variables.
        // If any of the parameters are out of range, set all the instance variables to
        // zero.
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            mHour = hour;
            mMinute = minute;
            mSecond = second;
        } else {
            // myCom: shouldn't say something?
            mHour = mMinute = mSecond = 0;
        }
    }

    /**
     * Returns the hour value represented by this MyTime.
     *
     * @return the hour value of this object as an int.
     */
    public int getHour() {
        return mHour;
    }

    /**
     * Returns the minute value represented by this MyTime.
     *
     * @return the minute value of this object as an int.
     */
    public int getMinute() {
        return mMinute; // TODO - replace
    }

    /**
     * Returns the second value represented by this MyTime.
     *
     * @return the second value of this object as an int.
     */
    public int getSecond() {
        return mSecond; // TODO - replace
    }

    /**
     * Compares this MyTime object against another MyTime object.
     * The result is true if and only if the argument is not null
     * and represents a time that is the same time as represented
     * by this object
     *
     * @param other the object to be compared.
     * @returns true if both objects represent the same time value,
     *          false otherwise.
     */
    public boolean equals(MyTime other) {
        // TODO - add code to return 'true' if 'this' MyTime matches
        // the time values in the 'other' MyTime object, else return false.
        // myCom: I'm not sure.
        // No need for this?
        return (mHour == other.mHour) &&
                (mMinute == other.mMinute) &&
                (mSecond == other.mSecond);

        // return false;
    }
    // ========================================================================================================FIN=================

    /**
     * Returns the time of this MyTime object in HH:MM:SS AM/PM form.
     * Ex: time values of 9,15,0 returns: 9:15:00 AM
     * Ex: time values of 23,30,0 returns: 11:30:00 PM
     *
     * @return the time value represented by this object as a String
     *         formatted as HH:MM:SS AM/PM .
     */
    public String toString() {
        String result = "";
        // format hours
        String hh = "", mm = "", ss = "", ampm = "";
        if (mHour > 0 && mHour <= 12)
            hh = twoDigits(mHour);
        else if (mHour > 12)
            hh = twoDigits(mHour - 12);
        else if (mHour == 0)
            hh = "12";
        mm = twoDigits(mMinute);
        ss = twoDigits(mSecond);
        if (mHour < 12)
            ampm = "AM";
        else
            ampm = "PM";
        result = hh + ":" + mm + ":" + ss + " " + ampm;

        // TODO - add code to format the time in the instance variables
        // into HH:MM:SS AM/PM time (hour ranges from 1 to 12, AM or PM)
        // as a string and return it. Call the twoDigits() method to
        // convert each int value to String.

        return result;
    }

    /**
     * Returns the time of this MyTime object in 24 hour universal form.
     *
     * @return the time value represented by this object as a String
     *         formatted as HH:MM:SS universal time.
     */
    public String toUniversalString() {
        String result = "";
        String hh = "", mm = "", ss = "";
        hh = twoDigits(mHour);
        mm = twoDigits(mMinute);
        ss = twoDigits(mSecond);
        result = hh + ":" + mm + ":" + ss;

        // TODO - add code to format the time in the instance variables
        // into HH:MM:SS universal time (hour ranges from 0 to 23)
        // as a string and return it. Call the twoDigits() method to
        // convert each int value to String.

        return result;
    }

    /**
     * Returns the parameter value as a two digit String (with leading 0 if needed)
     *
     * @return the parameter 'value' formatted as a two digit String
     *         (with leading zero if needed).
     */
    private String twoDigits(int value) {
        String result = "";
        result = String.format("%02d", value);

        // TODO - Use the Integer.toString(int) method to convert
        // 'value' to String format, and add a leading "0" if
        // value is less than 10 in order to return a string with
        // two digits.

        return result;
    }

}
