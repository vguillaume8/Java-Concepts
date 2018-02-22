import java.util.*;
/** 
    Domain (every TimeOfDay object has the following two parts)
    integer hr;
    integer min;
    invariant: 0 <= hr <= 23 (a version of military time in which midnight is 0) and 0 <= min <= 59
*/
public abstract class TimeOfDayADT {
    protected Calendar clock;
    /** 
        post: hr == the current clock hour for the USA Central Time Zone
        and min == the currnet clock minutes for the USA Central Time Zone
    */
    public TimeOfDayADT() {
        clock = now();
    }
    /**
         post: result == the current clock time for Central Time in the USA 
    */
    protected Calendar now() {
        final int localTimeOffset = -6; // offset for the Central Time Zone, USA
        String[] ids = TimeZone.getAvailableIDs(localTimeOffset*60*60*1000);
        SimpleTimeZone localTimeZone = new SimpleTimeZone(localTimeOffset*60*60*1000, ids[0]);
        localTimeZone.setStartRule(Calendar.APRIL, 1, Calendar.SUNDAY, 2*60*60*1000);
        localTimeZone.setEndRule(Calendar.OCTOBER, -1, Calendar.SUNDAY, 2*60*60*1000);
        return new GregorianCalendar(localTimeZone);
    }                                                                                          
    /** 
        post: hr < 12 implies result == hr
        and hr >= 12
        implies result == hr-12
    */
    public abstract int hour();
    // post: result == min
    public abstract int minute();
    // post: result == (hr > 12)
    public abstract boolean isPM();
    /** 
        modifies: hr
        post: hr@pre < 23 implies hr == hr@pre + 1
              and hr@pre == 23 implies hr == 0
    **/
    public abstract void incHour();
    /**
        modifies: min
        post: min@pre < 59 implies min == min@pre + 1
        and (min@pre == 59) implies min == 0)
     */
     public abstract void incMinute();
}