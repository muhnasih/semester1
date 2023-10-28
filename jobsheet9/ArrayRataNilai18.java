import java.util.Scanner;

public class ArrayRataNilai18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nilaiMahasiswa = new int [10];
        double total = 0;
        double rata2;
        int lulus = 0;
        for (int i = 0; i < nilaiMahasiswa.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+" :");
            nilaiMahasiswa[i] = sc.nextInt();
            if (nilaiMahasiswa[i] >70){
                lulus ++;
            }

        }
         
        for (int i = 0; i< nilaiMahasiswa.length; i++){
            total += nilaiMahasiswa[i];

        }

        rata2 = total / nilaiMahasiswa.length;
        System.out.println("Rata-rata nilai mahasiswa adalah: ");
        System.out.println("Banyak Mahasiswa yang lulus: " + lulus);
    }
    
}
