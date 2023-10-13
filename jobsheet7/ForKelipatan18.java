import java.util.Scanner;

public class ForKelipatan18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        int kelipatan = scan.nextInt();
        int total = 0;
        int counter = 0;

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0){
              total += 1;
                counter++;
                 System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
                 System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
            }
        }
    }
    }