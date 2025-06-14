package SiPOO.P2Online;

public class Acessorio implements Produto, Vendavel {

  public String descricao;
  public int custo;


  public Acessorio(String descricao, int custo){
    this.custo = custo;
    this.descricao = descricao;
  }

  public double retornarPrecoVenda() {
    return this.custo * 0.2;
  }


  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
  public void setCusto(int custo) {
    this.custo = custo;
  }
  
}
