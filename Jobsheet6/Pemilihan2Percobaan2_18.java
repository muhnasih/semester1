import java.util.Scanner;

public class Pemilihan2Percobaan2_18 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sudut ");
        int sudut1,sudut2,sudut3 = input.nextInt();
        System.out.println("Masukkan besar sudut A: ");
        int sudutA = input.nextInt();

        System.out.println("Masukkan besar sudut B: ");
        int sudutB = input.nextInt();

        System.out.println("Masukkan besar sudut C: ");
        int sudutC = input.nextInt();


        if (sudutA + sudutB + sudutC == 180) {

            if ((sudutA == 90) || (sudutB == 90) || (sudutC == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
            System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
    }else{

    }
    
    
    input.close ();
    

    }
}
