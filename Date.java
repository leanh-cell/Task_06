public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    public int getMonth()
    {
        return this.month;
    }
    public int getDay()
    {
        return day;
    }
    public int getYear()
    {
        return year;
    }
    public void setDay(int day)
    {
        this.day=day;
    }
    public void setMonth(int month)
    {
        this.month=month;
    }
    public void setYear()
    {
        this.year=year;
    }
    public void setDate(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;

    }
    public String toString() {
       if (day < 10 && month<10)
        {
             return  "0"+day+"/"+"0"+month+"/"+year;
        }
       else
        {
            return day+"/"+month+"/"+year;
        }

    }
    public static void main(String[] args)
    {
        Date e = new Date(1,1,1900);
        Date e1 = new Date(31,12,9999);
        System.out.println(e);
        System.out.println(e1);
    }
}
