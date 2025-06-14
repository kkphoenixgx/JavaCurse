package SiPOO.P2;

public class Motocicleta implements ITanque {
  public int capacidadeDoTanque;
  public int qtdCombustivelTanque;

  public Motocicleta(int capacidadeDoTanque, int qtdCombustivelTanque){
    this.capacidadeDoTanque = capacidadeDoTanque;
    this.qtdCombustivelTanque = qtdCombustivelTanque;
  }

  public double completarTanque(){
    double qtdAbastecida = this.capacidadeDoTanque - this.qtdCombustivelTanque;
    
    this.qtdCombustivelTanque = this.capacidadeDoTanque;
    
    return qtdAbastecida;
  }

}
