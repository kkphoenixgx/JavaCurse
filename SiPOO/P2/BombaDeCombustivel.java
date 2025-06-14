package SiPOO.P2;

public class BombaDeCombustivel {

  public double totalDeComustivelUtilizado;
  
  public double abastecer(ITanque object){
    this.totalDeComustivelUtilizado = object.completarTanque();
    return object.completarTanque() ;
  }


}
