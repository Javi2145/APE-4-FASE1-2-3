class ControlAcceso {
    public void evaluarAcceso(String rol, int anios) {
        if (rol.equalsIgnoreCase("Administrador") && anios >= 2) {
            System.out.println("Acceso total concedido");
        } else {
            System.out.println("Acceso restringido");
        }
    }
}

public class Fase2_Ejercicio2 {
    public static void main(String[] args) {
        ControlAcceso ca = new ControlAcceso();
        ca.evaluarAcceso("Administrador", 3);
        ca.evaluarAcceso("administrador", 1);
        ca.evaluarAcceso("Usuario", 5);
    }
}
