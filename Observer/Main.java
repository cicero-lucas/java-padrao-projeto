public class Main{
  public static void main(String[] args) {

    Revista r = new Revista();

    Pessoa p1 = new Pessoa("ralf", r);
    Pessoa p2 = new Pessoa("Lucas", r);

    Exemplar e1 = new Exemplar();
    Exemplar e2 = new Exemplar();

    e1.setTitulo("revista 1");
    e1.setInfor("Revista 2");
    e1.setNumEd(1);
  

    e2.setTitulo("revista 1");
    e2.setInfor("Revista 2");
    e2.setNumEd(1);

    r.setExemplar(e1);
    r.notificarAssinante();

    p1.cancelarAssinatura();
    
    r.setExemplar(e2);
    r.notificarAssinante();
  }
}