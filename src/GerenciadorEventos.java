import java.util.ArrayList;
import java.util.List;

public class GerenciadorEventos {

    private List<Evento> eventos = new ArrayList<>();

    public void cadastrarEvento(Evento evento) {
        eventos.add(evento);
        System.out.println("Evento cadastrado!");
    }

    public void listarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("Nenhum evento.");
        } else {
            for (Evento e : eventos) {
                System.out.println(e);
            }
        }
    }

    public Evento buscarPorId(int id) {
        for (Evento e : eventos) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void atualizarEvento(int id, String nome, String data, String local, String descricao) {
        Evento e = buscarPorId(id);
        if (e != null) {
            e.setNome(nome);
            e.setData(data);
            e.setLocal(local);
            e.setDescricao(descricao);
            System.out.println("Atualizado!");
        } else {
            System.out.println("Não encontrado.");
        }
    }

    public void removerEvento(int id) {
        if (eventos.removeIf(e -> e.getId() == id)) {
            System.out.println("Removido!");
        } else {
            System.out.println("Não encontrado.");
        }
    }
}
