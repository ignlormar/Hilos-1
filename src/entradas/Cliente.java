package entradas;

public class Cliente extends Thread{
    private String nombre;
    private int entradasPedidas;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.entradasPedidas = (int) (Math.random() * 10) + 1;
    }

    @Override
    public void run(){
        ReservaEntradas.reservaEntrada(nombre, entradasPedidas);
    }
}
