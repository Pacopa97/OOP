package firstparcialexercises;

/**
 *
 * @author franc
 */
public class Time {
    private int hour,minute,second;
    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
 public Time nextSecond(){
        ++this.second;
        if(this.second>=60){
            this.second = 0;
            ++this.minute;
            if(this.minute>=60){
                this.minute = 0;
                ++this.hour;
                if(this.hour>=24){
                    this.hour = 0;
                }
            }
        }
    return this;
    }
    public Time previousSecond(){
        --this.second;
        if(this.second>=60){
            this.second = 0;
            --this.minute;
            if(this.minute>=60){
                this.minute = 0;
                --this.second;
                if(this.second>=60){
                    this.second = 0;
                }
            }
        }
        return this;
    }
}
