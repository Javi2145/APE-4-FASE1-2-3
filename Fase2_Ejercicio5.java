class Calculadora {
    public double calcularRaizCuadrada(double valor) {
        if (valor < 0) {
            System.out.println("Error: No se puede calcular raíz de números negativos");
            return 0.0;
        }
        return Math.sqrt(valor);
    }
}

public class Fase2_Ejercicio5 {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        System.out.println(c.calcularRaizCuadrada(25));
        System.out.println(c.calcularRaizCuadrada(-4));
    }
}
