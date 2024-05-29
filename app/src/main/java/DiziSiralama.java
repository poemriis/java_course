import java.util.Arrays;
public class DiziSiralama {
    public static void main(String[] args) {
        int[] notlar = {65, 78, 50, 95, 80};
        Arrays.sort(notlar);
        for (int i = 0; i < notlar.length; i++) {
            System.out.println(notlar[i]);
        }
    }
}
