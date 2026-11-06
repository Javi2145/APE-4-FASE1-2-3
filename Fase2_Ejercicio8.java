class Producto {
    int stock;
    double precioUnitario;

    public double calcularValorTotal() {
        return stock * precioUnitario;
    }
}

public class Fase2_Ejercicio8 {
    public static void main(String[] args) {
        // a. Instanciar el objeto
        Producto p = new Producto();
        // b. Asignar stock y precio unitario
        p.stock = 10;
        p.precioUnitario = 25.5;
        // c. Llamar al método, guardar el resultado e imprimirlo
        double totalInventario = p.calcularValorTotal();
        System.out.println("Total del inventario: " + totalInventario);
    }
}
// Salida: Total del inventario: 255.0
