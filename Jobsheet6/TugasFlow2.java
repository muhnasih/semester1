import java.util.Scanner ;

public class TugasFlow2 {
    public static void main(String[] args) {
        double diskon = 0;

        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan jenis buku:");
        String jenis = sc.nextLine();
        System.out.print("Masukkan jumlah buku:");
        int jumlah = sc.nextInt();

        if (jenis != "kamus" && jenis != "novel") {
            if (jumlah >= 3) {
                diskon = 0.05;
            }
        }else if (jenis == "kamus") {
            if (jumlah <= 2) {

            }
        }
    }
}