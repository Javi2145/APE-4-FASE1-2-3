public class Ejercicio1 {

    static class Autor {
        private String nombre;
        private String nacionalidad;

        public Autor(String nombre, String nacionalidad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }

        public String getNombre() {
            return nombre;
        }

        public String getNacionalidad() {
            return nacionalidad;
        }
    }

    static class Libro {
        private String titulo;
        private int anio;
        private Autor autor; // Objeto como atributo

        public Libro(String titulo, int anio, Autor autor) {
            this.titulo = titulo;
            this.anio = anio;
            this.autor = autor;
        }

        // Imprime título, año y nombre del autor
        public void mostrarInformacion() {
            System.out.println("Título: " + titulo);
            System.out.println("Año: " + anio);
            System.out.println("Autor: " + autor.getNombre());
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        Autor autor1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor autor2 = new Autor("Jorge Icaza", "Ecuatoriana");

        Libro libro1 = new Libro("Cien años de soledad", 1967, autor1);
        Libro libro2 = new Libro("Huasipungo", 1934, autor2);

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
