//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ErrorDate, InvalidData, ErrorEvent {

        Date bDate= new Date(25,6,2000,20,59);
        Date bDate2= new Date(8,6,2001,20,59);

        Event event1 = new Event("grades",bDate, new Date(6,5,2005,23,00));
        Event event2 = new Event("pignic",bDate2, new Date(8,10,2001,23,00));
        Calendars calendar = new Calendars();
        Event event = new Event(calendar);
        try{
            calendar.add(event1);
            calendar.add(event2);
        }catch (ErrorEvent e){
            System.out.println(e.getMessage());
        }


        System.out.println(""+event.getEventByName("pignic").getBegin().getDay());
    }





}