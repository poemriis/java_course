import java.util.Arrays;
import java.util.Scanner;
public class MuvekkilDosyaNumarasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] müvekkiller = new String[2];
        int[] dosyanum = new int[2];
        String[] durusmayeri = new String[2];
        int arananmuvekkil;
        boolean varyok = false;

        for (int i = 0; i < 2; i++) {
            System.out.println((i + 1) + "Müvekkil İsmini Giriniz:");
            müvekkiller[i] = input.next();
            System.out.println((i + 1) + "Duruşma Yeri Bilgisini Girinfgiz:");
            durusmayeri[i] = input.next();
            System.out.println((i + 1) + "Dosya Numarasını Giriniz");
            dosyanum[i] = input.nextInt();
        }
        for (int m = 0; m < dosyanum.length; m++) {
            System.out.println("Aramak İstediğiniz Müvekkilin Dosya Numarasını Giriniz:");
            arananmuvekkil = input.nextInt();
            if (arananmuvekkil == dosyanum[m]) {
                varyok = true;
                System.out.println("KAYITLI"+"müvekkil ismi:" + müvekkiller[m] + "müvekkil dosya numarası:" + dosyanum[m] + "duruşma yeri" + durusmayeri[m]);
                break;
            } else {
                System.out.println("Müvekkil Kayıtlı Değil");
            }
        }
    }}


