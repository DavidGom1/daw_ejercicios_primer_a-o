package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Pregunta13 {
    
    /*  
        Validar ISBN con un total de 12 digitos, que siempre empieza en 978 o 979.
    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String isbn = sc.nextLine();
        if(isbnValidator(isbn)){
            System.out.println("Valido");
        } else {
            System.out.println("No valido");
        }
    }
    static boolean isbnValidator(String direction){
        boolean valid = false;
        Pattern p = Pattern.compile("^978|^979");
        Matcher m = p.matcher(direction);
        valid = m.lookingAt();
        return valid;
    }
}