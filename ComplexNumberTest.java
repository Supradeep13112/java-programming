import java.util.*;
import java.io.File;

class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber() {
        real = 0;
        imaginary = 0;
    }

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber(ComplexNumber cn) {
        this.real = cn.real;
        this.imaginary = cn.imaginary;
    }

    void add(int real, int imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    void add(ComplexNumber cn) {
        this.real += cn.real;
        this.imaginary += cn.imaginary;
    }
}

public class ComplexNumberTest {
    public static void main(String[] args) throws Exception {
        ComplexNumber[] array = new ComplexNumber[100];
        int index = 0;
        Scanner s = new Scanner(new File("complex_numbers.txt"));

        while (s.hasNextLine()) {
            String line = s.nextLine();
            String numbers[] = line.split(",");
            int real = Integer.parseInt(numbers[0].trim());
            int imaginary = Integer.parseInt(numbers[1].trim());

            array[index] = new ComplexNumber(real, imaginary);
            System.out.println(array[index].real + "+" + array[index].imaginary + "i");
            index++;
        }
        s.close();
        ComplexNumber cn = new ComplexNumber();
        for (int i = 0; i < index; i++)
            cn.add(array[i]);
        System.out.println("Sum: " + cn.real + "+" + cn.imaginary + "i");
    }
}
