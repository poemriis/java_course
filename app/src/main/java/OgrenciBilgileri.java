import java.util.Scanner;
import java.util.Arrays;

public class OgrenciBilgileri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kullanicilar = new String[2];
        int[] yazili1 = new int[2];
        int[] yazili2 = new int[2];
        int[] ort = new int[2];
        boolean varyok=false;
        String arananogrenci;

        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "Öğrencinin Adını Giriniz:");
            kullanicilar[i] = input.next();
            System.out.println((i + 1) + "Öğrencinin 1.Notunu Giriniz:");
            yazili1[i] = input.nextInt();
            System.out.println((i + 1) + "Öğrencinin 2.Notunu Giriniz");
            yazili2[i] = input.nextInt();


        } for (int m = 0; m < ort.length; m++) {
            System.out.println(kullanicilar[m] + "isimli öğrencinin ortama notu:" + (yazili1[m] + yazili2[m]) / 2);

        System.out.println("Aramak İstediğiniz Kullanıcıyı Giriniz:");
        arananogrenci=input.next();

        if((arananogrenci.equals(kullanicilar[m]))){
            varyok=true;
            System.out.println(kullanicilar[m]+"isimli öğrencinin notu="+(yazili1[m] + yazili2[m])/2);
             break;}



        }
    }
}
