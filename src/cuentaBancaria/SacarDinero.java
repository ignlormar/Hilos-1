package cuentaBancaria;

public class SacarDinero extends Thread{
    private Cuenta cuentaPrincipal;
    private String nombre;
    private int cantidad;

    public SacarDinero(Cuenta cuentaPrincipal, String nombre, int cantidad){
        this.cuentaPrincipal = cuentaPrincipal;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    @Override
    public void run(){
        cuentaPrincipal.RetirarDinero(cantidad, nombre);
    }
}
