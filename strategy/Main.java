

public class Main {
  public static void main(String[] args) {
    //uso do strategy

    Passaro p = new Passaro();
    p.setAtaque(new AtaqueBico());
    p.setHabilidade(new BicadaFatal());
    lutar(p);

    Cachorro r = new Cachorro();
    r.setAtaque(new AtaqueBico());
    r.setHabilidade(new BicadaFatal());
    lutar(r);

  }

  public static void lutar(Lutador lutador) {
    System.out.println("Lutador: " +
        lutador.getNome());
    lutador.andar();
    lutador.atacar();
    lutador.defender();
    lutador.especia();
    lutador.minhaHabilidade();
    System.out.println("");
  }

}