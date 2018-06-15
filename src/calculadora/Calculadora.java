package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculadora {
    public static int opcion,operador1,operador2,resultado,numero;
    public static float resultado2;
    public static double numbinario;
    public static void main(String[] args) throws IOException {
        imprimeMenu();
        if(opcion != 5){
            preguntaOpcion();
        }else{
            binariopreguntar();
        }
        while(opcion!=5){
            preguntaOperadores();
            switch(opcion){
            case 1:
                suma(operador1,operador2);
                break;
            case 2:
                resta(operador1,operador2);
                break;
            case 3:
                multiplica(operador1,operador2);
                break;
            case 4:
                divide(operador1,operador2);
                break;
            case 5:
                binario(numero);
                break;
            default:
                System.out.println("Opcion pulsada no valida");
                break;
            }
            System.out.println("");
            imprimeMenu();
            preguntaOpcion();
        }
        System.out.println("Fin de aplicacion");

    }
    private static void divide(int operador1, int operador2) {
        resultado2=(operador1/operador2);
        System.out.println("La division de "+operador1+" / "+operador2+" es "+resultado2);
        
    }
    private static void multiplica(int operador1, int operador2) {
        resultado=operador1*operador2;
        System.out.println("La multiplicacion de "+operador1+" * "+operador2+" es "+resultado);
        
    }
    private static void resta(int operador1, int operador2) {
        resultado=operador1-operador2;
        System.out.println("La resta de "+operador1+" - "+operador2+" es "+resultado);
        
    }
    private static void suma(int operador1, int operador2) {
        resultado=operador1+operador2;
        System.out.println("La suma de "+operador1+" + "+operador2+" es "+resultado);
        
    }
    private static void preguntaOperadores() throws  IOException {
        System.out.println("Operador1 ?");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        operador1=Integer.parseInt(br1.readLine());
        System.out.println("Operador2 ?");
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
        operador2=Integer.parseInt(br2.readLine());
    }
    private static void preguntaOpcion() throws  IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        opcion=Integer.parseInt(br.readLine());
        
    }
    private static void imprimeMenu() {
        System.out.println("Menu Opciones");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Binario");
        System.out.println("6. Salir");
        
    }

    private static void binario(int numero) {
        int  exp, digito;
        Scanner sc = new Scanner(System.in);
        while(numero<0){

        exp=0;
        numbinario=0;
        while(numero!=0){
                digito = numero % 2;            
                numbinario = numbinario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
            }
        }
        System.out.printf("Binario: %.0f %n", numbinario);
    }

    private static void binariopreguntar() throws  IOException {
        System.out.println("numero entero convertir en binario");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        numero=Integer.parseInt(br1.readLine());
    }

}

