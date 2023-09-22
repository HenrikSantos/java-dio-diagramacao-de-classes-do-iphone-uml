import entities.ReprodutorMusical;
import entities.Telefone;
import entities.Musica;
import entities.Navegador;
import entities.Pagina;

public class IPhone {
  ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
  Telefone telefone;
  Navegador navegador = new Navegador();

  public IPhone(long numeroDeTelefone) {
    this.telefone = new Telefone(numeroDeTelefone);
  }

  public static void main(String[] args) throws Exception {
    IPhone meuIPhone = new IPhone(12957256845l);
    meuIPhone.reprodutorMusical.selecionarMusica(new Musica("How deep is your love - Bee Gees", 210));
    meuIPhone.reprodutorMusical.tocar();
    meuIPhone.reprodutorMusical.selecionarMusica(new Musica("Stayin' Alive - Bee Gees", 305));
    meuIPhone.reprodutorMusical.tocar();

    meuIPhone.navegador.adicionarNovaAba(new Pagina("Youtube"));
    meuIPhone.navegador.exibirPagina();
    meuIPhone.navegador.adicionarNovaAba(new Pagina("Twitter"));
    meuIPhone.navegador.adicionarNovaAba(new Pagina("Twitch"));
    meuIPhone.navegador.atualizarPagina();
    meuIPhone.navegador.exibirPagina();

    meuIPhone.telefone.atender(9999999999l);
    meuIPhone.telefone.ligar(99999999999l);
  }
}
