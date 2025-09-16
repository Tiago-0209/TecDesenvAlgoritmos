package Aula05.projeto.src;

public class Medias {
    
    public static void main(String[] args) {
        // médias dos conjuntos
        double media1 = (8 + 9 + 7) / 3.0;
        double media2 = (4 + 5 + 6) / 3.0;

        // soma das duas médias
        double soma = media1 + media2;

        // média das médias
        double mediaDasMedias = soma / 2.0;

        // exibir resultados
        System.out.println("Média dos números 8, 9 e 7: " + media1);
        System.out.println("Média dos números 4, 5 e 6: " + media2);
        System.out.println("Soma das duas médias: " + soma);
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}

