package Classes;

public class Studant {
    
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalNote(){

        return nota1 + nota2 + nota3; 
    }

    public double result(){ 

        double pass = 0.0;

        if ( finalNote() < 60 ){
            pass = finalNote() - 60;
        } 
        else if (finalNote() > 60) {
            pass = 0.0;
        }
        return pass;
        
    }
}
