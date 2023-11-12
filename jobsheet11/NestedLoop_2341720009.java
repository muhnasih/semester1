import java.util.Scanner;

public class NestedLoop_2341720009 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] temps = new int[3][7];
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            int sum = 0;
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                sum += temps[i][j];
            }
            double avg = (double) sum / temps[0].length;
            System.out.println("Rata-rata: " + avg);
        }
    }
}