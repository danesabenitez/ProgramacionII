public class MainFlota {
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[3];

        flota[0] = new Camion("AA123BB", "Scania", 200.0, 10.0);
        flota[1] = new Furgoneta("CD456EF", "Renault", 120.0, true);
        flota[2] = new MotoEnvios("A123BCD", "Honda", 80.0);

        double distancia = 150.0;
        double costoTotalFlota = 0.0;

        System.out.println("Despacho y cálculo de viajes de la flota");

        for (Vehiculo v : flota) {
            v.mostrarFicha();
            
            double costoViaje = v.calcularCostoViaje(distancia);
            System.out.println("Costo viaje (" + distancia + " km): $" + costoViaje);
            
            costoTotalFlota += costoViaje;
        }

        System.out.println("----------------------------------------");
        System.out.println("Costo total de la flota: $" + costoTotalFlota);
    }
}