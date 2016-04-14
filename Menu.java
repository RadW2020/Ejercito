/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaconjuntaclase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Menu {
    
    public String muestraMenu(){
    
      Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            try {

                System.out.println("Elige una opción : \n1. Mostrar lista candidatos.\n2. Mostrar puestos sin asignar.\n3. Salir.");

                opcion = teclado.nextInt();

                if (opcion != 1 && opcion != 2 && opcion != 3) {

                    System.err.println("OPCIÓN NO VÁLIDA, INTÉNTALO DE NUEVO.");
                }
            } catch (InputMismatchException e) {

                teclado.nextLine();

                opcion = 6;

                System.err.println("OPCIÓN NO DISPONIBLE, PRUEBA OTRA VEZ.");

            }

            switch (opcion) {

                case 1:

                    System.out.println("Pendiente del paso de parámetros");

                    break;
                case 2:

                    System.out.println("Pendiente del paso de parámetros");

                    break;
                case 3:

                    System.out.println("cPendiente del paso de parámetros");

                    break;
            }

        } while (opcion != 1 && opcion != 2 && opcion != 3);
        
        System.out.println("GRACIAS POR UTILIZAR NUESTRA APLICACIÓN.");
    
}
}