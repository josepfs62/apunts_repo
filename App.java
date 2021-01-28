package practica1.src;

import java.util.Scanner;
import java.util.Arrays;

public class App {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        System.out.println("   Menú Baratero                                              ");
        System.out.println("==============================================================");
        System.out.println("=> Opción 1: Almacenar 5 números en un array.                 ");
        System.out.println("=> Opción 2: Introducir 5 números e imprimirlos al inverso.   ");
        System.out.println("=> Opción 3: Media de números y contador de ceros.            ");
        System.out.println("=> Opción 4: Leer la cantidad de caracteres en una cadena.    ");
        System.out.println("=> Opción 5: Invertir texto introducido                       ");
        System.out.println("=> Opción 6: Eliminar espacios de un texto                    ");
        System.out.println("=> Opción 7: Concatenar dos cadenas                           ");
        System.out.println("=> Opción 8: Cambiar las vocales por una especificada         ");
        System.out.println("=> Opción 9: Mostrar códigos ASCII                            ");
        System.out.println("==============================================================");
        
        System.out.println("=> Inserta la opción deseada");
        int opcion = input.nextInt();
        input.nextLine(); // Limpiar buffer dentro del input
        String texto = "";

        switch (opcion){
            case 1: // Almacenar 5 números en un array
                numericos();
                break;
            case 2: // Introducir 5 números e imprimirlos al inverso
                inverso();
                break;
            case 3: // Media de números y contador de ceros
                media();
                break;
            case 4: // Leer la cantidad de caracteres en una cadena
                System.out.println("\n===> Contar carácteres de una cadena.\n");
                String cadena = input.nextLine();
                int cantidad_caracteres = cantidad_caracteres(cadena);
                System.out.println("=> La cadena introducida tiene " + cantidad_caracteres + " carácteres.");
                break;
            case 5: // Invertir texto introducido
                System.out.println("\n===> Invertir el texto de una cadena.\n");
                texto = input.nextLine();
                String texto_invertido = invertir_texto(texto);
                System.out.println("=> El texto invertido es:\n   " + texto_invertido);
                break;
            case 6: // Eliminar espacios de un texto
                System.out.println("\n===> Condensar los espacios de una cadena.\n");
                texto = input.nextLine();
                String texto_condensado = condensador(texto);
                System.out.println("=> El texto condensado es:\n   " + texto_condensado);
                break;
            case 7: // Concatenar dos cadenas
                System.out.println("\n===> Condensar los espacios de una cadena.\n");
                String texto_1 = input.nextLine();
                String texto_2 = input.nextLine();
                String texto_concatenado = concatenar_cadenas(texto_1, texto_2);
                System.out.println("=> El texto concatenado es:\n   " + texto_concatenado);
                break;
            case 8: // Cambiar las vocales por una especificada
                System.out.println("\n===> Modificar todas las vocales por la vocal especificada.\n");
                System.out.println("\n===> Frase:");
                texto = input.nextLine();
                System.out.println("\n===> Vocal:");
                String vocal = input.nextLine();
                vocalizador(texto, vocal);
                break;
            case 9: // Mostrar códigos ASCII
                System.out.println("=> Mostrar códigos ASCII de cada carácter de una cadena");
                texto = input.nextLine();
                mostrar_ascii(texto);
                break;
            default:
                main(args);
        }
    }

    public static Integer[] numericos() { // Almacenar 5 números en un array
        System.out.println("\n===> Añadir numeros a un array.\n");
        Integer[] array_nums = new Integer[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("=> Inserta el número " + (i+1));
            int num = input.nextInt();
            array_nums[i] = num;
            System.out.println("=> El número " + num + " se ha añadido.\n");
        }

        System.out.println("=> El array ahora es: " + Arrays.toString(array_nums));
        return array_nums;
    }

    public static void inverso(){ // Introducir 5 números e imprimirlos al inverso
        System.out.println("\n===> Imprimir un array al inverso.");
        Integer[] array_nums = numericos();
        
        Integer[] array_inverso = new Integer[array_nums.length];
        int posicion = array_nums.length -1;
        
        for (int i=0; i < array_nums.length; i++){
            array_inverso[posicion] = array_nums[i];
            posicion -= 1;
        }
        
        System.out.println("=> El array inverso es: " + Arrays.toString(array_inverso));
    }

    public static void media() { // Media de números y contador de 0
        System.out.println("\n===> Media de positivos, negativos y contador de ceros.");
        Integer[] array_nums = numericos();

        int contador_positivos = 0;
        float valor_positivos = 0;
        int contador_negativos = 0;
        float valor_negativos = 0;
        int contador_ceros = 0;

        for (int i = 0; i < array_nums.length; i++) {
            System.out.println(array_nums[i]);
            if (array_nums[i] < 0) {
                valor_negativos += array_nums[i];
                contador_negativos += 1;
            } else if (array_nums[i] > 0) {
                valor_positivos += array_nums[i];
                contador_positivos += 1;
            } else {
                contador_ceros += 1;
            }
        }

        float media_negativos = valor_negativos / contador_negativos;
        float media_positivos = valor_positivos / contador_positivos;
        System.out.println("\n===> La media de positivos es de: "+media_positivos+"; la de negativos: "+media_negativos+"; y hay "+ contador_ceros+" ceros.");
    }

    public static int cantidad_caracteres(String cadena) { // Leer la cantidad de caracteres en una cadena
        return cadena.length();
    }

    public static String invertir_texto(String texto) { // Invertir texto introducido
        String texto_invertido = "";
        for(int i = texto.length() - 1; i >= 0; i--) {
            texto_invertido += texto.charAt(i);
        }
        return texto_invertido;
    }

    public static String condensador(String texto) { // Eliminar espacios de un texto
        String texto_condensado = "";
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {
                texto_condensado += texto.charAt(i);
            }
        }
        return texto_condensado;
    }

    public static String concatenar_cadenas(String texto_1, String texto_2) { // Concatenar dos cadenas
        String texto_concatenado = texto_1 + " " + texto_2;
        return texto_concatenado;
    }

    public static void vocalizador(String texto, String vocal) { // Cambiar las vocales por una especificada
        String texto_final = "";
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i' || texto.charAt(i) == 'o'
                    || texto.charAt(i) == 'u') {
                texto_final += vocal;
            } else {
                texto_final += texto.charAt(i);
            }
        }
        System.out.println("=> El texto final es:\n   " + texto_final);
    }

    public static void mostrar_ascii(String texto) { // Mostrar códigos ASCII
        System.out.println("=> Mostrando códigos ASCII");
        for (int i = 0; i < texto.length(); i++) {
            int ascii = (int) texto.charAt(i);
            System.out.println(" > \'" + texto.charAt(i) + "\' = " + ascii);
        }
    }
}
