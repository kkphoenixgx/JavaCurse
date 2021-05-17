/**
Exercicio aula 1 de prgramação java
 */


public class exercicio1 {
        
    public static void main(String[] args) {
       
        /**
         * Variantes
         */
        String product1 = "Computer";
        String product2 = "Ofice desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50 ;
        double measure  = 53.254567;

        /**
        * Código
        */
 
        System.out.println("Products :");
        System.out.println(product1 + ", which price is " + price1);
        System.out.println(product2 + ", which price is " + price2);

        System.out.println("Record : " + age + " years old, code " + code + " and gender :" + gender);

        System.out.println("Measure with eight decimal places: " + measure);
        System.out.printf("Rouded (Three decimal places): " + "%.3f%n" , measure); 

    
    }


}