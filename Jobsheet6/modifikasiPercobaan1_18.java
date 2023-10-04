import java.util.Scanner;

public class modifikasiPercobaan1_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Tahun: ");
        int tahun = input.nextInt();

        if ((tahun % 4) == 0){
            if ((tahun % 100) == 0){
            if ((tahun % 400 ) == 0){
            System.out.println("Tahun Kabisat");
            }
        }
            if ((tahun % 100) != 0){
                System.out.print("Tahun Kabisat");
            }
            System.out.print("Bukan Tahun Kasibat");

        }else
        System.out.println("Bukan Tahun Kasibat");
    }

}
