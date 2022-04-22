public class Time {
    int hour;
    int minute;
    int second;
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    int getHour(){
        return hour;
    }
    int getMinute(){
        return minute;
    }
    int getSecond(){
        return second;
    }
    public void setHour(int newhour){
    hour=newhour;
    }
    public void setMinute(int minute){
    this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    void setTime(int hour,int minute,int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public String toString(){
        return "Time{" + "hour=" + hour + ", minute=" + minute + ", second=" + second + '}';
    }
    public Time nextSecond(){
        ++second;
        if (second>=60){
            second=0;
            ++minute;

        if (minute>=0){
            minute=0;
            ++hour;

        if (hour>=24) {
            hour = 0;
        }
      }
   }
        return this;
    }
    public Time previousSecond(){
        --second;
        if (second<=0){
            second=59;
            --minute;
            if (minute<=0){
                minute=59;
                --hour;
                if(hour<=0)
                    hour=23;
            }
        }
        return this;
    }

    public static void main(String[] args) {
    Time t1 = new Time(00,00,00);
        System.out.println(t1.toString());
        System.out.println(t1.nextSecond());
        System.out.println(t1.previousSecond());
    }
}
