import java.util.Scanner;
import java.util.ArrayList;
//import Class.Quartos;

public class IndexLoops{

    public static void oddNumbers(int n){
        for (int i = 0; i <= n; i++) {
            if(!(i % 2 == 0)){
                System.out.println(i);
            }
        }
    }
    public static void isBetween10to20(int n){

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[n];
        
        System.err.println("Write " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            numbers[i] = number;
        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] >= 10 && numbers[i] <= 20){
                System.out.println(numbers[i] + " in");
            }
            else{
                System.out.println(numbers[i] + " out");
            }
        }

    }
    public static void weightedAverage(int n){
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.err.println("Write 3 numbers:");
            
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            double weightedAverage = ( (a * 2) + (b * 3) + (c * 5) ) / 10;
            System.out.println("weightedAverage : " + weightedAverage);
        }


    }
    public static void divide(int divisionsQuantity){

        System.err.println("\n Write 2 numbers to divide for each division ");

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < divisionsQuantity; i++) {
            String text = sc.nextLine();
            String[] numbersStrings = text.split(" ");

            double a, b;
            try {
                double result;
                a = Double.parseDouble(numbersStrings[0]);
                b = Double.parseDouble(numbersStrings[1]);

                if (b == 0) {
                    System.err.println("ERROR: impossible Division");
                    System.exit(500);
                }
                
                result = a / b;
                System.out.println(result);

            } catch (Exception e) {
                System.err.println("ERROR: Write valid expression");
                System.exit(500);
            }
            
        }
    }
    public static int factorial(int x) {
        int result = 1;
    
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        if(x == 0 || x == 1) result = 1;
        
        return result;
    }
    public static void dividers(int x){
        
        ArrayList<Integer> listDividers = new ArrayList<>();
        listDividers.add(x);

        for (int i = 1; i < x; i++) {
            if(x % i == 0){
                listDividers.add(i);
                listDividers.add(-i);
            }
        }

        String message = "";
        for (Integer element : listDividers) {
            if(listDividers.get(0) == element){
                message = "" + element;
            }else{
                message = message + ", " + element;
            }
        }
        System.out.println(message);

    }
    public static void calcSquaresAndCubedValues(int lines){
        for (int i = 1; i <= lines; i++) {
            System.out.println(i + " " + i*i + " " + i*i*i);
        }
    }
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        // ----------- Exercise 1 -----------
        
        System.out.println("\n Write a number to check odds until it.");
        int numberExercise1 = sc.nextInt();
        oddNumbers(numberExercise1);
        
        // ----------- Exercise 2 -----------

        System.out.println(" \n Write down how much numbers you want to check if is between 10 and 20.");
        int numberExercise2 = sc.nextInt();
        isBetween10to20(numberExercise2);
        
        // ----------- Exercise 3 -----------
        
        System.out.println("\n Write how much weighted average you want to made:");
        int numberExercise3 = sc.nextInt();
        weightedAverage(numberExercise3);
        
        // ----------- Exercise 4 -----------
        
        System.out.println("\n Write how much divisions you want to made:");
        int divisionsQuantity = sc.nextInt();
        divide(divisionsQuantity);

        // ----------- Exercise 5 -----------
        
        System.out.println("\n Write the factorial number:");
        int factorialNumber = sc.nextInt();
        int resultExerciseFive = factorial(factorialNumber);
        System.out.println(resultExerciseFive);
        
        // ----------- Exercise 6 -----------
        
        System.out.println("\n Write the number to calc number's dividers:");
        int numberDivided = sc.nextInt();
        dividers(numberDivided);
        
        // ----------- Exercise 7 -----------
        System.out.println("\n Write the number of lines you want:");
        int lines = sc.nextInt();
        calcSquaresAndCubedValues(lines);

        sc.close();
    }
}


