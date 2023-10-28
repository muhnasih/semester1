import java.util.Scanner;

public class Tugas18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya elemen: ");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Masukkan nilai :");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
            if (arr[i] < min) {
                min = arr[i];
            }
            
            sum += arr[i];
        }
        
        double average = (double) sum / n;
        
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + average);
    }
}