import java.util.Scanner;
class timeinput {
    int hours, minutes, seconds;
    timeinput (){
        hours=0;
        minutes=0;
        seconds=0;
    }
    timeinput (int hours,int minutes,int seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    timeinput time (timeinput t1, timeinput t2){
        timeinput t3=new timeinput ();
        t3.hours=t1.hours+t2.hours;
        t3.minutes=t1.minutes+t2.minutes;
        t3.seconds=t1.seconds+t2.seconds;
        if(t3.seconds>=60){
            t3.seconds-=60;
            t3.minutes+=1;
        }
        if(t3.minutes>=60){
            t3.minutes-=60;
            t3.hours+=1;
        }
        return t3;
    }
}
public class Timestamp {
    public static void main (String [] args){
        int Hours, Minutes, Seconds;
        Scanner s= new Scanner (System.in);
        System.out.print("Enter hours:");
        Hours=s.nextInt();
        System.out.print("Enter minutes:");
        Minutes=s.nextInt();
        System.out.print("Enter seconds:");
        Seconds=s.nextInt();
        s.close();
        timeinput T1= new timeinput ();
        timeinput T2=new timeinput (Hours, Minutes, Seconds );
        timeinput T3=new timeinput ();
        T3=T3.time(T1,T2);
        System.out.print("Time is "+T3.hours+":"+T3.minutes+":"+T3.seconds);
    }
}