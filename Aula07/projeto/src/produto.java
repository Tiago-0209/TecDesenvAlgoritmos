public class produto {
    
    private int id;
    private String nome;
    private String desc;

    
    public produto(int id, String nome, String desc) {
        this.id = id;
        this.nome = nome;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + desc);
    }


    public static void main(String[] args) {
        
        produto p1 = new produto(1, "Notebook", "Notebook Dell i5 8GB");


        p1.mostrarInfo();


        produto p2 = new produto(2, "Smartphone", "Celular Android 128GB");

        p2.mostrarInfo();
    }
}

