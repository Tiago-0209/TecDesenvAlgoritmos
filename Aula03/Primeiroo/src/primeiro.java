package Aula03.Primeiroo.src;

import java.util.Scanner;
public class primeiro {
public static void main(String[] args) {
    String nome;
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite seu nome: ");
    nome=leitor.nextLine();
    System.out.println("Olá, "+nome+"!");
    leitor.close();
}
}

