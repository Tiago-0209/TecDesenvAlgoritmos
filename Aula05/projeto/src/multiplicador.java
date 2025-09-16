package Aula05.projeto.src;


import java.util.Scanner;

public class multiplicador {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ler dois números
        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        // Multiplicação
        int resultado = numero1 * numero2;

        // Exibir o resultado
        System.out.println("O resultado da multiplicação é: " + resultado);

        entrada.close();
    }
}
