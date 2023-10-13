import java.util.Scanner;

public class NamaMahasiswa18 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 2; i++){
            System.out.print("Masukkan nama MAHASISWA ke-" + i + " :");
            String nama = sc.next();
        
        System.out.print("Jenis Kelamin (L/P) :");
        String jenisKelamin = sc.next();

        if (jenisKelamin.equalsIgnoreCase("P")){
            System.out.print("Nama: " + nama);
        }else{
            continue;
        }
        }
        sc.close();
    }
}
