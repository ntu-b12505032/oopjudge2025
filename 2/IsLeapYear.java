public class IsLeapYear {
    /**
     * Determine the given year whether is a leap year
     * leap year rule:
     * Every year that is exactly divisible by 400
     *  is a leap year.
     * Every year that is exactly divisible by 4
     *  but not by 100
     *  is a leap year.
     *
     * @param year checking year
     * @return return true if the year is a leap year, else return false
     */
    public boolean determine(int year){
        if(year % 400 == 0)
            return true;
        else if(year % 100 == 0)
            return false;
        else if(year % 4 == 0)
            return true;
        else
            return false;
    }
}
