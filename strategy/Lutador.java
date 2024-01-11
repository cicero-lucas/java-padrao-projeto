public abstract class Lutador {

  private String nome;
  private String nacionalidade;
  private float peso;
  private int life;
  private Iataque ataque;
  private String categoria;
  private Ihabilidade habilidade;

//ataque do super tipo interface 
public void setHabilidade(Ihabilidade habilidade){
  this.habilidade = habilidade;
}
public void setAtaque(Iataque ataque) {
	this.ataque = ataque;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
  public abstract void especia ();
  //usando o stratagy
  public void atacar(){
    this.ataque.atacar();
  }

  public void minhaHabilidade(){
    this.habilidade.habilidade();
  }
  
  public abstract void defender();

  public void andar(){
    System.out.println(this.getNome() + "Andando...");
  }
  public void chutar(){
    System.out.println(this.getNome() + "chutando...");
  }
  
  public String getNome() {
  	return nome;
  }
  public void setNome(String nome) {
  	this.nome = nome;
  }
  public String getNacionalidade() {
  	return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade) {
  	this.nacionalidade = nacionalidade;
  }
  public float getPeso() {
  	return peso;
  }
  public void setPeso(float peso) {
  	this.peso = peso;
    this.setCategoria();
  }
  public int getLife() {
  	return life;
  }
  public void setLife(int life) {
  	this.life = life;
  }
  
  public String getCategoria() {
  	return categoria;
  }

  private void setCategoria() {
    if(peso>55.5 && peso<=60.5){
        this.categoria="Faixa leve";
    }else if(peso>60.5 && peso<=65.5){
      this.categoria="Faixa media";
    }else if(peso>65.5 && peso<=70.5){
      this.categoria="Faixa pesada";
    }else if(peso>70.5){
      this.categoria="Faixa Super pesada";
    }
  }
  
  
  
}