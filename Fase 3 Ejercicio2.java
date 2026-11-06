public class Ejercicio2 {

    static class Rectangulo {
        private double base;
        private double altura;

        public Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            return base * altura;
        }

        public double calcularPerimetro() {
            return 2 * (base + altura);
        }

        public boolean esCuadrado() {
            return base == altura;
        }

        public String obtenerDescripcion() {
            return "Rectángulo de " + base + " x " + altura;
        }

        // Imprime todos los resultados
        public void mostrar() {
            System.out.println(obtenerDescripcion());
            System.out.println("Área: " + calcularArea());
            System.out.println("Perímetro: " + calcularPerimetro());
            System.out.println("¿Es cuadrado?: " + (esCuadrado() ? "Sí" : "No"));
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4.0, 6.0);
        Rectangulo r2 = new Rectangulo(5.0, 5.0);

        r1.mostrar();
        r2.mostrar();
    }
}