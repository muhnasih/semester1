import java.util.Scanner;

public class WhileKelipatan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        int kelipatan = scan.nextInt();
        int total = 0;
        int counter = 0;
        double rata2;

        int i= 1;
        while ( i <= 50) {
            if (i % kelipatan == 0){
              total += 1;
                counter++;
                 System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
            }else{
                 System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);

            }
        }
        rata2 = total /counter;
        System.out.printf("Rata-rata bilangan %d dari 1 sampai 50 adalah %.2f\n", kelipatan, rata2 );
    }
    }

