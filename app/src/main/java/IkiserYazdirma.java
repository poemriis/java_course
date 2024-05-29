import java.util.Scanner;
public class IkiserYazdirma {
    public static void main(String[] args) {
        System.out.println("Klavyeden Bir Sayı Giriniz");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int kontrol = 1;
        while (kontrol < sayi) {
            kontrol = sayi - 2;
            while (sayi == 0) {

                System.out.println(kontrol);
                sayi--;
            }


            System.out.println("Sayılar" + kontrol +"");


        }
    }
}