import java.util.ArrayList;

public class Calendars {
    ArrayList<Event> events = new ArrayList<Event>();
    public Calendars(){}
    public boolean add(Event e) throws ErrorEvent, ErrorDate {

        if (e.getName()!=null && e.getBegin()!=null && e.getEnd()!=null && e.isEndAfterBegin()){
            events.add(e);
            return true;
        }else{
            return false;
        }



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





}
