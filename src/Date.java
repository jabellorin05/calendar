public class Date {

    int day, month, year, hour,minute;


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }


    public Date(int day, int month, int year, int hour, int minute) throws ErrorDate {

        this.day=day;
        this.month=month;
        this.year=year;
        this.hour=hour;
        this.minute=minute;


      //  throw new  ErrorDate("invalid Date");

    }



}
