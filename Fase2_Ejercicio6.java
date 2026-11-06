class CajaRegistradora {
    public double calcularSubtotal(double precio, int cantidad) {
        if (cantidad <= 0 || precio < 0) {
            System.out.println("Error: Datos de compra inválidos");
            return 0.0;
        }
        return precio * cantidad;
    }
}

public class Fase2_Ejercicio6 {
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora();
        System.out.println("Subtotal: " + caja.calcularSubtotal(2.5, 4));
        System.out.println("Subtotal: " + caja.calcularSubtotal(2.5, 0));
    }
}
