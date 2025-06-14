package SiPOO.P2Online;

public class Peca implements Vendavel, Produto {

  public String descricao;
  public int custo;


  public Peca(String descricao, int custo){
    this.custo = custo;
    this.descricao = descricao;
  }

  public double retornarPrecoVenda() {
    return this.custo * 0.3;
  }


  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public void setCusto(int custo) {
    this.custo = custo;
  }

  
}
