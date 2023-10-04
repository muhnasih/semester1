public class nasihhargabayar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner input =new Scanner(System.in);

        int jmlMasuk, JmlTdkMasuk, TotGaji, gaji, potGaji;
        int gaji=40000, potGaji=25000;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda");
        jmlMasuk=input.input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda");
        JmlTdkMasuk=input.nexInt();

        TotGaji=(jmlMasuk*gaji)-(JmlTdkMasuk*potHGaji);
        System.out.println("Gaji yang anda terima adalah" +TotGaji);

    }
    
}
