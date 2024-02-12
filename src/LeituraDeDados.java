import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite um número: ");


        if (leitura.hasNextInt()) {
            int numeroDigitado = leitura.nextInt();
            System.out.println("Você digitou: " + numeroDigitado);
        } else {
            System.out.println("Por favor, digite um número inteiro válido.");
        }

        leitura.close();
    }
}
