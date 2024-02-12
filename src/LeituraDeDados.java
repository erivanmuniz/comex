import java.util.InputMismatchException;
import java.util.Scanner;

public class LeituraDeDados {
        public static void main (String[]args){
            Scanner leitura = new Scanner(System.in);

            int numeroDigitado = 0;
            boolean numeroValido = false;

            while (!numeroValido) {
                try {
                    System.out.print("Digite um número: ");

                    numeroDigitado = leitura.nextInt();
                    numeroValido = true;

                } catch (InputMismatchException e) {
                    System.out.println("Por favor, digite um número inteiro válido.");
                    leitura.nextLine();
                }
            }
            System.out.println("Você digitou: " + numeroDigitado);

            leitura.close();
        }
    }


