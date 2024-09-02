import java.util.Scanner;

public class CalculadoraAppMenu {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int opcion =0;

        while (opcion != 5) {
            System.out.println("**** Aplicacion Calculadora ****");
            System.out.println("1.Suma \n2.Resta \n3.Multiplicacion\n4.Division\n5.Salir");
            System.out.println("Ingrese una opcion:");
            opcion = Integer.parseInt(console.nextLine());
            if (opcion==5){
                System.out.println("Hasta Pronto...");
                break;
            }
            System.out.println("Ingrese el numero 1:");
            int num1=Integer.parseInt(console.nextLine());
            System.out.println("Ingrese el numero 2:");
            int num2=Integer.parseInt(console.nextLine());
            int result;
            switch (opcion) {

                case 1->{
                    result=num1+num2;
                    System.out.println("El resultado es:"+result);
                }

                case 2 ->{
                    result=num1-num2;
                    System.out.println("El resultado es:"+result);
                }

                case 3 ->{
                    result=num1*num2;
                    System.out.println("El resultado es:"+result);
                }

                case 4 ->{
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("El resultado es: " + result);
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }

                }
                default ->{
                    System.out.println("No se ha elegido una opcion correcta" +opcion);
                }

            }

        }
    }
}
