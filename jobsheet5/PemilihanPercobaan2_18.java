import java.util.Scanner;

public class PemilihanPercobaan2_18 {
    public static void main(String [] args) {

    Scanner input00 = new Scanner(System.in);
    System.out.print("Nilai uas   : ");
    float uas = input00.nextFloat();
    System.out.print("Nilai uts  : ");
    float uts = input00.nextFloat();
    System.out.print("Nilai kuis   :  ");
    float kuis = input00.nextFloat();
    System.out.print("Nilai tugas  : ");
    float tugas = input00.nextFloat();

    float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);
    String message = total < 65 ? "Remidi" : "Tidak Remidi";

    System.out.println("Nilai akhir ="   + total + "sehingga" + message);
    }
    }