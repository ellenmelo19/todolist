import java.util.ArrayList;
import java.util.List;

public class Pasta implements Comparable<Pasta> {
    private String nome;
    private List<Tarefas> tarefas;

    public Pasta(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tarefas> getTarefas() {
        return tarefas;
    }

    public void adicionarTarefa(Tarefas tarefa) {
        int id = tarefas.size() + 1;
        tarefa.setID(id);
        this.tarefas.add(tarefa);
    }

    public void removerTarefa(int id) {
        tarefas.removeIf(tarefa -> tarefa.getID() == id);
    }

    @Override
    public int compareTo(Pasta outraPasta) {
        return this.nome.compareTo(outraPasta.getNome());
    }
}
