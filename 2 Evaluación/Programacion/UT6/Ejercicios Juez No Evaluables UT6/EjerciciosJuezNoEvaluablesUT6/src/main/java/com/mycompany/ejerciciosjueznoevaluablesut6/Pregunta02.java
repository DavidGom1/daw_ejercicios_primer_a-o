package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
public class Pregunta02 {
    
    //  Introducir 5 números en un array y visualizar cuántos son menores que el último valor introducido en el vector.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numerosMayores = 0;
        int[] numeros = new int[5];
        for(int i=0; i<numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        for(int num : numeros){
            if(num>numeros[4]){
                numerosMayores++;
            }
        }
        System.out.printf("Hay %d mayores que el último%n", numerosMayores);
    }
}
