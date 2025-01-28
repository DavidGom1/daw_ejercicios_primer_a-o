package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
public class Pregunta07 {
    
    /*  
        Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: 
        la posición T[n,m] debe contener n+m. Después se debe mostrar su contenido.
    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int filas = 0;
        int columnas = 0;
        System.out.println("Introduce el numero de filas");
        filas = sc.nextInt();
        System.out.println("Introduce el numero de columnas");
        columnas = sc.nextInt();
        int[][] tabla = new int[filas][columnas];
        System.out.println("TABLA: \n");
        for(int i = tabla.length; i>0; i--){
            for(int j = 0; j<tabla[i-1].length; j++){
                tabla[i-1][j] = i+j-1;
                System.out.printf("%d ", tabla[i-1][j]);
            }
            if(i>1)System.out.println();
        }
        
    }
}
