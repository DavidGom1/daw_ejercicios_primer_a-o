package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
public class Pregunta06 {
    
    /*
        Programa que lea 12 números enteros sobre un vector y los visualice al revés, es decir, 
        comienza por final del vector y termina por el elemento 0. 
        ¡Ojo! El for tiene que decrementar la variable de control, no incrementarla.
    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros = new int[12];
        for(int i = 0; i<numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        for(int i = numeros.length; i>0; i--){
            System.out.printf("%d ",numeros[i-1]);
        }
    }
}
