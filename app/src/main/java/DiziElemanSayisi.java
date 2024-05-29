import java.util.Scanner;
public class DiziElemanSayisi {
    public static void main(String[] args) {
        //kullanıcı tarafından girilen sayı kadar elamana sahip bir dizi oluşturunuz.
        //dizinin uzunluğunu bul ve ekrana dönüt al
        System.out.println("Kaç tane sayı girişi yapacaksınız?");

        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int[] eleman = new int[sayi];
        System.out.println(eleman.length);
        if (sayi < 10 && sayi > 1) {
            System.out.println("Girilen eleman sayısı az");
        } else if (sayi < 20 && sayi > 10) {
            System.out.println("Girilen eleman sayısı yeterli");

        } else if (sayi==0) {
            System.out.println("0 tane sayı girilemez");

        } else {
            System.out.println("Girilen eleman sayısı fazla");

        }
    }
}
