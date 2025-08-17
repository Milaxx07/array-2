import java.util.Locale;
import java.util.Scanner;
public class Idade {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in).useLocale(Locale.US)) {
            double[] notas = new double[4];
            double soma = 0;
            
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a nota " + (i+1) + ": ");
                notas[i] = entrada.nextDouble();
                soma += notas[i];
            }
            
            double media = soma / notas.length;
            System.out.printf("\nMédia aritmética das 4 notas = %.2f\n", media);
        }
    }
}
