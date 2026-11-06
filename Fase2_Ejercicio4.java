public class Fase2_Ejercicio4 {
    public double generarReporteEmpleado(String nombre, int horas, double tarifa, boolean bono) {
        double sueldoBase = horas * tarifa;
        if (bono) {
            sueldoBase += sueldoBase * 0.20; // 20% de bonificación
        }
        System.out.println("Empleado: " + nombre);
        return sueldoBase;
    }

    public static void main(String[] args) {
        Fase2_Ejercicio4 e = new Fase2_Ejercicio4();
        System.out.println("Sueldo final: " + e.generarReporteEmpleado("Carlos", 40, 10.0, true));
    }
}
