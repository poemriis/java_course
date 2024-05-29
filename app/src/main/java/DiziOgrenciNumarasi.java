import java.util.Scanner;
public class DiziOgrenciNumarasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numaralar =new int[10];
        String[] isimler=new String[10];
        for (int i=0;i<10;i++){
            System.out.println((i+1)+"-Öğrenci İsmini Giriniz");
            isimler[i]=input.next();
            System.out.println((i+1)+"-Öğrenci numaranızı giriniz");
            numaralar[i]=input.nextInt();
        }
    }
}
