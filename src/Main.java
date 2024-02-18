//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ErrorDate, InvalidData, ErrorEvent {

        Calendars calendar = new Calendars();
        Event event = new Event(calendar);


        Date beginDate= new Date(25,6,2000,20,59);
        Date endDate1= new Date(8,6,2001,20,59);

        Date beginDate2= new Date(1,1,2000,13,00);
        Date endDate2= new Date(5,1,2005,20,00);

        Event event1 = new Event("grades",beginDate, endDate1);
        Event event2 = new Event("sky",beginDate2,endDate2);




        try{
            calendar.add(event1);
            calendar.add(event2);
        }catch (ErrorEvent e){
            System.out.println(e.getMessage());
        }
         beginDate= new Date(25,6,2000,20,59);
        endDate1= new Date(8,6,2001,20,59);
     //  event1 = event.getEventByDate(beginDate,endDate1);
       int result=  calendar.getDaysByMonth(4,2023);

      boolean resul = calendar.RemoveEventByName("skyy");
    }









}