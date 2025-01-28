package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
public class Pregunta11 {
    
    /*  
        Realiza un programa que lea 9 números.
        El primer número es la opción elegida: 0 (todos), un 1 (impares), o un 2 (pares).
        Almacena los 8 números siguientes en una matriz de 4 filas y 2 columnas. 
        Obtén los datos usando el método leerMatriz().
        Muestra los datos de la matriz, usando el método mostrarMatriz().   
        Deberás modificar dicho método, para que acepte como segundo parámetro
        un 0 (todos), un 1 (impares), o un 2 (pares).
    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int option = sc.nextInt();
        int[][] miMatriz = leerMatriz(4, 2);
        mostrarMatriz(miMatriz, option);
        
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
    static void mostrarMatriz(int[][] matriz, int option){
        
        if(option==0){
            for(int i=0; i<matriz.length; i++){
                for(int j=0; j<matriz[i].length; j++){
                    System.out.printf("%d ",matriz[i][j]);
                }
                System.out.println();
            }
        } else if (option==1){
            for(int i=0; i<matriz.length; i++){
                if(i%2!=0){
                    for(int j=0; j<matriz[i].length; j++){
                        System.out.printf("%d ",matriz[i][j]);
                    }
                    System.out.println();
                }
            }
        } else if (option==2){
            for(int i=0; i<matriz.length; i++){
               if(i%2==0){
                    for(int j=0; j<matriz[i].length; j++){
                        System.out.printf("%d ",matriz[i][j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}