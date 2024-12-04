package entradas;

public class ReservaEntradas {

    private static int entradasDisponibles = 100;
    private static int entradasVendidas = 0;

    public synchronized static void reservaEntrada(String nombreCliente, int cantidad){
        if (entradasDisponibles >= cantidad) {

            entradasDisponibles -= cantidad;
            entradasVendidas += cantidad;
            System.out.println(nombreCliente + " ha reservado " + cantidad + " entradas");
        } else {
            System.out.println(nombreCliente + " no puede reservar " + cantidad + " entradas porque no quedan");
        }

    }

    public static int getEntradasDisponibles() {
        return entradasDisponibles;
    }

    public static int getEntradasVendidas() {
        return entradasVendidas;
    }
}
