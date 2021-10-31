package assignment2_1;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate() {
        GregorianCalendar c = new GregorianCalendar();
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate(long elapsedTime) {
        GregorianCalendar c = new GregorianCalendar();
        c.setTimeInMillis(elapsedTime);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void setDate(long elapsedTime) {
        GregorianCalendar c = new GregorianCalendar();
        c.setTimeInMillis(elapsedTime);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH);
        day = c.get(Calendar.DAY_OF_MONTH);
    }
}
