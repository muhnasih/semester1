import java.util.Scanner;

public class HargaBayar18 {
   public static void main(String[] Args){
     Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHalBuku ;
        String merkBuku; 
        double diskon, total, bayar, jmlDis;
        
        System.out.print("Masukkan Merk Buku\t\t\t : ");
        merkBuku = input.nextLine();
        System.out.print("Masukkan Jumlah halaman buku\t\t : ");
        jmlHalBuku = input.nextInt();
        System.out.print("Masukkan harga buku yang dibeli\t\t : ");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah buku yang dibeli\t : ");
        jumlah = input.nextInt();
        
        total = harga*jumlah;
        System.out.println("Total harga adalah\t\t\t : " +total);

        System.out.print("masukkan diskon(persen)\t\t\t : ");
        diskon = input.nextInt();
        
        jmlDis = (total*diskon)/100;

        bayar = total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah\t : " +jmlDis );
        System.out.println("Jumlah yang harus dibayar adalah\t : " + bayar);
    }
}
