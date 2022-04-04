import java.util.Scanner;

public class Exercicio4Metodo {
    // Método principal
    public static void main(String[] args) {
        //leitor para captar dados que user vai digitar
        Scanner leitor = new Scanner(System.in);

        /* pegando dados do usuario para compor o metodo criado abaixo.
        Preciso desses dados (altura e base) e não os tenho
        */

        System.out.println("Qual o tamanho da base do seu retângulo? ");
        double base = leitor.nextDouble();
        System.out.println("Qual a altura do seu retângulo? ");
        double altura = leitor.nextDouble();

        // Chamando método criado com os dados que coletei acima
        areaDoRetangulo(base, altura);
    }
    
    // Método criado para calcular a área do retângulo. 
    public static double areaDoRetangulo (double base, double altura) {
        // Calculando a área
        double area = (base * altura);

        // Entregando o resultado
        System.out.printf("A área do seu retângulo é de %.2f", area);

        return area;
    }
}

/**
 * Faça um algoritmo que contenha uma função para ler as dimensões de
um retângulo (base e altura), calcular e imprimir para o usuário a área do
retângulo;
 */