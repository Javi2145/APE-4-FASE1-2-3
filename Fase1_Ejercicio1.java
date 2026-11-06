class Estudiante {
    String nombre;
    double nota1, nota2, nota3, promedio;

    Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }
}

public class Fase1_Ejercicio1 {
    public static void main(String[] args) {
        Estudiante[] estudiantes = {
            new Estudiante("Ana", 8, 9, 7.5),
            new Estudiante("Luis", 5, 6, 6.5),
            new Estudiante("Marta", 4, 4, 4),
            new Estudiante("Pedro", 9, 9.5, 9.5),
            new Estudiante("Sofia", 7, 7, 7)
        };

        int aprobados = 0;
        for (Estudiante e : estudiantes) {
            e.calcularPromedio();
            String estado;
            if (e.promedio >= 7) {
                estado = "Aprobado";
                aprobados++;
            } else if (e.promedio >= 5) {
                estado = "Supletorio";
            } else {
                estado = "Reprobado";
            }
            System.out.printf("%s : %.2f %s%n", e.nombre, e.promedio, estado);
        }
        System.out.println("Estudiantes aprobados: " + aprobados);
    }
}
