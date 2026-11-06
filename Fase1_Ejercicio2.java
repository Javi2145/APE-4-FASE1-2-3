class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}

public class Fase1_Ejercicio2 {
    public static void main(String[] args) {
        Producto[] productos = {
            new Producto("Laptop", 800.0, 10),
            new Producto("Mouse", 15.5, 8),
            new Producto("Teclado", 25.0, 6),
            new Producto("Monitor", 200.0, 12)
        };

        for (Producto p : productos) {
            System.out.println(p.nombre + " : " + p.precio);
        }

        // Venta de 3 unidades de dos productos
        productos[1].stock -= 3;
        productos[2].stock -= 3;

        double total = 0;
        for (Producto p : productos) {
            String aviso = (p.stock < 5) ? " Reponer" : "";
            System.out.println(p.nombre + " : stock " + p.stock + aviso);
            total += p.precio * p.stock;
        }
        System.out.println("Valor total del inventario: " + total);
    }
}
