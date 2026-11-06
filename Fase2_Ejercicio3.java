public class Fase2_Ejercicio3 {
    public void modificarValor(int x) {
        x = x * 2;
        System.out.println("Dentro: " + x);
    }

    public static void main(String[] args) {
        Fase2_Ejercicio3 obj = new Fase2_Ejercicio3();
        int x = 15;
        obj.modificarValor(x);
        System.out.println("En main: " + x);
    }
}
// Salida: Dentro: 30 / En main: 15
// Java pasa los primitivos por valor: el método recibe una copia de x.
