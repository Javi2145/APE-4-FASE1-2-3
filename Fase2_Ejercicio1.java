public class Fase2_Ejercicio1 {
    public double retirarDinero(double saldoActual, double montoRetiro) {
        if (montoRetiro > saldoActual) {
            System.out.println("Fondos insuficientes");
            return saldoActual; // devuelve el saldo sin cambios
        }
        double nuevoSaldo = saldoActual - montoRetiro;
        System.out.println("Retiro exitoso");
        return nuevoSaldo; // devuelve el saldo ya restado
    }

    public static void main(String[] args) {
        Fase2_Ejercicio1 banco = new Fase2_Ejercicio1();
        System.out.println("Saldo: " + banco.retirarDinero(100, 30));
        System.out.println("Saldo: " + banco.retirarDinero(100, 150));
    }
}
