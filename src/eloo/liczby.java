package eloo;

import java.util.Scanner;

public class liczby {
    public static void main(String[] args) {
        int liczb1;
        int liczba2;
        int liczba3;
        Scanner odczyt = new Scanner(System.in);

        System.out.println("Podaj Liczbe 1");
                    liczb1 = odczyt.nextInt();
        System.out.println("Podaj Liczbe 2");
                    liczba2 = odczyt.nextInt();
        System.out.println("Podaj Liczbe 3");
                    liczba3 = odczyt.nextInt();
        int suma = liczb1+liczba2+liczba3;
        System.out.println("Suma tych liczb to:" + suma);
        if (liczb1 > liczba2) {
            System.out.println("Najwieksza liczba to:" + liczb1);
        }

        else if(liczba2 > liczba3) {
            System.out.println("Najwieksza liczba to:" + liczba2);
        }
        else if(liczba3 > liczba2){
            System.out.println("Najwieksza liczba to:"+liczba3);
        }

        if (liczb1 < liczba2) {
            System.out.println("Najmniejsza liczba to:" + liczb1);
        }

        else if(liczba2 < liczba3) {
            System.out.println("Najmniejsza liczba to:" + liczba2);
        }
        else if(liczba3 < liczba2){
            System.out.println("Najmniejsza liczba to:"+liczba3);
        }
            }
        }

