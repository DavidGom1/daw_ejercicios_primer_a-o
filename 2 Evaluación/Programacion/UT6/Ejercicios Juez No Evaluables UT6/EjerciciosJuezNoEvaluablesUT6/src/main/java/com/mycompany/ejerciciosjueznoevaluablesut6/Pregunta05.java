package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Pregunta05 {
    
    //  Leer 7 letras sobre un vector. Visualiza cuántas vocales hay.
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] letras = new String[7];
        int vocales = 0;
        Pattern p = Pattern.compile("[aeiou]");
        for(int i=0; i<letras.length; i++){
            letras[i] = sc.nextLine();
            Matcher m = p.matcher(letras[i]);
            if(m.find())vocales++;
        }
        System.out.printf("Vocales=%d%n", vocales);
    }
}
