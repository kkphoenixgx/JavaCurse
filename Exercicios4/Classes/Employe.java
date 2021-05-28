package Classes;
public class Employe {

    public String name;
    public double grossSalary;
    public double tax;
    public double porcentage;
    
    public double netSalary(){
        return grossSalary - tax;
    }

    public double IncraseSalary(){
        double salarioComTaxa =  grossSalary - tax;
        return salarioComTaxa + (porcentage * salarioComTaxa )/ 100;
    }
}