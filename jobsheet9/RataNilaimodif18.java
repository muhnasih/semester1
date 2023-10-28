import java.util.Scanner;

public class RataNilaimodif18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            
        System.out.print("Masukkan jumlah siswa : ");
        int jumlah = sc.nextInt();

        int[] nilaiMahasiswa = new int[jumlah];
        double total = 0;
        int lulus = 0;
        double sumlulus=0;
        double sumTidakLulus=0;

        for (int i = 0; i < nilaiMahasiswa.length; i++){
            System.out.print("Masukkan nilai  ke-" +(i+1)+" :");
            nilaiMahasiswa[i] = sc.nextInt();
            if (nilaiMahasiswa[i] > 70){
                lulus++;
                sumlulus += nilaiMahasiswa[i];
            }else{
                sumTidakLulus += nilaiMahasiswa[i];
            }
            }

            for(int i=0; i<nilaiMahasiswa.length; i++){
                total += nilaiMahasiswa[i];
            }
            
            double rataLulus = sumlulus / lulus;
            double rataTidakLulus = sumTidakLulus/ (nilaiMahasiswa.length - lulus);

            System.out.println("Rata-rata nilai lulus = " + rataLulus);
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    
        
            sc.close();
       
}
    
}
    

