public class ContohTipeDataNoAbsen {
  public static void main(String [] args) {
    char golonganDarah ='A' ;
    byte jarak = (byte) 130;
    short jumlahPendudukDalamSatuDusun = 1025;
    float suhu = 60.50f;
    double berat = 0.5467812345;
    long saldo = 15000000;
    int angkaDesimal = 0x10;

    System.out.println("Golongan darah\t:" + golonganDarah);
    System.out.println("Jarak\t: " + jarak);
    System.out.println("Jumlah penduduk dalam satu dusun\t: " + jumlahPendudukDalamSatuDusun);
    System.out.println("Suhu\t: " + suhu);
    System.out.println("Berat\t" + (float) berat);
    System.out.println("Saldo\t:" + saldo);
    System.out.println("Angka desimal\t:" + angkaDesimal);

  }
}
