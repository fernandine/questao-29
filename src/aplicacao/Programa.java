package aplicacao;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o n�mero 1: ");
        int numero1 = Integer.parseInt(scanner.nextLine()); // ao ler do teclado, utilize somente o m�todo nextLine()

        System.out.print("Digite o n�mero 2: ");
        int numero2 = Integer.parseInt(scanner.nextLine()); // ao ler do teclado, utilize somente o m�todo nextLine()

        System.out.print("Os n�meros pares entre " + numero1 + " e " + numero2 + " s�o:");
        for (int numero = numero1; numero <= numero2; numero++) {
            if (numero % 2 == 1) {
                System.out.print(" " + numero);
            }
        }
        scanner.close();
    }
}
		
		
	

