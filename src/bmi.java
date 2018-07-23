import java.util.Scanner;

public class bmi {

    public static void main(String[] args) {
        double waga;
        double wzrost;

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj swoją wage:");
            waga = odczyt.nextDouble();
        System.out.println("Twoja waga to:"+waga);
        System.out.println("Podaj swój wzrost:");
            wzrost = odczyt.nextDouble();
        System.out.println("Twoj wzrost to:"+wzrost);

        double wzrostkon = wzrost/100;
        double bmi = waga/(wzrostkon*wzrostkon);

            System.out.println("Twoje BMI to:"+bmi);
        if(bmi < 24.9 && bmi > 18.5){
            System.out.println("Waga prawidlowa");
        }
        else if(bmi <18.5){
            System.out.println("niedowaga");
        }
        else if(bmi > 24.9){
            System.out.println("nadwaga");
        }

    }

}
