import java.util.Scanner;

public class PemilihanPercobaan3_18 {
    public static void main(String [] args) {
  Scanner input03 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;
        System.out.print("Masukkan angka pertama: ");
        angka1 = input03.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input03.nextDouble();
        System.out.print("Masukkan operator (+  - * / ) : ");
        operator = input03.next().charAt(0);

        switch(operator){
            case'+':
            hasil = angka1 + angka2 ;
            System.out.print(angka1 + " + " + angka2 + " = " + hasil);
            break;

            case'-':
            hasil = angka1 - angka2 ;
            System.out.print(angka1 + " - " + angka2 + " = " + hasil);
            break;

            case'*':
            hasil = angka1 * angka2 ;
            System.out.print(angka1 + " * " + angka2 + " = " + hasil);
            break;

            case'/':
            hasil = angka1 / angka2 ;
            System.out.print(angka1 + " / " + angka2 + " = " + hasil);
            break;
        }
    }
}
