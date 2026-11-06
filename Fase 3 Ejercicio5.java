public class Ejercicio5 {

    static class Usuario {
        private String nombre;
        private String cedula;

        public Usuario(String nombre, String cedula) {
            this.nombre = nombre;
            this.cedula = cedula;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCedula() {
            return cedula;
        }
    }

    static class Libro {
        private String titulo;
        private boolean disponible;

        public Libro(String titulo) {
            this.titulo = titulo;
            this.disponible = true;
        }

        public String getTitulo() {
            return titulo;
        }

        // Presta el libro solo si está disponible
        public boolean prestar() {
            if (disponible) {
                disponible = false;
                return true;
            }
            return false;
        }

        public void devolver() {
            disponible = true;
        }
    }

    static class Prestamo {
        private Usuario usuario;
        private Libro libro;

        public Prestamo(Usuario usuario, Libro libro) {
            this.usuario = usuario;
            this.libro = libro;
        }

        // Intenta prestar el libro y muestra un mensaje según el resultado
        public void registrar() {
            if (libro.prestar()) {
                System.out.println("Préstamo exitoso: " + usuario.getNombre()
                        + " (C.I. " + usuario.getCedula() + ") se llevó \"" + libro.getTitulo() + "\".");
            } else {
                System.out.println("No disponible: " + usuario.getNombre()
                        + " no pudo prestar \"" + libro.getTitulo() + "\" porque ya está prestado.");
            }
        }
    }

    public static void main(String[] args) {
        Usuario u1 = new Usuario("Ana", "1801234567");
        Usuario u2 = new Usuario("Luis", "1807654321");
        Libro libro = new Libro("Java programación: teoría y ejemplos");

        // Dos usuarios piden el mismo libro
        Prestamo p1 = new Prestamo(u1, libro);
        Prestamo p2 = new Prestamo(u2, libro);

        p1.registrar(); // exitoso
        p2.registrar(); // falla
    }
}