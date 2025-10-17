import java.util.*;

public class DecToBin {
    public static void main(String[] args) {
        int n, r, i = 0, e = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        n = s.nextInt();

        int[] a = new int[32]; // max 32 bits for int

        while (n != 0) {
            r = n % 2;
            n /= 2;
            a[i] = r;
            i++;
            e++;
        }

        System.out.print("The binary number: ");
        for (i = e - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }

        System.out.println();
    }
}
