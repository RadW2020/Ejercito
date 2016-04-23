package ejercito;

import java.io.*;
import java.util.ArrayList;

public class ListaPuestos {
    
    private final String fichero_puesto = "./src/ejercito/puestos.txt";
    
    ArrayList<Puesto> arrayPuestos = new ArrayList<>();
    /**
     * ListaPuestos: se encarga de leer el archivo puestos.txt
     * Cada linea del archivo lo introduce en un array temporal [tempPuesto],
     * donde se usa el signo de punto y coma para separar cada campo. 
     * Posteriormente se introducen los datos de este array en orden el constructor 
     * Puesto para añadir un objeto Puesto en el ArrayList con sus datos reales.
     */
    public void ListaPuestos() {
        
        BufferedReader br = null;
        String linea;
        String separador = ";";

	try
    {
		br = new BufferedReader(new FileReader(fichero_puesto));
		while ((linea = br.readLine()) != null) {
            
			String[] tempPuesto = linea.split(separador);
            
            arrayPuestos.add(new Puesto(tempPuesto[0],tempPuesto[1], tempPuesto[2], true));
		}

	} catch (FileNotFoundException e) {
		e.printStackTrace();
        System.out.println("Error: El fichero no existe. ");
	} catch (IOException e) {
		e.printStackTrace();
        System.out.println("Error: Fallo en la lectura del fichero. ");
	} finally {
		if (br != null) {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
   
    }
    
    /**
     * método que mustra por pantalla información de todos los puestos
     * contenidos en el arrayPuestos
     */
    public void mostrarPuestos(){
        for (int i=0; i< arrayPuestos.size(); i++){
            System.out.println(arrayPuestos.get(i).toString());
        }
    }
    
    /**
     * método que mustra por pantalla información de todos los puestos
     * sin asignar contenidos en el arrayPuestos
     */
    public void mostrarPuestosSinAsignar(){
        for (int i=0; i< arrayPuestos.size(); i++){
            if (arrayPuestos.get(i).getDisponible() == true){
                System.out.println(arrayPuestos.get(i).toString());
            }
        }
    }
}
