public class Camion extends Vehiculo {
    private double capacidadToneladas;

    public Camion(String patente, String marca, double costoBaseKm, double capacidadToneladas) {
        super(patente, marca, costoBaseKm);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double costoBase = super.calcularCostoViaje(distanciaKm);
        return costoBase * (1 + capacidadToneladas * 0.05);
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Capacidad: " + capacidadToneladas + " toneladas");
    }
}