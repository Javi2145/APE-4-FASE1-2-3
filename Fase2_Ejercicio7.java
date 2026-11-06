class Vehiculo {
    String placa;
    double tarifaDiaria;

    public double calcularAlquiler(int dias) {
        if (dias <= 0) {
            System.out.println("Días inválidos");
            return 0.0;
        }
        return dias * tarifaDiaria;
    }
}

public class Fase2_Ejercicio7 {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        v.placa = "TBA-1234";
        v.tarifaDiaria = 40.0;
        System.out.println("Alquiler: " + v.calcularAlquiler(3));
        System.out.println("Alquiler: " + v.calcularAlquiler(0));
    }
}
