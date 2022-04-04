import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Exercicio1Metodo {
    public static void main(String[] args) {
        somatoria();
    }

    public static void somatoria () {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroDigitado = leitor.nextInt();

        //int vetor [] = new int[numeroDigitado];

        int soma = 0;

        for (int i = 0; i <= numeroDigitado; i++) {
            soma = soma + i;
        }

        System.out.println("Somatória: " +soma);
    }

    /* Faça um algoritmo que contenha um método que receba um número do
usuário e realize a somatório de todos os números no intervalo de 1 até o
número digitado pelo usuário. Exiba o resultado final da somatória. */
    
}
