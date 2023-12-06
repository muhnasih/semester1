import java.util.Scanner;

public class BioskopWithScanner18 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String [][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan Nama:");
            String nama = sc.nextLine();
            System.out.print("Masukkan baris");
            int baris = sc.nextInt();
            System.out.print("Masukkan kolom");
            int kolom = sc.nextInt();

            penonton[baris-1] [kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n)");
            String next = sc.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            }

        }
    }
}