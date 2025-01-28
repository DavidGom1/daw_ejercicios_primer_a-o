package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
public class Pregunta04 {
    
    //  Introducir la edad de 7 personas sobre un vector. ¿Cuántas son mayores de edad?
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] personas = new int[7];
        int mayoresEdad = 0;
        for(int i=0; i<personas.length; i++){
            personas[i] = sc.nextInt();
            if(personas[i]>=18){
                mayoresEdad++;
            }
        }
        System.out.printf("Mayores de edad=%d%n", mayoresEdad);
    }
}
