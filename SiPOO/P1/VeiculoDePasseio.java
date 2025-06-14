package SiPOO.P1;

public class VeiculoDePasseio extends Veiculo {
  
  public VeiculoDePasseio(String modelo, int number, float valorMercado, Motor motor){
    super(modelo, number, valorMercado, motor);
  }

  public double getValorImposto(){
    return this.valorMercado * 0.1;
  }

}