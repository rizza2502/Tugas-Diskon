
import java.util.Scanner;

public class latihan2{
    public static void main(String[] args) {
        int jam_kerja;
        int tarif_per_jam;
        double pajak = 10.00;
        double bruto;
        double pembagi = 10;
        double hasil_akhir;
        double netto;
        Scanner scan  = new Scanner(System.in);

        //BRUTO JAM KERJA * TARIF PER JAM
        //NETTO * BRUTO KALI 10 PERSEN

        System.out.println("berapa lama jam kerja nya: ");
        jam_kerja = scan.nextInt();
        System.out.println("berapa tarif per jam nya: ");
        tarif_per_jam = scan.nextInt();
        bruto = jam_kerja * tarif_per_jam;
        System.out.println("bruto adalah: "+bruto);
        pembagi = pembagi / 100;
        netto = bruto * pembagi;
        System.out.println("netto adalah: "+ netto);
        hasil_akhir = bruto - netto;
        System.out.println("hasil akhir adalah: "+hasil_akhir);


    }
}