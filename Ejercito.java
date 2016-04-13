/*
 * Aplicación para la asignación de destinos para los candidatos del ejército.
 * 
 */
package ejercito;

/**
 * @author Jose Francisco Ortigosa Campos
 * @author Jose Luis Ruiz López
 */
public class Ejercito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Comprobación de que existen los archivos (grupo 1)*/
        if (puestos.exists()&& candidatos.exists())
        /* Recorrido array puestos (grupo 3)*/    
         for (i=0, i< array_Puestos.lenght, i++){
             Lista_Puestos.set_Puestos();
         }
        /* Recorrido array candidatos (grupo 2)*/
         for (i=0, i< array_Candidatos.lenght, i++){
             Lista_Candidatos.set_Candidatos();
         } 
        /* Llamada al metodo pàra ordenar el array Candidatos*/ 
        array_Candidatos.ordenar_Candidatos();
         for (i=0, i< array_Candidatos.lenght, i++){
             Candidato.asignar();
         }
        /*Llamada al método para mostrar el menú*/ 
        Menu.muestaMenu(); 
    }
    
    
}
