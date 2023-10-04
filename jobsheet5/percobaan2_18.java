import java.util.Scanner;

public class percobaan2_18 {
 public static void main (String [] args){
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
    String message = total > 80 ?  "A":
    total >73 && total <80 ?  "B+":
    total >65 && total <73 ?  "B":
    total >60 && total  <65 ? "C+":
    total >50 && total <60 ?  "C":
    total >39 && total <50 ?  "D":
    "E";

    System.out.println("nilai akhir anda adalah " + total + " sehingga nilai huruf anda adalah " + message);



 
 }    

}
