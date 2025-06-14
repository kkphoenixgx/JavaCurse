package SiPOO.P1;

public class Veiculo {
  public String modelo;
  public int number;
  public float valorMercado;
  private Motor motor;

  
  public Veiculo (String modelo, int number, float valorMercado, Motor motor){
    this.modelo = modelo;
    this.number = number;
    this.valorMercado = valorMercado;
    this.motor = motor;
  }

 public String getModelo() { return modelo; }
 public Motor getMotor() { return motor; }
 public int getNumber() { return number; }

 public void setModelo(String modelo) { this.modelo = modelo; }
 public void setMotor(Motor motor) { this.motor = motor; }
 public void setNumber(int number) { this.number = number; }
 public void setValorMercado(float valorMercado) { this.valorMercado = valorMercado; }

}
