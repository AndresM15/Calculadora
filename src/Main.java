import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        Scanner scanner = new Scanner(System.in);
        String opcion = "";
        System.out.println("Bienvenido a la calculadora "+"/n");
        System.out.println("1: Sumar, 2: Restar, 3: Multiplicar,4: Dividir, 5: Salir, 6:Acumulado");
        String opcion = scanner.nextLine();
        double acumulado=0;
        while (!opcion.equals("5")) {
            if (opcion.equals("1")) {
                System.out.println("Ingrese el primer numero");
                float num1 = scanner.nextFloat();
                System.out.println("Ingrese el segundo numero");
                float num2 = scanner.nextFloat();
                System.out.println(operaciones.sumar(num1,num2));
                acumulado=operaciones.sumar(num1,num2);
            }else if (opcion.equals("2")) {
                System.out.println("Ingrese el primer numero");
                float num1 = scanner.nextFloat();
                System.out.println("Ingrese el segundo numero");
                float num2 = scanner.nextFloat();
                System.out.println(operaciones.restar(num1,num2));
                acumulado=operaciones.restar(num1,num2);
            }else if (opcion.equals("3")) {
                System.out.println("Ingrese el primer numero");
                float num1 = scanner.nextFloat();
                System.out.println("Ingrese el segundo numero");
                float num2 = scanner.nextFloat();
                System.out.println(operaciones.multiplicar(num1,num2));
                acumulado=operaciones.multiplicar(num1,num2);
            }else if (opcion.equals("4")) {
                System.out.println("Ingrese el primer numero");
                float num1 = scanner.nextFloat();
                System.out.println("Ingrese el segundo numero");
                float num2 = scanner.nextFloat();
                System.out.println(operaciones.dividir(num1,num2));
                acumulado=operaciones.dividir(num1,num2);
            }else if(opcion.equals("5")) {
                System.out.println(acumulado);
            }
        }





    }
}