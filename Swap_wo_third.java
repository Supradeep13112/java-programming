import java.util.*;
public class Swap_wo_third {
    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter 1st number:");
        a=s.nextInt();
        System.out.print("Enter 2nd number:");
        b=s.nextInt();
        System.out.println("Before swapping \n a="+a+"\nb="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print("After swapping \n a="+a+"\nb="+b);
    }
}
