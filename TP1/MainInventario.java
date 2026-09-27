public class MainInventario{
    public static void main(String[] args) {

        Producto mouse = new Producto("Mouse", "P-1982", 18000.00, 10);
        mouse.venderUnidades(0);
        mouse.reponerStock(5);
        mouse.actualizarPrecio(15000.00);
        mouse.mostrarFicha();

        Producto teclado = new Producto("Teclado", "P-1983", 25000.00, 5);
        teclado.venderUnidades(6);
        teclado.reponerStock(-3);
        teclado.actualizarPrecio(20000.00);
        teclado.mostrarFicha();

        Producto monitor = new Producto("Monitor", "P-1984", 35000.00, 2);
        monitor.venderUnidades(1);
        monitor.reponerStock(2);
        monitor.actualizarPrecio(30000.00);
        monitor.mostrarFicha();

    }
}