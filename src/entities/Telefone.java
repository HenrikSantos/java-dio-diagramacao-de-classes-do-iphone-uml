package entities;

public class Telefone {
  long numero;

  public Telefone(long numero) {
    this.numero = numero;
  }

  public void ligar(long numeroParaLigar) {
    System.out.println("ligando para: " + numeroParaLigar);
  }

  public void atender(long numeroAAtender) {
    System.out.println("Atendendo chamada de: " + numeroAAtender);
  }

  public void iniciarCorreioDeVoz(long numeroQueDeixouAMsg) {
    System.out.println("Escutando a mensagem de: " + numeroQueDeixouAMsg);
  }
}
