package entities;

public class ReprodutorMusical {
  Musica musicaAtual;

  public void tocar() {
    System.out.println("Tocando: " + this.musicaAtual.nome);
  }

  public void pausar() {
    System.out.println("A musica " + this.musicaAtual.nome + " parou de tocar");
  }

  public void selecionarMusica(Musica musica) {
    this.musicaAtual = musica;
    System.out.println("A musica foi trocada");
  }
}
