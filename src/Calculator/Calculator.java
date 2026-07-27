package Calculator;

import java.util.Scanner;

public class Calculator {
    public void start(){

        Scanner sc = new Scanner(System.in);
        int op;
        do{
            printOptions();
            op = sc.nextInt();
            while(op>5||op<1){
                System.out.print("Pls enter correct option");
                op=sc.nextInt();
            }
            if(op != 5){
                System.out.print("Please enter two values: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double result=performOperation(op,a,b);
                System.out.println("Result: "+result);
            }
        }while(op != 5);
    }
    private void printOptions(){
        System.out.println("------- CALCULATOR -------");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Exit");
    }
    private double add(double a,double b){
        return a+b;
    }
    private double sub(double a,double b){
        return a-b;
    }
    private double mul(double a,double b){
        return a*b;
    }
    private double div(double a,double b){
        if(b!=0) {
            return a / b;
        }
        else{
            System.out.println("Cannot divide by zero");
            return Double.NaN;
        }
    }
    private double performOperation(int op,double a,double b){
        switch(op){
            case 1:
                return add(a,b);
            case 2:
                return sub(a,b);
            case 3:
                return mul(a,b);
            case 4:
                return div(a,b);
            default:
                return Double.NaN;
        }
    }
}
