public class Jugador {
    private String nombre;
    private int dorsal;
    private int goles;

    public Jugador(String nombre, int dorsal, int goles){
        if (nombre == null || nombre.isBlank()){
            System.out.println("Nombre no válido. Se asignó \"Sin nombre"\ por defecto.");
            this.nombre = "Sin nombre";    
        } else {
            this.nombre = nombre;
        }
        
        if (dorsal <= 0){
            System.out.println("Cantidsd no válida. Se asignó 99 por defecto.");
            this.dorsal = 99;
        } else {
            this.dorsal = dorsal;
        }
        
        if (goles < 0){
            System.out.println("Cantidad no válida. Se asignó 0 por defecto.");
            this.goles = 0;
        } else {
            this.goles = goles;
        }
        
        

    }
}