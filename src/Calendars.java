import java.util.ArrayList;

public class Calendars {
    ArrayList<Event> events = new ArrayList<Event>();
    Event event = new Event(this);
    int [] monthsWith31Days = {1,3,5,7,8,10,12};

    int [] monthsWith30Days = {4, 6, 9, 11};
    public Calendars(){}
    public boolean add(Event e) throws ErrorEvent, ErrorDate {

        if (e.getName()!=null && e.getBegin()!=null && e.getEnd()!=null && e.isEndAfterBegin()){
            events.add(e);
            return true;
        }else{
            return false;
        }



    }

    public boolean RemoveEventByName(String name) {

        for (Event event : events) {

            if (event.getName().equals(name)) {
                events.remove(event);
                return true;
            }


        }
        return false;
    }

    public ArrayList<Event> GetList(){

        return events;
    }
    public boolean remove(String name){return false;}
    public String searchEvent(Date d){return "";}
    public Date startDate(String name) throws ErrorCalendar {

        return null;
    }
    public Date endDate(String name) throws ErrorCalendar {



        return null;
    }
    public boolean planned(String name){

        return false;
    }

    public  boolean isLapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //array to know which months have 30 or 31 days


    public int getDaysByMonth(int month , int year){

        for (int value : monthsWith31Days){
            if (value==month){
                return 31;
            }
        }
         if (month==2) {
            if (isLapYear(year))
                return 29;
            else return 28;
        }else {
            return 30;
        }



    }


}
