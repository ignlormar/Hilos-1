public class Simple1 extends Thread {

    private static int count = 0;
    public Simple1(String nombre){
        super(nombre);
    }


    @Override
    public void run(){
        for (int i = 0; i < 1000; i++){
            count++;
        }
    }

    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Simple1 hilo1 = new Simple1("Hilo1");
        Simple1 hilo2 = new Simple1("Hilo2");
        Simple1 hilo3 = new Simple1("Hilo3");
        Simple1 hilo4 = new Simple1("Hilo4");
        Simple1 hilo5 = new Simple1("Hilo5");


        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

        System.out.println(getCount());
    }
}
