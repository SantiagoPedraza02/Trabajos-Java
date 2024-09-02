import java.io.Console;
import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        System.out.println("**** Aplicacion Calculadora ****");
        System.out.print("Ingrese el valor 1:");
        Scanner console=new Scanner(System.in);
        var op1= Integer.parseInt(console.nextLine());
        System.out.print("Ingrese el valor 2:");
        var op2=Integer.parseInt(console.nextLine());;
        var result=op1+op2;
        System.out.println("El resultado es:"+result);
    }
}
