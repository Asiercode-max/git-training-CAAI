
package caai.teamgenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = -1;

        while (opcion != 0) {

            System.out.println("========================");
            System.out.println("       TEAM GENERATOR");
            System.out.println("========================");
            System.out.println("Equipo: Byte Busters");
            System.out.println("1. Ver miembros");
            System.out.println("2. Ver tecnologías");
            System.out.println("3. Ver información del proyecto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ver miembros");
                    break;

                case 2:
                    System.out.println("Ver tecnologías");
                    break;

                case 3:
                    System.out.println("Ver información del proyecto");
                    break;

                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

            System.out.println();
        }

        teclado.close();
    }

    public static void verInformacion() {
        System.out.println("\n--------------------------------");
        System.out.println("       INFORMACION DEL PROYECTO");
        System.out.println("--------------------------------");

        System.out.println("Nombre: Byte Busters");
        System.out.println("Proyecto: Team Generator");
        System.out.println("Objetivo: Crear una aplicacion Java");
        System.out.println("Herramientas: Java, Maven y Git");
        System.out.println("Repositorio: GitHub");

        System.out.println("--------------------------------");
        System.out.println("Desarrollado por el equipo CAAI");
        System.out.println("--------------------------------");
    }
}
