package coches;

import java.util.Random;

public class Coche  extends Thread{
    private String marca;
    private int numero;
    private int recorrido = 0;

    public Coche(String marca, int numero){
        this.marca = marca;
        this.numero = numero;
    }

    @Override
    public void run(){
        Random random = new Random();
        while (recorrido < 500){

            int distancia = random.nextInt(101);
            recorrido += distancia;

            System.out.println("El " + marca + "(#"  + numero + ") ha recorrido " + recorrido + " metros.");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("El " + marca + "(#"  + numero + ") ha terminado");
    }
}
