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
        System.out.println("=> Opción 5:");
        System.out.println("=> Opción 6:");
        System.out.println("=> Opción 7:");
        System.out.println("=> Opción 8:");
        System.out.println("=> Opción 9:");
        System.out.println("============================================");
        
        System.out.println("=> Inserta la opción deseada");
        int opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                numericos(); // Almacenar 5 números en un array
                break;
            case 2:
                inverso(); // Introducir 5 números e imprimirlos al inverso
                break;
            case 3:
                media(); // Media de números y contador de ceros
                break;
            case 4:
                cantidad_caracteres(); // Leer la cantidad de caracteres en una cadena
                break;
            case 5:
                String texto = input.nextLine();
                invertir_texto(texto);
                System.out.println();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
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

    public static void cantidad_caracteres() { // Leer la cantidad de caracteres en una cadena
        System.out.println("\n===> Contar carácteres de una cadena.\n");
        String cadena = input.nextLine();
        System.out.println("=> La cadena introducida tiene " + cadena.length() + " carácteres.");
    }

    public static String invertir_texto(String texto) {
        for(int i = 0; i < texto.length(); i++) {
            
        }
        return texto;
    }
}
