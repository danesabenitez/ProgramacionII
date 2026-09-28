package TP2;

public class Libro {
    private final String titulo;
    private final String autor;
    private final String isbn;
    private int copiasDisponibles;
    private double precioReposicion;

    public Libro(String titulo, String autor, String isbn, int copiasDisponibles, double precioReposicion) {
        if (titulo == null || titulo.isBlank()) {
            System.out.println("Título inválido, se usó \"Sin título\" por defecto.");
            this.titulo = "Sin título";
        } else {
            this.titulo = titulo;
        }
        if (autor == null || autor.isBlank()) {
            System.out.println("Autor inválido, se usó \"Autor desconocido\" por defecto.");
            this.autor = "Autor desconocido";
        } else {
            this.autor = autor;
        }
        if (isbn == null || isbn.isBlank()) {
            System.out.println("ISBN inválido, se usó \"ISBN pendiente.\" por defecto.");
            this.isbn = "ISBN pendiente.";
        } else {
            this.isbn = isbn;
        }
        if (copiasDisponibles < 0) {
            System.out.println("Número de copias inválido, se usó 0 por defecto.");
            this.copiasDisponibles = 0;
        } else {
            this.copiasDisponibles = copiasDisponibles;
        }
        if (precioReposicion <= 0) {
            System.out.println("Precio de reposición inválido, se usó 15000.0 por defecto.");
            this.precioReposicion = 15000.0;
        } else {
            this.precioReposicion = precioReposicion;
        }
    }

    public Libro(String titulo, String autor, String isbn) {
        this(titulo, autor, isbn, 0, 15000.0);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public double getPrecioReposicion() {
        return precioReposicion;
    }

    public boolean prestar() {
        if (copiasDisponibles > 0) {
            copiasDisponibles--;
            System.out.println("Préstamo registrado. Copias disponibles: " + copiasDisponibles);
            return true;
        } else {
            System.out.println("No hay copias disponibles para prestar.");
            return false;
        }

     }
    public void devolver() {
        copiasDisponibles++;
        System.out.println("Devolución registrada. Copias disponibles: " + copiasDisponibles);
    }
    public boolean setPrecioReposicion(double precio) {
        if (precio > 0) {
            this.precioReposicion = precio;
            System.out.println("Precio de reposición actualizado a: " + this.precioReposicion);
            return true;
        } else {
            System.out.println("Precio de reposición inválido, no se realizó el cambio.");
            return false;
        }
        
    }
    public void mostrarFicha() {
        System.out.println("=== Ficha del libro ===");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Copias disponibles: " + this.copiasDisponibles);
        System.out.println("Precio de reposición: " + this.precioReposicion);
    }
}
