package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Pregunta12 {
    
    /*  
        Valida con expresiones regulares la dirección de una página web. 
        Empezando por www. más cualquier caracter seguido de "."  
        y como mínimo dos caracteres a contuación (del punto)
    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String web = sc.nextLine();
        if(webValidator(web)){
            System.out.println("Valido");
        } else {
            System.out.println("No valido");
        }
    }
    static boolean webValidator(String direction){
        boolean valid = false;
        String[] splitDirection = direction.split("\\.");
        Pattern p = Pattern.compile("www");
        Matcher m = p.matcher(splitDirection[0]);
        valid = m.find()&&(splitDirection[1].length()>2)?true:false;
        return valid;
    }
}