import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        a=s.nextInt();
        System.out.print("Enter 2nd number:");
        b=s.nextInt();
        System.out.println("Before swapping \n a="+a+"\nb="+b);
        c=a;
        a=b;
        b=c;
        System.out.print("After swapping \n a="+a+"\nb="+b);
    }
}
