package Aula05.projeto.src;

import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicita o salário
        System.out.print("Digite o valor do salário: ");
        double salario = entrada.nextDouble();

        // Solicita a prestação
        System.out.print("Digite o valor da prestação: ");
        double prestacao = entrada.nextDouble();

        // Calcula 20% do salário
        double limite = salario * 0.20;

        // Verifica se a prestação é maior que 20% do salário
        if (prestacao > limite) {
            System.out.println("Empréstimo não pode ser concedido.");
        } else {
            System.out.println("Empréstimo pode ser concedido.");
        }

        entrada.close();
    }
}
