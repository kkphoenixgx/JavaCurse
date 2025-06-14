package SiPOO.P2Online;

public class Servico implements Vendavel {
  public String nome;
  public int preco;

  public Servico(String nome, int preco){
    this.nome = nome;
    this.preco = preco;
  }

  public double retornarPrecoVenda(){
    return this.preco * 0.15;
  }


}
