import java.util.Scanner;

public class modifikasiPercobaan2_18 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan besar sudut A: ");
        int sudutA = input.nextInt();

        System.out.println("Masukkan besar sudut B: ");
        int sudutB = input.nextInt();

        System.out.println("Masukkan besar sudut C: ");
        int sudutC = input.nextInt();

        

        if (sudutA + sudutB + sudutC == 180) {

            if(sudutA == sudutB && sudutB == sudutC){
                System.out.println("Segitiga Sama sisi");

            }else if ((sudutA == 90) || (sudutB == 90) || (sudutC == 90)){
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            }else if ((sudutA == sudutB || sudutB==sudutC || sudutA==sudutC) && sudutA !=90 && sudutB !=90 && sudutC !=90){
            System.out.println("Segitiga sama kaki");
        }else{

        
            System.out.println("Segitiga Sembarang");
        }
    }else{
      System.out.println("Bukan segitiga");

    }
    input.close ();
    }
    
    
    


}
