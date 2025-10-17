import java.util.Scanner;

class Complex {
    int real,imaginary;
    Complex(){
        real=0;
        imaginary=0;
    }
    Complex(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    Complex(Complex c){
        this.real=c.real;
        this.imaginary=c.imaginary;
    }
   void  ComplexNumberAdd(int real,int imaginary){
        this.real+=real;
        this.imaginary+=imaginary;
       System.out.print("\nComplex Number is:"+real+"+"+imaginary+"i");
    }
    void ObjectComplexNumberAdd(Complex c){
        this.real+=c.real;
        this.imaginary+=c.imaginary;
        System.out.print("\nComplex Number is:"+real+"+"+imaginary+"i");
    }
}
public class ComplexNumber {
    public static void main(String[] args) {
        int real,imaginary;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter real portion:");
        real=s.nextInt();
        System.out.print("Enter imaginary portion:");
        imaginary=s.nextInt();
        Complex c= new Complex();
        c.real=real;
        c.imaginary=imaginary;
        System.out.print("Complex Number is:"+c.real+"+"+c.imaginary+"i");
        c.ComplexNumberAdd(real,imaginary);
        Complex c1=new Complex();
        c1.ObjectComplexNumberAdd(c);
    }
}