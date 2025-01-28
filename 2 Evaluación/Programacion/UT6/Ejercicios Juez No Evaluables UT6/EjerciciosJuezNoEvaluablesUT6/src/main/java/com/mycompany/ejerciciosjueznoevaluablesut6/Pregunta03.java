package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
public class Pregunta03 {
    
    //  Programa que lea 9 números sobre un vector, multiplique cada uno de los elementos por 2 y visualice el contenido del vector.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros = new int[9];
        for(int i=0; i<numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        for(int i=0; i<numeros.length; i++){
            if(i>0){
                System.out.print(", ");
            }
            System.out.print(numeros[i]*2);
        }
    }
}
