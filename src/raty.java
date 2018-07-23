import java.util.Scanner;

public class raty {
    public static void main(String[] args) {

        double cena;
        double raty;
        double procent;

        Scanner odczyt = new Scanner(System.in);
        System.out.println("Podaj kwote zakupu");
        cena = odczyt.nextDouble();
        if (cena > 100 && cena < 10000)
        {
            System.out.println("Podaj ilość rat:");
        raty = odczyt.nextDouble();
        if (raty > 6 && raty < 12){
        procent = cena/raty+0.025*cena;
            System.out.println("Wysokosc jednej raty to:"+procent);
        }
        else if(raty > 13 && raty < 24){
            procent = cena/raty+0.05*cena;
            System.out.println("Wysokosc jednej raty to:"+procent);

        }
        else if(raty > 25 && raty < 48){
            procent = cena/raty+0.1*cena;
            System.out.println("Wysokosc jednej raty to:"+procent);

        }
        }
        else {
            System.out.println("Podaj kwote od 100zł do 10000zł");
        }

    }

    }