public class Main {
  public static void main(String[] args) {

    interagir(new Cachorro());
    interagir(new Adapter(new Lobo()));
    
  }

  public static void interagir(IAnimalDomestico animal){
    animal.alimentarRacao();
    animal.brincar();
    animal.serCarrinhoso();
    System.out.println("----------------");
  }
}