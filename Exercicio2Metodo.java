import java.util.Scanner;

public class Exercicio2Metodo {

    // Método principal onde roda tudo
    public static void main(String[] args) {

        // Método criado que vai exibir a mensagem pedida
        nome();
    }

    // Método criado que vai ser chamado no Main
    public static void nome () {
        // Criando scanner para captar dados de usuario
        Scanner leitor = new Scanner(System.in);

        // Armazenando nome digitado na variável "nome" através do leitor
        System.out.println("Digite o seu nome: ");
        String nomeDigitado = leitor.nextLine();

        // Exibindo a mensagem pedida no exercício com o nome digitado
        System.out.println("Olá, meu nome é " +nomeDigitado);
    }
    
}

/*
 * Faça um algoritmo que contenha uma função que receba o nome de um
 * usuário e retorne a mensagem Meu nome é <NomeDigitado>.
 */