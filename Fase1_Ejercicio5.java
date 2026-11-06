class Libro {
    String titulo;
    String autor;
    boolean disponible;

    Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }
}

class Socio {
    String nombre;
    int librosPrestados;

    Socio(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = 0;
    }
}

public class Fase1_Ejercicio5 {
    public static void main(String[] args) {
        Libro l1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez");
        Libro l2 = new Libro("Don Quijote", "Miguel de Cervantes");
        Libro l3 = new Libro("El principito", "Antoine de Saint-Exupery");
        Libro l4 = new Libro("1984", "George Orwell");

        Socio s1 = new Socio("Juan");
        Socio s2 = new Socio("Maria");

        // El primer socio presta 2 libros
        l1.disponible = false;
        l2.disponible = false;
        s1.librosPrestados += 2;

        // El segundo socio presta 1 libro
        l3.disponible = false;
        s2.librosPrestados += 1;

        Libro[] libros = {l1, l2, l3, l4};
        int disponibles = 0;
        for (Libro l : libros) {
            System.out.println(l.titulo + " : " + (l.disponible ? "Disponible" : "Prestado"));
            if (l.disponible) disponibles++;
        }

        System.out.println(s1.nombre + " : " + s1.librosPrestados);
        System.out.println(s2.nombre + " : " + s2.librosPrestados);
        System.out.println("Libros disponibles: " + disponibles);
    }
}
