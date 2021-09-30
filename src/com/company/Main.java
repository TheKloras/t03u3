package com.company;

public class Main {

    public static void main(String[] args) {
        int kiekis = 10;
        int teigiamiSkaiciai = 0;
        int suma=1;
        int[] skaiciai = new int[kiekis];
        skaiciai = new int[]{10, -96, 45, 78, 45, 15, -95, -777, -5, 5};
        System.out.println("Skaičiai masyve: " + kiekis);
        for (int i = 0; i < 10; i++) {
            if (skaiciai[i] > 0) {
                System.out.println(sumosSkaiciavimas(skaiciai,suma,i));
                teigiamiSkaiciai++;
            }
        }
        System.out.println("Teigiami skaičiai: " + teigiamiSkaiciai);
    }
    static int sumosSkaiciavimas(int[] skaiciai,int suma,int i){
        suma=suma*skaiciai[i];
        return suma;
    }
}
