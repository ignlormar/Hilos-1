package cuentaBancaria;

public class Cuenta {
    private int saldo;

    public Cuenta(int saldoInicio){
        this.saldo = saldoInicio;
    }

    public synchronized int getSaldo() {
        return saldo;
    }

    public synchronized void restar(int cant){
        saldo -= cant;
    }

    public synchronized void RetirarDinero(int cant, String nombre){
        if (saldo >= cant){
            System.out.println(nombre + " va a retirar " + cant + " euros de la cuenta");
            restar(cant);
            System.out.println("Saldo tras la retirada: " + saldo + " euros");
        } else {
            System.out.println(nombre + ", no puedes retirar mas dinero del que hay en la cuenta (" + saldo + ")");
        }
    }




}
