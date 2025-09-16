package Aula05.projeto.src;

import java.util.Scanner;

public class VerificaEntrada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Lendo ano de nascimento e ano atual
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = entrada.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = entrada.nextInt();

        // Calculando idade
        int idade = anoAtual - anoNascimento;
        System.out.println("Idade: " + idade);

        // Verificando se tem 18 anos ou mais
        if (idade >= 18) {
            entrada.nextLine(); // consumir quebra de linha pendente
            System.out.print("Digite o seu nome: ");
            String nome = entrada.nextLine();

            System.out.println(nome + ", sua entrada foi permitida.");
        } else {
            System.out.println("Entrada não permitida. Menor de idade.");
        }

        entrada.close();
    }
}
