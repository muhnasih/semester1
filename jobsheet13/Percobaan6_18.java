import java.util.Scanner;

public class Percobaan6_18 {
    static Scanner input = new Scanner(System.in);
    static int p, l, t;

    public static void main(String[] args) {
        System.out.println("Masukkan panjang");
        p = input.nextInt();
        System.out.println("Masukkan lebar");
        l = input.nextInt();
        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        int L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah " + L);

        int vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);
    }

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
}