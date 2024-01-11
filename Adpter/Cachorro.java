public class Cachorro implements IAnimalDomestico {

  @Override
  public void alimentarRacao() {
    System.out.println("Comendo raçao");
  }

  @Override
  public void brincar() {
    System.out.println("Brincando com o cachorro");
  }

  @Override
  public void serCarrinhoso() {
    System.out.println("au au au");
  }

}