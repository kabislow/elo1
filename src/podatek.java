import java.util.Scanner;

public class podatek {
    public static void main(String[] args) {
        double dochod;
        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj swoj dochod:");
                dochod = odczyt.nextDouble();

        double podatek1 = dochod*0.18-556.02;
        double podatek2 = 14839.02+0.32*(dochod-85528);
        if(dochod>85528){
            System.out.println(podatek2);
        }
        else
            System.out.println(podatek1);
    }
}
