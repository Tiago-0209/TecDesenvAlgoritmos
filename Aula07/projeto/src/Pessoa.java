public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 25);
        Pessoa p2 = new Pessoa("João", 30);

        p1.mostrarInfo();
        p2.mostrarInfo();
    }
}
