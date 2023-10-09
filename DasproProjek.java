import java.util.Scanner;

public class DasproProjek {
    public static void main(String[] args) {
        Scanner Nilai = new Scanner(System.in);

        String namasiswa;
        int biologi, fisika, kimia, matematika, Bahasaindonesia, Bahasajepang, agama, Pjok, Bahasainggris, Nilaiakhir;

        System.out.println("Namamu");
        namasiswa = Nilai.next();
        System.out.println("biologi");
        biologi = Nilai.nextInt();
        if (biologi < 0 || biologi > 100) {
            System.out.println("Nilai biologi harus antara 0 dan 100");
            return;
        }
        System.out.println("Fisika");
        fisika = Nilai.nextInt();
        if (fisika < 0 || fisika > 100) {
            System.out.println("Nilai fisika harus antara 0 dan 100");
            return;
        }
         System.out.println("matematika");
        fisika = Nilai.nextInt();
        if (fisika < 0 || fisika > 100) {
            System.out.println("Nilai matematika harus antara 0 dan 100");
            return;
        }
         System.out.println("Bahasaindonesia");
        fisika = Nilai.nextInt();
        if (fisika < 0 || fisika > 100) {
            System.out.println("Nilai Bahasaindonesia harus antara 0 dan 100");
            return;
        }
         System.out.println("Bahasajepang");
        fisika = Nilai.nextInt();
        if (fisika < 0 || fisika > 100) {
            System.out.println("Nilai Bahasajepang harus antara 0 dan 100");
            return;
        }
         System.out.println("agama");
        fisika = Nilai.nextInt();
        if (fisika < 0 || fisika > 100) {
            System.out.println("Nilai agama harus antara 0 dan 100");
            return;
        }
         System.out.println("Pjok");
        fisika = Nilai.nextInt();
        if (fisika < 0 || fisika > 100) {
            System.out.println("Nilai Pjok harus antara 0 dan 100");
            return;
        }
        System.out.println("Fisika");
        fisika = Nilai.nextInt();
        if (fisika < 0 || fisika > 100) {
            System.out.println("Nilai Bahasainggris harus antara 0 dan 100");
            return;
        }
       
        // Lanjutkan untuk mata pelajaran lainnya...

        Nilaiakhir = (biologi + fisika + kimia + matematika + Bahasaindonesia + Bahasajepang + agama + Pjok + Bahasainggris) / 9;
        System.out.println("Nilai akhir " + Nilaiakhir);
        Nilai.close();
    }
}