import java.util.ArrayList;
import java.util.List;

public class Revista implements IRevista {
  
  private Exemplar e;
  
   private List<IAssinante> assinantes = new ArrayList<>();

  @Override
 public void registrarAssinante(IAssinante a){
   assinantes.add(a);
 }
   @Override
 public void removerAssinate(IAssinante a){
   assinantes.remove(a);
 }
   @Override
 public void notificarAssinante(){
   for(IAssinante a: assinantes){
     a.update(e);
   }
 }

  public void setExemplar(Exemplar e) {
    this.e = e;
  }
}