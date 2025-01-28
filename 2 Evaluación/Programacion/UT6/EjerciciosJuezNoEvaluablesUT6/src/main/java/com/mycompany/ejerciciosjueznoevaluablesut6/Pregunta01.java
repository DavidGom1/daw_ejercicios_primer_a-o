package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;

public class Pregunta01 {
    
    //  Leer 8 números con la clase Scanner, almacenarlos en un vector y visualizarlos.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros = new int[8];
        for(int i=0; i<numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        for(int num : numeros){
            System.out.printf("%d ", num);
        }
    }
}
