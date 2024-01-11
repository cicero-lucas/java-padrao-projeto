public class Pessoa implements IAssinante {

  private String nome;
  private IRevista r;

  public Pessoa (String nome, IRevista r){
    this.nome=nome;
    this.r=r;
    r.registrarAssinante(this);
  }

  public void cancelarAssinatura(){
    r.removerAssinate(this);
  }

  @Override
  public void update(Exemplar e){
    System.out.println("Pessoa " + this.nome + " recebeu o exempla " + e.getTitulo() +  e.getNumEd() + " da biblioteca  com a informção  "+  e.getInfor());
    System.out.println("--------------");
  }
}