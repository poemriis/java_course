import java.util.Scanner;
import java.util.Arrays;
public class DiziIcindeElemanKontrolu {
   /* public static void main(String[] args) {
        boolean varyok = false;
        int[] notlar = {45, 65, 65, 98, 75, 12, 97};
        for (int i = 0; i < notlar.length; i++) {
            if (10 == notlar[i]) {
                varyok = true;
                break;
            }
        }
        if (varyok == true) {
            System.out.println("Dizide Var");
        }
        else
        {
            System.out.println("Dizide Yok");
        }
    }
}*/

    //kullanıcı tarafından atanan öğrenci isimlerini diziye atayınız.Varsa kullanıcı bulundu
//öğrenci sayısı 10

   /* public static void main(String[] args)
    {
        boolean isimara = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Öğrenci İsmi Giriniz");
        int eleman = input.nextInt();
        String isimleri = input.next();
        String[] isimler = new String[eleman];
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Öğrenci Adını Giriniz: ");
            isimler[i] = input.next();
            int elemanSayisi = isimler.length;
            if (isimleri == isimler[i]) ;
            isimara = true;
            break;
        }
        if (isimara = true) {
            System.out.println("Bu İsim Listede Var");
        } else {
            System.out.println("Bu İsim Listede Yok");
        }

    }
}*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kullanicilar = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("kullanıcı giriniz");
            kullanicilar[i] = input.next();
        }
        System.out.println("Aramak İstediğiniz Kullanıcıyı Giriniz:");
        String isim = input.next();
        boolean varyok = false;
        for (int i = 0; i < 3; i++) {
            if (kullanicilar[i].equals(isim)) {
                varyok = true;
                break;
            }
        }
        if (varyok == true) {
            System.out.println("Kullanıcı adı var");
        } else {
            System.out.println("Kullanıcı adı yok");


        }
    }}