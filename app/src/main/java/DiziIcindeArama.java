import java.util.Arrays;

public class DiziIcindeArama {
    public static void main(String[] args) {
        int[] notlar={40,55,70,89,55,20,100};
        int aranan= Arrays.binarySearch(notlar,55);
        if (aranan<0){
            System.out.println("Değer dizi içerisinde mevcut değildir");
        }else {
            System.out.println("Aranan Değer dizinin-"+aranan+"-indisinde yer almaktadır.");
        }
    }
}
