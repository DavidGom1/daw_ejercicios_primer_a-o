package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
public class Pregunta10 {
    
    /*
        Muestra la diagonal principal de una matriz de 2x2
    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] miMatriz = leerMatriz(2, 2);
        mostrarDiagonalMatriz(miMatriz);
        
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
    static void mostrarDiagonalMatriz(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            System.out.printf("%d%n",matriz[i][i]);
        }
    }
}