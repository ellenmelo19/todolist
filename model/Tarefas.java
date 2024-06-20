import java.util.Date;

public class Tarefas {
  int ID;
  String titulo;
  String descricaoTarefa;
  Boolean statusTarefa;
  Date dataInicioTarefa;
  Date prazoTarefa;
  int prioridadeTarefa;

  public Tarefas(String titulo, String descricaoTarefa, Boolean statusTarefa, Date dataInicioTarefa, Date prazoTarefa, int prioridadeTarefa) {
    this.titulo = titulo;
    this.descricaoTarefa = descricaoTarefa;
    this.statusTarefa = statusTarefa;
    this.dataInicioTarefa = dataInicioTarefa;
    this.prazoTarefa = prazoTarefa;
    this.prioridadeTarefa = prioridadeTarefa;
  }

  public int getID(){
    return this.ID;
  }

  public void setID(int ID){
    this.ID = ID;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricaoTarefa() {
    return this.descricaoTarefa;
  }

  public void setDescricaoTarefa(String descricaoTarefa) {
    this.descricaoTarefa = descricaoTarefa;
  }

  public Boolean getStatusTarefa() {
    return this.statusTarefa;
  }

  public void setStatusTarefa(Boolean statusTarefa) {
    this.statusTarefa = statusTarefa;
  }

  public Date getDataInicioTarefa() {
    return this.dataInicioTarefa;
  }

  public void setDataInicioTarefa(Date dataInicioTarefa) {
    this.dataInicioTarefa = dataInicioTarefa;
  }

  public Date getPrazoTarefa() {
    return this.prazoTarefa;
  }

  public void setPrazoTarefa(Date prazoTarefa) {
    this.prazoTarefa = prazoTarefa;
  }

  public int getPrioridadeTarefa() {
    return this.prioridadeTarefa;
  }

  public void setPrioridadeTarefa(int prioridadeTarefa) {
    this.prioridadeTarefa = prioridadeTarefa;
  }
}
