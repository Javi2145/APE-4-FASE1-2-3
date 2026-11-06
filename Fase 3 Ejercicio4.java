public class Ejercicio4 {

    static class Cuenta {
        private String titular;
        private double saldo;

        public Cuenta(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        public void depositar(double monto) {
            saldo += monto;
        }

        public boolean retirar(double monto) {
            if (monto <= saldo) {
                saldo -= monto;
                return true;
            }
            return false;
        }

        // Retira de esta cuenta y deposita en destino solo si hay fondos
        public void transferir(Cuenta destino, double monto) {
            if (retirar(monto)) {
                destino.depositar(monto);
                System.out.println("Transferencia exitosa de $" + monto
                        + " de " + titular + " a " + destino.titular);
            } else {
                System.out.println("Transferencia fallida: fondos insuficientes en la cuenta de " + titular);
            }
        }

        public void mostrarSaldo() {
            System.out.println("Titular: " + titular + " | Saldo: $" + saldo);
        }
    }

    public static void main(String[] args) {
        Cuenta c1 = new Cuenta("Ana", 500);
        Cuenta c2 = new Cuenta("Luis", 100);

        System.out.println("--- Saldos iniciales ---");
        c1.mostrarSaldo();
        c2.mostrarSaldo();

        System.out.println("\n--- Transferencia válida ---");
        c1.transferir(c2, 200);

        System.out.println("\n--- Transferencia que falla ---");
        c1.transferir(c2, 1000);

        System.out.println("\n--- Saldos finales ---");
        c1.mostrarSaldo();
        c2.mostrarSaldo();
    }
}