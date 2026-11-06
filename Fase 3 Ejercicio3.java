public class Ejercicio3 {

    static class Producto {
        private String nombre;
        private double precio;
        private int stock;

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public double getPrecio() {
            return precio;
        }

        // Solo reduce si hay stock suficiente; devuelve si lo logró
        public boolean reducirStock(int cantidad) {
            if (cantidad <= stock) {
                stock -= cantidad;
                return true;
            }
            System.out.println("Stock insuficiente.");
            return false;
        }

        public void mostrarProducto() {
            System.out.println("Producto: " + nombre);
            System.out.println("Precio: $" + precio);
            System.out.println("Stock: " + stock);
            System.out.println("-------------------------");
        }
    }

    static class Venta {
        private int cantidad;

        public Venta(int cantidad) {
            this.cantidad = cantidad;
        }

        // Objeto como parámetro: reduce el stock y muestra el total a pagar
        public void aplicar(Producto producto) {
            if (producto.reducirStock(cantidad)) {
                double total = cantidad * producto.getPrecio();
                System.out.println("Venta realizada. Total a pagar: $" + total);
            }
        }
    }

    public static void main(String[] args) {
        Producto p = new Producto("Mouse", 12.5, 10);
        p.mostrarProducto();

        Venta v1 = new Venta(3);   // válida
        v1.aplicar(p);
        p.mostrarProducto();

        Venta v2 = new Venta(20);  // stock insuficiente
        v2.aplicar(p);
        p.mostrarProducto();
    }
}