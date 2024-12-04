package entradas;

import java.util.TreeMap;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        Thread[] clientes = new Thread[10];

        for (int i = 0; i < 10; i++){
            clientes[i] = new Cliente("Cliente " + (i + 1));
            clientes[i].start();
        }

        Thread.sleep(1000);

        System.out.println("Total de entradas vendidas: " + ReservaEntradas.getEntradasVendidas());
        System.out.println("Total entradas sin vender: " + ReservaEntradas.getEntradasDisponibles());
    }
}
