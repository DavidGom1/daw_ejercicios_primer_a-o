package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
public class Pregunta14 {
    
    /*  
        Validar número entero negativo.
    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numero = sc.nextInt();
        if(numNegativeValidator(numero)){
            System.out.println("Valido\n");
        } else {
            System.out.println("No valido\n");
        }
    }
    static boolean numNegativeValidator(int num){
        boolean valid = false;
        if(num<0)valid = true;
        return valid;
    }
}