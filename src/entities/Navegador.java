package entities;

import java.util.ArrayList;
import java.util.List;

public class Navegador {
  List<Pagina> paginas = new ArrayList<Pagina>();

  public void exibirPagina() {
    System.out.println("Exibindo paginas");
    paginas.forEach(x -> System.out.println(x.titulo));
  }

  public void adicionarNovaAba(Pagina newPage) {
    System.out.println("Nova aba adicionada");
    paginas.add(newPage);
  }

  public void atualizarPagina() {
    System.out.println("Pagina foi atualizada");
  }
}
