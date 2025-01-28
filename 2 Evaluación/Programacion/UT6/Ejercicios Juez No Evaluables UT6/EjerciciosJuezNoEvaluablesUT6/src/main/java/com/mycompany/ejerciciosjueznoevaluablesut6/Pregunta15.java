package com.mycompany.ejerciciosjueznoevaluablesut6;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Pregunta15 {
    
    /*  
        Valida un usuario en twitter, que empiece por @ y puede contener letras mayúsculas y minúsculas, números
    */
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String user = sc.nextLine();
        if(userValidator(user)){
            System.out.println("Valido");
        } else {
            System.out.println("No valido");
        }
    }
    static boolean userValidator(String user){
        boolean valid = false;
        Pattern p = Pattern.compile("@[a-zA-Z0-9]+");
        Matcher m = p.matcher(user);
        valid = m.matches();
        return valid;
    }
}