package carrera;

public class Principal {
    public static void main(String[] args) {
        String[] corredores = {"Hicham El Guerrouj", "Noah Ngeny", "Mohamed Farah", "Bernard Lagat", "Rashid Ramzi",
                "Ryan Gregson", "Fermín Cacho", "Teddy Flack"};

        for (String nombre : corredores){
            Corredor corredor = new Corredor(nombre);
            corredor.start();
        }
    }
}
