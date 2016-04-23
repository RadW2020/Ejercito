package ejercito;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Menu {
    
    public static void muestraMenu(ListaCandidatos listaC, ListaPuestos listaP){
    
        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            try {

                System.out.println("Elige una opción : \n"
                        + "1. Mostrar lista candidatos.\n"
                        + "2. Mostrar puestos sin asignar.\n"
                        + "3. Mostrar puestos.\n"
                        + "4. Salir.");

                opcion = teclado.nextInt();

                if (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4) {

                    System.err.println("OPCIÓN NO VÁLIDA, INTÉNTALO DE NUEVO.");
                }
            } catch (InputMismatchException e) {

                teclado.nextLine();

                opcion = 6;

                System.err.println("OPCIÓN NO DISPONIBLE, PRUEBA OTRA VEZ.");

            }

            switch (opcion) {

                case 1: 
                    
                    listaC.mostrarCandidatos();
                    
                    break;
                case 2:

                    listaP.mostrarPuestosSinAsignar();

                    break;
                case 3:

                    listaP.mostrarPuestos();

                break;
                
            }

        } while (opcion != 4);
        
        System.out.println("GRACIAS POR UTILIZAR NUESTRA APLICACIÓN.");
    
    }
}