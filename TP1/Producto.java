public class Producto {
    public String nombre;
    public String codigo;
    public double precio;
    public int stock;

    public Producto (String nombre, String codigo, double precio, int stock) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;

    }

    public void venderUnidades(int cantidad) {
        if (cantidad > 0){
            if (cantidad < stock){
                stock = stock - cantidad;
                System.out.println("Venta exitosa.");
            } else {
                System.out.println("Stock insuficiente.");
            }
        } else {
            System.out.println("Stock no disponible.");
        }
    }
    
    public void reponerStock(int cantidad) {
        if (cantidad > 0){
            stock = stock + cantidad;
            System.out.println("Stock actualizado.");
        } else {
            System.out.println("Cantidad inválida.");
        }
    }
    public void actualizarPrecio(double precio) { 
        System.out.println("Precio anterior: " + this.precio);
            this.precio = precio ;
            System.out.println("Precio actualizado: " + this.precio);
          }

    public void mostrarFicha() {
        System.out.println("=== Ficha de producto ===");
        System.out.println("Código: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Precio: " + this.precio);
        System.out.println("Stock: " + this.stock);
        System.out.println("==========================");
    }
}