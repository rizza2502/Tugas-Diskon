import java.util.Scanner;

public class latihan{
    public static void main(String[] args){
    
    double diskon;
    int hargaBarang;
    int totalBarang;
    int totalHarga;

    Scanner scan_aja = new Scanner(System.in);

    System.out.println("Selamat datang di kode menghitung diskon");
    
    System.out.println("input harga Barang: ");
    hargaBarang = scan_aja.nextInt();

    System.out.println("input total barang: ");
    totalBarang = scan_aja.nextInt();

    totalHarga = hargaBarang * totalBarang;

    System.out.println("total harga adalah "+ totalHarga);
    
    System.out.println("input diskon:");
    diskon = scan_aja.nextDouble();
    diskon = diskon / 50 * totalHarga;
     
    double harga_akhir = totalHarga * diskon;

    System.out.println("harga total barang akhir adalah"+ harga_akhir);

    }
}