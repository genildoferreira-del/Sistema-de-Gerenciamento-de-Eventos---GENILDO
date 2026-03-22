public class Evento {

    private int id;
    private String nome;
    private String data;
    private String local;
    private String descricao;

    public Evento(int id, String nome, String data, String local, String descricao) {
        this.id = id;
        this.nome = nome;
        this.data = data;
        this.local = local;
        this.descricao = descricao;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getData() { return data; }
    public String getLocal() { return local; }
    public String getDescricao() { return descricao; }

    public void setNome(String nome) { this.nome = nome; }
    public void setData(String data) { this.data = data; }
    public void setLocal(String local) { this.local = local; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Data: " + data +
                " | Local: " + local + " | Descrição: " + descricao;
    }
}