package SiPOO.P1;

public class ContadorDeImpostos {
  
  public double totalGatosComImpostos = 0.0;  
  
  public void acumularGastosComImpostos(ITribute object ){
    setTotalGatosComImpostos( totalGatosComImpostos+ object.getValorImposto());
  }

  public void setTotalGatosComImpostos(double totalGatosComImpostos) {
    this.totalGatosComImpostos = totalGatosComImpostos;
  }
  public double getTotalGatosComImpostos() {
    return this.totalGatosComImpostos;
  }
}
