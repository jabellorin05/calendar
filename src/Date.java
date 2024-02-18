public class Date {

    int day, month, year, hour,minute;

//January 1, 2022, 0:00.
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

//January 1, 2022, 0:00.
    public Date(int day, int month, int year, int hour, int minute) throws ErrorDate, DateErrorException {

        if (year<=2022){
            if(month==1){
                if (hour==0){
                    if(minute==0){
                        day=0;
                        month=0;
                        year=0;
                        throw new DateErrorException("The date can not be before January 1, 2022, 0:00. ");
                    }
                }
            }
        }

        this.day=day;
        this.month=month;
        this.year=year;
        this.hour=hour;
        this.minute=minute;


      //  throw new  ErrorDate("invalid Date");

    }



}
