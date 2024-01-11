public class Lobo implements IAnimalNDomestico{
  
  @Override
  public void alimentar(){
    System.out.println("Lobo comendo ");
  }
  
  @Override
  public void atacar(){
    System.out.println("Lobo atacando");
  }

  @Override
  public void desoberdecer(){
    System.out.println("Lobo Desoberdecendo");
  }


}