import java.util.List;

public class GerenciadorDeTarefas {
  private AcessoDados acessoDados;

  public GerenciadorDeTarefas() {
    this.acessoDados = new AcessoDados();
  }

  public void adicionarPasta(String nomePasta) {
    List<Pasta> pastas = acessoDados.getTodasPastas();
    for (Pasta pasta : pastas){
      if(pasta.getNome().equals(nomePasta)){
        System.out.println("Pasta já existe");
        return;
      }
    }
    Pasta pasta = new Pasta(nomePasta);
    acessoDados.adicionarPasta(pasta);
  }

  public void listarPastas() {
    List<Pasta> pastas = acessoDados.getTodasPastas();
    for (Pasta pasta : pastas) {
      System.out.println("Nome da pasta: " + pasta.getNome());
    }
  }

  public void removerPasta(String nomePasta) {
    List<Pasta> pastas = acessoDados.getTodasPastas();
    for (Pasta pasta : pastas) {
      if (pasta.getNome().equals(nomePasta)) {
        acessoDados.excluirPasta(pasta);
        return;
      }
    }
    
  }

  public void adicionarTarefa(String nomePasta, Tarefas tarefa) {
    List<Pasta> pastas = acessoDados.getTodasPastas();
    for (Pasta pasta : pastas) {
      if (pasta.getNome().equals(nomePasta)) {
        pasta.adicionarTarefa(tarefa);
        acessoDados.atualizarPasta(pasta);
        return;
      }
    }
    // Se a pasta nÃ£o existir, criar nova pasta e adicionar tarefa
    Pasta novaPasta = new Pasta(nomePasta);
    novaPasta.adicionarTarefa(tarefa);
    acessoDados.adicionarPasta(novaPasta);
  }

  public void removerTarefa(String nomePasta, Tarefas tarefa) {
    List<Pasta> pastas = acessoDados.getTodasPastas();
    for (Pasta pasta : pastas) {
      if (pasta.getNome().equals(nomePasta)) {
        pasta.removerTarefa(tarefa);
        acessoDados.atualizarPasta(pasta);
        return;
      }
    }
    System.out.println("Tarefa não encontrada");
  }

  public List<Pasta> listarTodasPastas() {
    return acessoDados.getTodasPastas();
  }
}