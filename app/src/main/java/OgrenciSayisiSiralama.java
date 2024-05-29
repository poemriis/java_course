import java.util.Arrays;
import java.util.Scanner;

//Kullanıcı tarafından girilen öğrenci notlarının sıralanmış halini ekrana yazdıran uygulamanın kodları 10 kişi
public class OgrenciSayisiSiralama {
    public static void ma12in(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] notlar = new int[10];
        for (int i = 0; i< 10; i++) {
            System.out.println((i + 1) + "->Bir Öğrenci Notu Giriniz ");
            notlar[i]=input.nextInt();}
        Arrays.sort(notlar);

            System.out.println("NOTLARIN SIRALANMIŞ HALİ");
            for (int j=0;j<10;j++){
            System.out.println(notlar[j]);


        }
    }
}
