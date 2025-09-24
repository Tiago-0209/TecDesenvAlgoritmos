public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    public Livro(String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Livro l1 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, true);
        Livro l2 = new Livro("Dom Casmurro", "Machado de Assis", 1899, false);

        l1.mostrarInfo();
        l2.mostrarInfo();
    }
}
