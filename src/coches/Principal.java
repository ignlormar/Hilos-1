package coches;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Indica el numero de coches que van a correr: ");
        int numCoches = sc.nextInt();
        sc.nextLine();


        Coche[] coches = new Coche[numCoches];
        for (int i = 0; i < coches.length; i++){
            System.out.print("Indica la marca del coche " + (i + 1) + ": ");
            String marca = sc.nextLine();
            coches[i] = new Coche(marca, i + 1);
        }

        for (Coche coche : coches){
            coche.start();
        }

        sc.close();
    }
}
