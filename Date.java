public class Date{
    private int month;
    private int day;
    private int year;


    //constructor
    public Date(int month, int day, int year){
    }
    public void seDay(int day){
        this.day = day;
    }
    public int getDay(){
        return day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public int getMonth(){
        return month;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getyear(){
        return year;
    }

    public String displayDate(){
        return day + "/" + month + "/" + year;
    }

}
