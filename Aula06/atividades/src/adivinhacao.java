package Aula06.atividades.src;
import java.util.Scanner;
import java.util.Random;

public class adivinhacao {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

    
        Random gerador = new Random();
        int numeroSecreto = gerador.nextInt(100) + 1; 
    

        int palpite = 0;

        System.out.println("=== Jogo da Adivinhação ===");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100!");


        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = entrada.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR!");
            } else {
                System.out.println(" Parabéns! Você acertou o número secreto!");
            }
        }

        entrada.close();
    }
}

