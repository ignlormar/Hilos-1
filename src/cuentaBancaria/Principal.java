package cuentaBancaria;

public class Principal {
    public static void main(String[] args) {
        Cuenta cuentaPrincipal = new Cuenta(500);

        SacarDinero alex = new SacarDinero(cuentaPrincipal, "Alex", 160);
        SacarDinero emi = new SacarDinero(cuentaPrincipal, "Emi", 200);
        SacarDinero enrique = new SacarDinero(cuentaPrincipal, "Enrique", 400);
        SacarDinero pruden = new SacarDinero(cuentaPrincipal, "Pruden", 10);

        alex.start();
        emi.start();
        enrique.start();
        pruden.start();
    }
}
