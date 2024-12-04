package carrera;

public class Corredor extends Thread{
    private String nombre;

    public Corredor(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void run(){
        for (int i = 0; i <= 1500; i++){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("El corredor " + nombre + "ha terminado.");
    }

}
