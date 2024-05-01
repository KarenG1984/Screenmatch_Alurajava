import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Película Matrix");
    int fechaDeLanzamiento = 1999;
    double evaluacion = 4.5;
    boolean incluidoEnElPlanBasico = true;
    double mediaEvaluacionUsuario = 0;

    for (int i = 0; i < 3; i++) {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingresa la evaluación que le darías a Matrix");
      double notaMatrix = teclado.nextDouble();
      mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
    }
    System.out.println("La media de Matrix " +
        "calculada por usuario es: " + mediaEvaluacionUsuario / 3);
  }
}