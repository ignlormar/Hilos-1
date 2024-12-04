public class GenerarNumeros {
    public static void main(String[] args) throws InterruptedException {


        Thread hiloPares = new Thread(() -> {
            for (int i = 0; i < 20; i++){
                if (i % 2 == 0){
                    System.out.println("Par: " + i);
                }
            }
        });

        Thread hiloImpares = new Thread(() -> {
            for (int i = 0; i < 20; i++){
                if (i % 2 != 0){
                    System.out.println("Impar: " + i);
                }
            }
        });

        hiloPares.start();
        hiloImpares.start();

        hiloPares.join();
        hiloImpares.join();
    }
}
