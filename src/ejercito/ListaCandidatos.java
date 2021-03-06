package ejercito;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author christian
 */
public class ListaCandidatos {
    
    private final String fichero_candidato = "./src/ejercito/candidatos.txt";
    
    ArrayList<Candidato> arrayCandidatos = new ArrayList<>();

    /**
     * ListaCandidatos: se encarga de leer el archivo candidatos.txt
     * Cada linea del archivo lo introduce en un array temporal [tempCandidato],
     * donde se usa el signo de punto y coma para separar cada campo. 
     * Posteriormente se introducen los datos de este array en orden el constructor 
     * Candidato para añadir un objeto Candidato en el ArrayList con sus datos reales.
     */
    public void ListaCandidatos() {
        
        BufferedReader br = null;
        String linea;
        String separador = ";";

	try
    {

		br = new BufferedReader(new FileReader(fichero_candidato));
		
        while ((linea = br.readLine()) != null) {
            
			String[] tempCandidato = linea.split(separador);
            
            arrayCandidatos.add(new Candidato(tempCandidato[0],tempCandidato[1],tempCandidato[2],
                                tempCandidato[3],Double.parseDouble(tempCandidato[4]), tempCandidato[5],
                                tempCandidato[6],tempCandidato[7],"null"));
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
     * Método que ordena el arrayCandidatos por nota de mayor a menor.
     * Hace uso del método sort de Collections junto con el Comparator
     * modificado para trabajar sobre nuestra clase Candidato.
     * 
     * Compara c2 a c1 para que sea descendente.
     * De menor a mayor sería comparando c1 a c2
     */
    public void ordenarCandidatos(){  
        
        Collections.sort(arrayCandidatos, new Comparator<Candidato>() {
            @Override
            public int compare( Candidato c1, Candidato c2) {
               
                return new Double(c2.getNotaMedia()).compareTo(c1.getNotaMedia());
            }
        });
    }
    /**
     * Método que asigna candidatos a puestos libres según preferencia.
     * Es un doble for-loop que recorre el arrayCandidados (Ya ordenado desde
     * el Main), y el arrayPuestos.
     * 
     * Inicialmente introduce le código 0?000/000 con la primera lectura. 
     * Después modifica el destino del Candidato si hay alguna igualdad 
     * de preferencia con destino libre.
     * 
     * @param arrayPuestos
     */
    public void Asignar(ArrayList<Puesto> arrayPuestos) {
        
        for (int i=0; i<  arrayCandidatos.size(); i++) { //bucle de candidatos
            
            ArrayList<String> arrPrefs = new ArrayList<>();  //ArrayList temporal para las tres preferencias
            arrPrefs.add(arrayCandidatos.get(i).getPreferencia1());
            arrPrefs.add(arrayCandidatos.get(i).getPreferencia2());
            arrPrefs.add(arrayCandidatos.get(i).getPreferencia3());
            
            Boolean candidatoSinAsignar = true; //control de flujo
            
            for (int j=0; j< arrPrefs.size(); j++) { // bucle de preferencias 
                
                for (int k=0; (k < arrayPuestos.size()) && (candidatoSinAsignar == true) ; k++){ // bucle destinos 
                    
                    String getC = arrayPuestos.get(k).getCodigo(); // var temporal con el código del puesto 
                    
                    if (arrPrefs.get(j).equals(getC) 
                            && (candidatoSinAsignar == true)
                            && (arrayPuestos.get(k).getDisponible() == true) ){
                        arrayCandidatos.get(i).setDestino( getC );   // asignar destino
                        arrayPuestos.get(k).setDisponible(false);
                        candidatoSinAsignar = false;
                    }
                }
            }
        }
    }
    
    /**
     * Método que muestra por pantalla información de todos los candidatos
     * 
     */
    public void mostrarCandidatos(){
        for (Candidato arrayCandidato : arrayCandidatos) {
            System.out.println(arrayCandidato.toString());
        }
    }

}

