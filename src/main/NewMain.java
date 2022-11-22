package main;
import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String operacion, decision;
        int entrada, resultado;
        System.out.println("Que operacion desea hacer?");
        System.out.println("1)suma");
        System.out.println("1)resta");
        System.out.println("1)multiplicacion");
        System.out.println("1)division");
        System.out.println("1)exponenciacion");
        System.out.println("1)raices");
        System.out.println("*****************************");
        operacion = scan.nextLine();
        switch (operacion) {
            case "suma" -> {
                System.out.println("Introduzca su primer numero");
                entrada = scan.nextInt();
                resultado = entrada;
                System.out.println("Introduzca el siguiente numero");
                entrada = scan.nextInt();
                resultado = resultado + entrada;
                for (boolean flag = false; flag!=true;) {
                    System.out.println("Desea sumar mas numeros? s/n");
                    System.out.println("");
                    String nuevo = scan.nextLine();
                    decision = scan.nextLine();
                    if(decision.equals("s")) {
                        System.out.println("Introduzca su siguiente numero");
                        entrada = scan.nextInt();
                        resultado = resultado + entrada;
                    } else {
                        flag = true;
                    }
                }
            }
            case "resta" -> {
                System.out.println("Introduzca su primer numero");
                entrada = scan.nextInt();
                resultado = entrada;
                System.out.println("Introduzca el siguiente numero");
                entrada = scan.nextInt();
                resultado = resultado - entrada;
            }
            case "multiplicacion" -> {
                System.out.println("Introduzca su primer numero");
                entrada = scan.nextInt();
                resultado = entrada;
                System.out.println("Introduzca el siguiente numero");
                entrada = scan.nextInt();
                resultado = resultado * entrada;
            }
            case "division" -> {
                System.out.println("Introduzca su primer numero");
                entrada = scan.nextInt();
                resultado = entrada;
                System.out.println("Introduzca el siguiente numero");
                entrada = scan.nextInt();
                resultado = resultado / entrada;
            }
            case "exponenciacion" -> {
                System.out.println("Introduzca el numero que desee exponenciar");
                entrada = scan.nextInt();
                resultado = entrada;
                System.out.println("Introduzca el exponente");
                entrada = scan.nextInt();
                resultado = resultado ^ entrada;
            }
            case "raices" -> {
                System.out.println("Introduzca su primer numero");
                entrada = scan.nextInt();
                resultado = entrada;
                System.out.println("Introduzca el siguiente numero");
                entrada = scan.nextInt();
                resultado = resultado + entrada;
            }
            default -> throw new AssertionError();
        }
        System.out.println("El resultado de su operacion es: " + resultado);
    }
}