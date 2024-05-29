public class InWeekAndWeekend {
    public static void main(String[] args) {
        int day = 2;
        if (day <= 5) {
            System.out.print("Haftaiçi  ");
            switch (day){
                case 1:
                    System.out.print( "ve" +" Pazartesi");
                    break;}
            switch (day){
                case 2:
                    System.out.print("ve"+"  Sali");
                    break;}
            switch (day){
                case 3:
                System.out.print("ve"+"  Çarşamba");
                break;}
            switch(day){
                case 4:
                System.out.print("ve"+" Perşembe");
                break;}
            switch(day)
            {case 5:
                System.out.print("ve"+"  Cuma");
                break;}

        }
        else if (day > 5 && day < 8) {
            System.out.print("Haftasonu");
            switch (day){
                case 6:
                    System.out.print("ve"+" cumartesi");
                    break;}
            switch (day){
                case 7:
                    System.out.print("ve"+"  pazar");
                    break;}
        }  else
            System.out.print("Haftanın böyle bir günü yoktur");
    }
}
