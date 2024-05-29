import java.util.Scanner;
public class KullaniciDiziElemanSayisi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kişi sayısını giriniz...");
        int eleman = input.nextInt();
        String[] isimler = new String[eleman];
        for (int i = 0; i < eleman; i++) {

            System.out.println((i + 1) + ". Kullanıcının Adını Giriniz: ");
            isimler[i] = input.next();
            int eleman_sayisi =
                    isimler.length;
            if (eleman_sayisi < 10) {
                System.out.println("Eleman Sayısı Çok Az");
            } else if (eleman_sayisi > 20) {
                System.out.println("Eleman Sayısı Çok Fazla");
            } else {
                System.out.println("Eleman Sayısı Yeterli");
            }
        }
    }
}

