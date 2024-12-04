package menu;

import java.io.*;
import java.util.Scanner;

public class ProcesoMenu extends Thread{
    private String inputFile;
    private String outputFile;
    private String numPlato;
    private String nombreHilo;

    public ProcesoMenu(String inputFile, String outputFile, String numPlato, String nombreHilo){

        this.inputFile = inputFile;
        this.outputFile = outputFile;
        this.numPlato = numPlato;
        this.nombreHilo = nombreHilo;
    }

    @Override
    public void run(){
        try {
            Scanner sc = new Scanner(new FileReader(inputFile));
            PrintWriter pw = new PrintWriter(new FileWriter(outputFile));

            while (sc.hasNextLine()){
                String linea = sc.nextLine().trim();
                if (linea.startsWith(numPlato)) {
                    String plato = linea.substring(2).trim();
                    if (plato.equals("PRIMEROS") || plato.equals("SEGUNDOS") || plato.equals("POSTRES")) {
                        System.out.print("");
                    } else {
                        pw.println(plato);
                        System.out.println(nombreHilo + " esta escribiendo " + plato);
                    }
                }
            }

            pw.close();
            sc.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
