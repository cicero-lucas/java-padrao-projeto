public class Adapter implements IAnimalDomestico {
  
  private IAnimalNDomestico ndomestico;

  public Adapter(IAnimalNDomestico ndomestico) {
    this.ndomestico = ndomestico;
  }
  

  @Override
  public void alimentarRacao() {
    ndomestico.alimentar();
  }
  

  @Override
  public void brincar() {
    ndomestico.atacar();
  }

  @Override
  public void serCarrinhoso() {
    ndomestico.desoberdecer();
  }
  
}