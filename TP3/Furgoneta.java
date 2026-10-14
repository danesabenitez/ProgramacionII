package TP3;
public class Furgoneta extends Vehiculo {
    private boolean tieneRefrigeracion;

    public Furgoneta(String patente, String marca, double costoBaseKm, boolean tieneRefrigeracion) {
        super(patente, marca, costoBaseKm);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        double costoBase = super.calcularCostoViaje(distanciaKm);
        if (tieneRefrigeracion) {
            costoBase += 5000.0;
        }
        return costoBase;
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Refrigeración: " + (tieneRefrigeracion ? "Sí" : "No"));
    }
}