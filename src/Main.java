//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ErrorDate, DateErrorException, ErrorEvent {

        Calendars calendar = new Calendars();
        Event event = new Event(calendar);
        Event event1 = null;
        Event event2 = null;
//January 1, 2022, 0:00.

        try {
            Date beginDate= new Date(01,01,2022,00,10);
            Date endDate1= new Date(8,6,2023,20,59);

            Date beginDate2= new Date(1,1,2000,13,00);
            Date endDate2= new Date(5,1,2005,20,00);

           event1 = new Event("grades",beginDate, endDate1);
           event2 = new Event("sky",beginDate2,endDate2);
        }catch (DateErrorException e){
            System.out.println(e.getMessage());
        }







        try{
            calendar.add(event1);
            calendar.add(event2);
        }catch (ErrorEvent e){
            System.out.println(e.getMessage());
        }

     //  event1 = event.getEventByDate(beginDate,endDate1);
       int result=  calendar.getDaysByMonth(4,2023);

      boolean resul = calendar.RemoveEventByName("skyy");
    }









}