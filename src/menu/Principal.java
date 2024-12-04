package menu;

public class Principal {
    public static void main(String[] args) throws InterruptedException {
        String inputFile = "src/menu/menu.txt";
        String outputPrimeros = "src/menu/primeros.txt";
        String outputSegundos = "src/menu/segundos.txt";
        String outputPostres = "src/menu/postres.txt";

        Thread hilo1 = new ProcesoMenu(inputFile, outputPrimeros, "1-", "HiloPrimeros");
        Thread hilo2 = new ProcesoMenu(inputFile, outputSegundos, "2-", "HiloSegundos");
        Thread hilo3 = new ProcesoMenu(inputFile, outputPostres, "3-", "HiloPostres");

        hilo1.start();
        hilo2.start();
        hilo3.start();

        hilo1.join();
        hilo2.join();
        hilo3.join();

        System.out.println("Proceso finalizado");
    }
}
