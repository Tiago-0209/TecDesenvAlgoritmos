public class Aventura {
    public static void main(String[] args) {
        Item espada = new Item(1, "Espada", "Uma espada afiada de aço");
        Sala sala1 = new Sala(101, "Uma sala escura e misteriosa");

        espada.mostrarInfo();
        sala1.mostrarInfo();
    }
}

class Item {
    private int id;
    private String nome;
    private String descricao;

    public Item(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public void mostrarInfo() {
        System.out.println("Item ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("------------------");
    }
}

class Sala {
    private int id;
    private String descricao;

    public Sala(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public void mostrarInfo() {
        System.out.println("Sala ID: " + id);
        System.out.println("Descrição: " + descricao);
        System.out.println("------------------");
    }
}
