package Classes;
public class Retangulo {

    public double width;
    public double height;

    public double area(){
        double area = width * height;
        return area;
    }

    public double perimeter(){
        double p = (width * 2) + height * 2;
        return p;
    }

    public double diagonal(){
        double diagonalIncompleta = width * width + height * height;
        return Math.sqrt(diagonalIncompleta);
    }
}
