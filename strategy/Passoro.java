public class Passaro extends Lutador {
  
  public Passaro(){
    
    this.setNome("Paçoca");
    this.setLife(110);
    this.setPeso(56);
    this.setNacionalidade("Br");
  }


  @Override
  public void defender(){
    System.out.println(this.getNome() + "Defendendo...");
  }

  @Override
  public void especia(){
    System.out.println(this.getNome() + "Especializando em "  + " com o poder de " + "45");
  }
}