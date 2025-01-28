package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
public class Pregunta08 {
    
    /*
        Introducir 4 números y almacenarlos en una matriz de 2 por 2.
        Visualizar la matriz usando los métodos leerMatriz() y mostrarMatriz() de la tutoría.
    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] miMatriz = leerMatriz(2, 2);
        mostrarMatriz(miMatriz);
        
    }
    static int[][] leerMatriz(int x, int y){
        int[][] matriz = new int[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                matriz[i][j]=sc.nextInt();
            }
        }
        return matriz;
    }
    static void mostrarMatriz(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.printf("%d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}