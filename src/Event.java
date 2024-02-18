import java.util.ArrayList;
import java.util.Calendar;

public class Event {


    //variables
    private String name;
    private Date begin,end;
    private Calendars calendar=null;
    public Event(Calendars calendar){

        this.calendar=calendar;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) throws ErrorEvent {

       if (name==""){
           name=null;
           throw new ErrorEvent("The Event name can not be empty");

       }


        this.name = name;
    }

    public Date getBegin() {
        return this.begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }


    //constructor
    public Event(String name, Date begin, Date end) throws ErrorEvent, InvalidData {

        try{

            setBegin(begin);
            setEnd(end);
            setName(name);
        }catch (ErrorEvent e){

            System.out.println(e.getMessage());

        }




      //  throw new ErrorEvent("");
    }


    Date EventDuration() throws ErrorDate {
      //calcs the durations of the event
        int dMinutes= getEnd().minute-getBegin().minute;
        int dHours = getEnd().getHour()-begin.getHour();
        int dDays = getEnd().day-begin.getDay();
        int dMonths = getEnd().month-begin.getMonth();
        int dYears = getEnd().year-begin.getYear();

       return new Date(dDays,dMonths,dYears,dHours,dMinutes);


    }

    void DisplayDuration() throws ErrorEvent, ErrorDate {

        System.out.printf("The duration is: Days:%d Months:%d Years:%d Hours:%d Minutes:%d",EventDuration().day,EventDuration().month,EventDuration().year,EventDuration().hour,EventDuration().minute);

    }

    //check if the End date come after begin date



    public boolean isEndAfterBegin() throws ErrorEvent {
        if (getEnd().year < getBegin().year) {
            throw new ErrorEvent("The begin date can not come after end date");
        } else if (getEnd().year == getBegin().year) {
            if (getEnd().month < getBegin().month) {
                throw new ErrorEvent("The begin date can not come after end date");
            } else if (getEnd().month == getBegin().month) {
                if (getEnd().day < getBegin().day) {
                    throw new ErrorEvent("The begin date can not come after end date");
                } else if (getEnd().day == getBegin().day) {
                    if (getEnd().minute < getBegin().minute) {
                        throw new ErrorEvent("The begin date can not come after end date");
                    }
                }
            }
        }
        return true;
    }

    public Event getEventByName(String name){

        ArrayList<Event> list = calendar.GetList();

        for (Event value : list) {

            if (value.getName().equals(name))
                return value;
        }

        return null;
    }



    }



