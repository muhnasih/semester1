public class BankNoAbsen {
    public static void main(String [] args) {
        int jml_tabungan_awal, lama_menabung;
        double prosentase_bunga =0.02, bunga, jml_tabungan_akhir;
        System.out.println("masukan jumlah tabungan awal anda");
        jml_tabungan_awal = bank.nextInt();
        System.out.println("masukan lama menabung anda");
        lama_menabung= bank.nextInt();
        
        bunga= lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;
        
        System.out.println("Bunga adalah" +bunga);
        System.out.println("jumlah tabungan akhir anda adalah " +jml_tabungan_akhir);


    }
}
