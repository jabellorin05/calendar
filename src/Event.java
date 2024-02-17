public class Event {


    //variables
    private String name;
    private Date Begin,end;

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidData {

       if (name=="")
       throw new InvalidData("The Event name can be empty");


        this.name = name;
    }

    public Date getBegin() {
        return Begin;
    }

    public void setBegin(Date begin) {
        Begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }


    //constructor
    public Event(String name, Date begin, Date end) throws ErrorEvent, InvalidData {


        setName(name);
        setBegin(begin);
        setEnd(end);



      //  throw new ErrorEvent("");
    }


}
