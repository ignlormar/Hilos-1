import java.util.Scanner;

public class HiloEjemplo1 extends Thread{
    public HiloEjemplo1(String nombre){
        super(nombre);
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println(getName() + " N " + i);
        }
    }

    public static void main(String[] args){
        HiloEjemplo1 hilo1 = new HiloEjemplo1("Hilo1");
        HiloEjemplo1 hilo2 = new HiloEjemplo1("Hilo2");
        HiloEjemplo1 hilo3 = new HiloEjemplo1("Hilo3");

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
