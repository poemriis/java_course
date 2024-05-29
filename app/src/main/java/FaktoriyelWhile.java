import java.util.Scanner;
public class FaktoriyelWhile {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Klavyeden Faktoriyeli Alınacak Sayıyı Giriniz");
        int sayi = input.nextInt();
        int facto = 1;
        int sayac = 1;
        while (sayac <= sayi) {

            facto = facto * sayac;
            sayac++;
        }
        System.out.println("Sonuc" + facto);

    }
}
