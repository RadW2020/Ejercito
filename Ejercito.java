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
        /* Se inicia instancia de clase de ListaCandidatos*/
        ListaCandidatos listaCandidatos = new ListaCandidatos();
        
        /* Se inicia instancia de clase de ListaPuestos*/
        ListaPuestos listaPuestos = new ListaPuestos();
        
        /* Se aplica su método constructor para hacer la lectura del archivo puestos.txt*/
        listaPuestos.ListaPuestos();
        
        /* Recorrido array puestos
        Muestra por pantalla los puestos aun sin asignar*/
        for (int i=0; i< listaPuestos.arrayPuestos.size(); i++){
            System.out.println(listaPuestos.arrayPuestos.get(i).toString());
        }
        
        /* Se aplica su método constructor para hacer la lectura del archivo candidatos.txt*/
        listaCandidatos.ListaCandidatos();
        
        /* Recorrido array candidatos (grupo 2)
        Muestra por pantalla los candidatos aun sin asignar ni ordenar */
        for (int i=0; i< listaCandidatos.arrayCandidatos.size(); i++){
            System.out.println(listaCandidatos.arrayCandidatos.get(i).toString());
            
        } 
        
        /* Llamada al metodo para ordenar el array Candidatos*/ 
        listaCandidatos.ordenarCandidatos();
        
        /* Llamada al metodo para iniciar el algoritmo de Asignación de puestos */
        listaCandidatos.Asignar(listaPuestos.arrayPuestos);
        
        /* Llamada al método para mostrar el menú */ 
        Menu.muestraMenu(listaCandidatos,listaPuestos); 
    }
    
    
}
