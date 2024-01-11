public class Cachorro extends Lutador {

  public Cachorro(){
    this.setNome("Ralf");
    this.setLife(130);
    this.setPeso(60);
    this.setNacionalidade("Br");

  }


  @Override
  public void defender(){
    System.out.println(this.getNome() + "Defendendo...");
  }

  @Override
  public void especia(){
    System.out.println(this.getNome() + " Especializando em " +  " com o poder de " + "45");
  }
}