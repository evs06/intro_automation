package ejemplosClase;

import libs.Input;

public class EjemploNombreEdadSalario {
    public static void main(String args[]) {

        System.out.println("¿Cuál es tu Edad? ");
        int edad = Input.get_int();

        System.out.println("¿Cuál es tu Nombre? ");
        String nombre = Input.get_string();

        System.out.println("¿Cuál es tu Profesión? ");
        String profesion = Input.get_string();

        System.out.println(nombre + " tiene " + edad + " años y es " + profesion );




    }

}
