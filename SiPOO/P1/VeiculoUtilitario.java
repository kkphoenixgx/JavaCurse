package SiPOO.P1;

public class VeiculoUtilitario extends Veiculo {

  public int capacidadeDeCarga;

  public VeiculoUtilitario(String modelo, int number, float valorMercado, Motor motor, int capacidadeDeCarga){
    super(modelo, number, valorMercado, motor); 
    this.capacidadeDeCarga = capacidadeDeCarga;
  }

  public double getValorImposto(){
    return this.valorMercado * 0.2; 
  }
}
