package Aula05.projeto.src;

public class Tabuada {
    
    public static void main(String[] args) {
        // Percorre cada número de 1 a 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");
            
            // Multiplica i pelos números de 1 a 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            System.out.println(); // linha em branco para separar
        }
    }
}
