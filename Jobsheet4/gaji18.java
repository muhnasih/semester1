import java.util.Scanner;

public class gaji18 {
    public static void main(String[] args ){
        Scanner input =new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, TotGaji;
        int gaji=40000, potGaji=25000;
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        jmlTdkMasuk=input.nextInt();
        System.out.println("Masukkan Gaji Perhari Anda");
        gaji=input.nextInt();
        System.out.println("Masukkan Potongan Gaji Perhari");
        potGaji=input.nextInt();


        TotGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);
        System.out.println("Gaji yang anda terima adalah" +TotGaji);
        
    }
}
