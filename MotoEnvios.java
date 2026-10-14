public class MotoEnvios extends Vehiculo {

    public MotoEnvios(String patente, String marca, double costoBaseKm) {
        super(patente, marca, costoBaseKm);
    }

    @Override
    public double calcularCostoViaje(double distanciaKm) {
        return super.calcularCostoViaje(distanciaKm) * 0.85;
    }
}