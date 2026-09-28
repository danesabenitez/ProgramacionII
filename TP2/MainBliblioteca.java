package TP2;

public class MainBliblioteca {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El Precio de la Pasión", "Gabriel Rolón", "9788497593794");

        Libro libro2 = new Libro("Cara a Cara", "Gabriel Rolón", "9780439023481", 3, 32000.0);

        Libro libro3 = new Libro("La Odisea", "Homero", "9780141439518", 2, 85000.0);

        Libro libroInvalido = new Libro("", "Autor desconocido", "ISBN-000", 1, 40000.0);

        System.out.println("Título obtenido: " + libroInvalido.getTitulo());

        double precioAnterior = libro1.getPrecioReposicion();

        boolean precioAceptado = libro1.setPrecioReposicion(-100.0);

        System.out.println("¿Se aceptó el precio -100.0? " + precioAceptado + " (se mantiene el precio anterior)");

        if (libro1.getPrecioReposicion() == precioAnterior) {
            System.out.println("El precio anterior se mantuvo correctamente.");
        }

        libro1.mostrarFicha();
        libro2.mostrarFicha();
        libro3.mostrarFicha();

        boolean prestamo1 = libro1.prestar();

        if (prestamo1) {
            boolean prestamo2 = libro1.prestar();

            if (!prestamo2) {
                System.out.println("El segundo préstamo fue rechazado correctamente.");
            }
        }

        libro1.devolver();

        double precioViejo = libro1.getPrecioReposicion();

        boolean precioActualizado = libro1.setPrecioReposicion(18000.0);

        if (precioActualizado) {
            System.out.println("Precio de reposición actualizado de \"" + libro1.getTitulo() + "\": $" + precioViejo + " -> $" + libro1.getPrecioReposicion());
        }
    }       
}
