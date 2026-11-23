
package caai.teamgenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static String[] miembros = {"Aaron","Asier","Iker","Cesar"};

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {

            System.out.println("===============================");
            System.out.println("       TEAM GENERATOR");
            System.out.println("===============================");
            System.out.println("Equipo: Byte Busters");
            System.out.println("1. Ver miembros");
            System.out.println("2. Ver tecnologías");
            System.out.println("3. Ver información del proyecto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            try {
                opcion = teclado.nextInt();
                teclado.nextLine();
                switch (opcion) {
                    case 1:
                        listarMiembros();
                        break;

                    case 2:
                        verTecnologias();
                        break;

                    case 3:
                        verInformacion();
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("Opcion no valida. Elige entre 0 y 3.");
                        break;
                }

            } catch (Exception e) {
                System.out.println("Elige opcion valida");
                teclado.nextLine();
            }
            System.out.println();
        }
        teclado.close();
    }


    public static void listarMiembros() {
        System.out.println("-------------------------------------");
        System.out.println("       LISTADO MIEMBROS");
        System.out.println("-------------------------------------");
        Arrays.stream(miembros).forEach(System.out::println);
    }

    public static void verInformacion() {
        System.out.println("-------------------------------------");
        System.out.println("       INFORMACION DEL PROYECTO");
        System.out.println("-------------------------------------");

        System.out.println("Nombre: CAAI");
        System.out.println("Proyecto: Team Generator");
        System.out.println("Objetivo: Crear una aplicacion Java");
        System.out.println("Herramientas: Java, Maven y Git");
        System.out.println("Repositorio: GitHub");

        System.out.println("--------------------------------");
        System.out.println("Desarrollado por el equipo CAAI");
        System.out.println("--------------------------------");
    }
    public static void verTecnologias() {

        System.out.println("-----------------------");
        System.out.println("    TECNOLOGIAS");
        System.out.println("-----------------------");

        System.out.println("Asier: Java, Kotlin, Python, C#, SQL");
        System.out.println("Aaron: Java, Kotlin, Python, C#, SQL");
        System.out.println("Cesar: Java, Kotlin, Python, C#, SQL");
        System.out.println("Iker: Java, Kotlin, Python, C#, SQL");
}
}
