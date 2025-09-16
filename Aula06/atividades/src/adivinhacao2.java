package Aula06.atividades.src;
import java.util.Scanner;
import java.util.Random;

public class adivinhacao2 {
    public static void main(String[] args) {
        // Scanner para entrada
        Scanner entrada = new Scanner(System.in);

       
        Random gerador = new Random();
        int numeroSecreto = gerador.nextInt(100) + 1; 


        int palpite;
        int tentativas = 3;

        System.out.println("=== Jogo da Adivinhação 2 ===");
        System.out.println("Você tem 3 tentativas para acertar o número secreto (1 a 100).");

    
        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": Digite seu palpite: ");
            palpite = entrada.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número secreto!");
                entrada.close();
                return; 
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR!");
            } else {
                System.out.println("O número secreto é MENOR!");
            }
        }

     
        System.out.println(" Você não conseguiu acertar em 3 tentativas.");
        System.out.println("O número secreto era: " + numeroSecreto);

        entrada.close();
    }
}