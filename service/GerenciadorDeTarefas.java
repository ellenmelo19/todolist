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


  public void removerPasta(String nomePasta) throws PastaNaoEncontradaException {
    List<Pasta> pastas = acessoDados.getTodasPastas();
    for (Pasta pasta : pastas) {
      if (pasta.getNome().equals(nomePasta)) {
        acessoDados.excluirPasta(pasta);
        return;
      }
    }
    throw new PastaNaoEncontradaException("Pasta com nome \"" + nomePasta + "\" não encontrada.");
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

  public void removerTarefa(String nomePasta, int id) throws PastaNaoEncontradaException {
    List<Pasta> pastas = acessoDados.getTodasPastas();
    for (Pasta pasta : pastas) {
      if (pasta.getNome().equals(nomePasta)) {
        pasta.removerTarefa(id);
        System.out.println("Tarefa com ID " + id + " removida.");
        acessoDados.atualizarPasta(pasta);
        return;
      }
    }
    throw new PastaNaoEncontradaException("Pasta com nome \"" + nomePasta + "\" não encontrada.");
  }

  public List<Pasta> listarTodasPastas() {
    return acessoDados.getTodasPastas();
  }

  public void listarTodasTarefas(){
    List<Pasta> pastas = acessoDados.getTodasPastas();
    for (Pasta pasta : pastas){
      System.out.println("Nome da pasta: " + pasta.getNome());
      List<Tarefas> tarefas = pasta.getTarefas();
      for (Tarefas tarefa : tarefas){
        System.out.println("---------------");
        System.out.println("ID da tarefa: " + tarefa.getID());
        System.out.println("Título da tarefa: " + tarefa.getTitulo());
        System.out.println("Descrição da tarefa: " + tarefa.getDescricaoTarefa());
        System.out.println("Status da tarefa: " + tarefa.getStatusTarefa());
        System.out.println("Data de início da tarefa: " + tarefa.getDataInicioTarefa());
        System.out.println("Data de prazo da tarefa: " + tarefa.getPrazoTarefa());
        System.out.println("Prioridade da tarefa: " + tarefa.getPrioridadeTarefa() + "\n");
        System.out.println("---------------");
      }
    }
  }
}
